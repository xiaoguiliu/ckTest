package com.ck.note.schema_sync.enums;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName Action
 * @Author 小鬼
 * @Date 2019/7/30 22:37
 * @Description
 * @Version V1.0
 **/
public enum Action {
    /**
    * @Author 小鬼
    * @Date  2019/7/30 22:38
    * @Param
    * @return
    **/
    SYNC, DIFF, COPY;

    public static Action of(String action){
        if("sync".equals(action.toLowerCase())){
            return SYNC;
        }else if("diff".equals(action.toLowerCase())){
            return DIFF;
        }else if("copy".equals(action.toLowerCase())){
            return COPY;
        }else{
            throw new IllegalArgumentException("have not support this action:" + action);
        }
    }
}
