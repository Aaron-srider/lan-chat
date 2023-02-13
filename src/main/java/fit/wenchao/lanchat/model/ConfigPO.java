package fit.wenchao.lanchat.model;

import java.util.Objects;

public class ConfigPO {
    private String key;
    private String value;


    public ConfigPO() {
    }

    public ConfigPO(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ConfigPO key(String key) {
        setKey(key);
        return this;
    }

    public ConfigPO value(String value) {
        setValue(value);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ConfigPO)) {
            return false;
        }
        ConfigPO configPO = (ConfigPO) o;
        return Objects.equals(key, configPO.key) && Objects.equals(value, configPO.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return "{" +
            " key='" + getKey() + "'" +
            ", value='" + getValue() + "'" +
            "}";
    }

}
