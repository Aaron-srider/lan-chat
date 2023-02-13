package fit.wenchao.lanchat.utils.stringFormatter;

import java.util.Objects;

public class Entry {
    private Integer k;
    private Integer v;

    public Entry() {
    }

    public Entry(Integer k, Integer v) {
        this.k = k;
        this.v = v;
    }

    public Integer getK() {
        return this.k;
    }

    public void setK(Integer k) {
        this.k = k;
    }

    public Integer getV() {
        return this.v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public Entry k(Integer k) {
        setK(k);
        return this;
    }

    public Entry v(Integer v) {
        setV(v);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) o;
        return Objects.equals(k, entry.k) && Objects.equals(v, entry.v);
    }

    @Override
    public int hashCode() {
        return Objects.hash(k, v);
    }

    @Override
    public String toString() {
        return "{" +
            " k='" + getK() + "'" +
            ", v='" + getV() + "'" +
            "}";
    }

}
