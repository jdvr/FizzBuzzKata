package es.fizzbuzz;

import java.util.HashMap;
import java.util.Map;

public class RuleMapper {
    private static final Map<Rule, OutputWord> mapper = new HashMap<Rule, OutputWord>(){{
       put(Rules.fizz, OutputWord.Fizz);
       put(Rules.buzz, OutputWord.Buzz);
       put(Rules.whizz, OutputWord.Whizz);
    }};

    public OutputWord map(Rule rule){
        OutputWord outputWord = mapper.get(rule);
        return outputWord == null ? OutputWord.Empty : outputWord;
    }
}

