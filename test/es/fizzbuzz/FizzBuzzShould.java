package es.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzShould {

    @Test
    public void return_one_when_input_is_one(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(new Input(1));
        assertThat(result, is("1"));
    }

    @Test
    public void return_two_when_input_is_two(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(new Input(2));
        assertThat(result, is("2"));
    }

    @Test
    public void return_fizz_when_input_is_three(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(new Input(3));
        assertThat(result, is("fizz"));
    }

    @Test
    public void return_buzz_when_input_is_five(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(new Input(5));
        assertThat(result, is("buzz"));
    }

    @Test
    public void return_fizz_when_input_is_six(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(new Input(6));
        assertThat(result, is("fizz"));
    }

    @Test
    public void return_whizz_when_input_is_seven(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(new Input(7));
        assertThat(result, is("whizz"));
    }

    @Test
    public void return_buzz_when_input_is_ten(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(new Input(10));
        assertThat(result, is("buzz"));
    }

    @Test
    public void return_whizz_when_input_is_fourteen(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(new Input(14));
        assertThat(result, is("whizz"));
    }

    @Test
    public void return_fizzbuzz_when_input_is_fifteen(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(new Input(15));
        assertThat(result, is("fizzbuzz"));
    }

    @Test
    public void return_fizzwhizz_when_input_is_twentyOne(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(new Input(21));
        assertThat(result, is("fizzwhizz"));
    }

    @Test
    public void return_fizzbuzzwhizz_when_input_is_twoHundredTen(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(new Input(210));
        assertThat(result, is("fizzbuzzwhizz"));
    }
}
