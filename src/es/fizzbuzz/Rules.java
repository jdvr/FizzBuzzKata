package es.fizzbuzz;

import java.util.Arrays;
import java.util.stream.Stream;

public class Rules {
    public static final Rule fizz = input -> input.isDivisible(3);
    public static final Rule buzz = input -> input.isDivisible(5);
    public static final Rule whizz = input -> input.isDivisible(7);

    private final Rule[] rules = new Rule[]{fizz, buzz, whizz};

    public Stream<Rule> obtainAll(){
        return Arrays.stream(rules);
    }

}
