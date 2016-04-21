package es.fizzbuzz;

@FunctionalInterface
public interface Rule {
    Boolean apply(Input input);
}
