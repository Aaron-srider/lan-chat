package fit.wenchao.lanchat.utils.json;


public class Pair {

    String key;
    Object value;

    public Pair(String key, Object value) {
        this.key = key;
        this.value = value;
    }


    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

}
