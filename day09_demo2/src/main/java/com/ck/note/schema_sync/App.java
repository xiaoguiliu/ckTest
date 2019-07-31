package com.ck.note.schema_sync;

import com.ck.note.schema_sync.enums.Action;
import com.ck.note.schema_sync.pojo.ConnectDTO;
import com.ck.note.schema_sync.pojo.SyncActionDTO;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName App
 * @Author 小鬼
 * @Date 2019/7/30 20:32
 * @Description
 * @Version V1.0
 **/
@Slf4j
public class App {
    public static void main(String[] args) {
        start(args);
    }
    
    public static void start(String [] args) {
        log.info("db schema sync start");
        System.out.println("db schema sync start");

        // TODO: 2019/7/30  传入参数校验 个数、类型、格式
        //args -> SyncActionDTO
        SyncActionDTO actionDTO = parse(args);
    }

    private static SyncActionDTO parse(String[] args) {
        SyncActionDTO syncActionDTO = SyncActionDTO.of();
        ConnectDTO src = ConnectDTO.of();
        src.setHost("127.0.0.1");
        src.setPort(3306);
        src.setUsername("root");
        src.setPasswd("123456");

        ConnectDTO dst = ConnectDTO.of();
        dst.setHost("127.0.0.1");
        dst.setPort(3366);
        dst.setUsername("root");
        dst.setPasswd("123456");

        syncActionDTO.setSrc(src);
        syncActionDTO.setDst(dst);
        syncActionDTO.setAction(Action.SYNC);

        return  syncActionDTO;

    }

}