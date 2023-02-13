package fit.wenchao.lanchat.exception;

import fit.wenchao.lanchat.constants.RespCode;


public class BackendException extends RuntimeException{
    private Object data;
    private String code;
    private String msg;

    

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public BackendException (Object data, RespCode respCode) {
        this.data = data;
        this.code = respCode.getCode();
        this.msg = respCode.getMsg();
    }

    public BackendException (Throwable cause, Object data, RespCode respCode) {
        super(cause);
        this.data = data;
        this.code = respCode.getCode();
        this.msg = respCode.getMsg();
    }
}
