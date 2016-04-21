package es.fizzbuzz;

public class Input {
    private final Integer content;

    public Input(Integer content) {
        this.content = content;
    }

    public Integer content() {
        return this.content;
    }

    @Override
    public String toString() {
        return content.toString();
    }

    boolean isDivisible(int divider) {
        return this.content % divider == 0;
    }
}
