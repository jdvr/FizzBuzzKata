package es.fizzbuzz;

import java.util.stream.Collectors;

public class FizzBuzz {

    private Rules rules = new Rules();
    private RuleMapper mapper = new RuleMapper();

    public String play(Input input) {
        String appliedRules = applyRules(input);
        if(appliedRules.isEmpty()) return input.toString();
        return appliedRules;
    }

    private String applyRules(Input input) {
        return rules.obtainAll()
                .filter(rule -> rule.apply(input))
                .map(mapper::map)
                .map(OutputWord::toString)
                .collect(Collectors.joining());
    }

}
