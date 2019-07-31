package com.ck.note.schema_sync.pojo;
import com.ck.note.schema_sync.enums.Action;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName SyncActionDTO
 * @Author 小鬼
 * @Date 2019/7/30 20:58
 * @Description
 * @Version V1.0
 **/
@Setter
@Getter
@ToString
//@Builder
public class SyncActionDTO {
    // jdbc:mysql:127.0.0.1:3306/db
    private  ConnectDTO src;
    private  ConnectDTO dst;
    private Action action;

    public static SyncActionDTO of() {
        return new SyncActionDTO();
    }

}
