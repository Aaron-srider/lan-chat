package fit.wenchao.lanchat.exception;

public class TOTPEmptyKeyException  extends  RuntimeException{
    public TOTPEmptyKeyException(String message) {
        super(message);
    }
}
