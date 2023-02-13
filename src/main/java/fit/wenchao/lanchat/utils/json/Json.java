package fit.wenchao.lanchat.utils.json;

import com.alibaba.fastjson.JSONObject;

public class Json {

    public static JSONObject json(Pair... pairs) {
        JSONObject json = new JSONObject();
        for (Pair pair : pairs) {
            json.put(pair.getKey(), pair.getValue());
        }
        return json;
    }

    public static Pair pair(String key, Object value) {
        return new Pair(key, value);
    }

}
