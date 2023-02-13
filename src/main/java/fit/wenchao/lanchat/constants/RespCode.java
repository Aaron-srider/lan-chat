package fit.wenchao.lanchat.constants;

public enum RespCode {
    SUCCESS("success"),

    NO_FILE("file not found"),

    FRONT_END_PARAMS_ERROR("front end param error"),

    ///////////////////////// file upload ////////////////////////////
    UPLOAD_FILE_SIZE_EXCEED_UPPER_LIMIT("upload file size too large"),
    UPLOAD_FILE_UNKNOWN_ERROR("unknown error happened when uploading file"),
    UPLOAD_FILE_MISSING("upload file missing"),

    DOWNLOAD_NOT_SUPPORT("file does not support download operation"),
    UPLOAD_DEST_ERROR("upload destination can only be dir"),
    FILE_ACCESS_DENIED("file access denied"),
    FILE_UPLOAD_ERROR("upload file error"),
    CONFIG_FILE_NOT_FOUND("config file not found"),
    NO_CONFIG_KEY("no config key"),
    ROOT_PATH_CONFIG_ERROR("root path config error"),
    MAX_UPLOAD_SIZE_TOO_LARGE("max upload size should less then 2G"),
    DISK_SCAN_ERROR("disk scan error"),
    FILE_TYPE_ERROR("file type error"),
    DIR_ANALYZE_NOT_SUPPORT("dir analyze not support");

    private String msg;

    public String getCode() {
        return name();
    }

    public String getMsg() {
        return msg;
    }

    RespCode(String message) {
        this.msg = message;
    }

}
