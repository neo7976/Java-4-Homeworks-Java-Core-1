package task2;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String message);
}
