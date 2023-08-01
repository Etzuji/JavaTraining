public class Pair<T> {

    private final T one;
    private final T theOther;

    public Pair(T one, T theOther) {
        this.one = one;
        this.theOther = theOther;
    }

    public T getOne() {
        return one;
    }

    public T getTheOther() {
        return theOther;
    }
}