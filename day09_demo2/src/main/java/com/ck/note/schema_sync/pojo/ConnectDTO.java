package com.ck.note.schema_sync.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName ConnectDTO
 * @Author 小鬼
 * @Date 2019/7/30 21:02
 * @Description
 * @Version V1.0
 * params:链接对象封装
 **/
@Setter
@Getter
@ToString
@Builder
public class ConnectDTO {
    private String host;
    private Integer port;
    private String username;
    private String passwd;
    private String db;

    public static ConnectDTO of(){
        return new ConnectDTO();
    }
}
