package fit.wenchao.lanchat.function;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t) throws Exception;
}
