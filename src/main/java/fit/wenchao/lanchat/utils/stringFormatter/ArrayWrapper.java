package fit.wenchao.lanchat.utils.stringFormatter;

public class ArrayWrapper<T> {

    T[] arr;

    public ArrayWrapper(T[] arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }
}