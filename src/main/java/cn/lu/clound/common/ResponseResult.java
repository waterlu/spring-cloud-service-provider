package cn.lu.clound.common;

/**
 * Created by lutiehua on 2017/10/9.
 */
public class ResponseResult {

    private int code;

    private String msg;

    private Object data;

    public ResponseResult() {
        this.code = 200;
        this.msg = "";
        this.data = null;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
