package fit.wenchao.lanchat.model;

import fit.wenchao.lanchat.constants.RespCode;

public class JsonResult {

    private Object data;

    private String code;
    private String msg;

    public JsonResult() {
    }

    public JsonResult(Object data, String code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static JsonResult of(Object data, RespCode respCode) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.data = data;
        jsonResult.code = respCode.getCode();
        jsonResult.msg = respCode.getMsg();
        return jsonResult;
    }

    public static JsonResult of(Object data, String code, String msg) {
        JsonResult jsonResult = new JsonResult();
        jsonResult.data = data;
        jsonResult.code = code;
        jsonResult.msg = msg;
        return jsonResult;
    }

    public static JsonResult ok() {
        return new JsonResult(null, RespCode.SUCCESS.getCode(), RespCode.SUCCESS.getMsg());
    }

    public static JsonResult ok(Object data) {
        return new JsonResult(data, RespCode.SUCCESS.getCode(), RespCode.SUCCESS.getMsg());
    }
}
