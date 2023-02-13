package fit.wenchao.lanchat.exception;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)

public class ParameterCheckResult {

    JSONObject paramCheckMap = new JSONObject();

    public ParameterCheckResult() {
    }

    public ParameterCheckResult(JSONObject paramCheckMap) {
        this.paramCheckMap = paramCheckMap;
    }

    public void putResult(String field, String message) {
        paramCheckMap.put(field, message);
    }

    public JSONObject getParamCheckMap() {
        return paramCheckMap;
    }

    public void setParamCheckMap(JSONObject paramCheckMap) {
        this.paramCheckMap = paramCheckMap;
    }

    @Override
    public String toString() {
        return "ParameterCheckResult [paramCheckMap=" + paramCheckMap + "]";
    }
}