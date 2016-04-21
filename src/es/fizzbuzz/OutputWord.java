package es.fizzbuzz;

/**
 * Created by jdvr on 21/04/16.
 */
public enum OutputWord {

    Fizz("fizz"),
    Buzz("buzz"),
    Whizz("whizz"),
    Empty("");

    private String value;

    OutputWord(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
