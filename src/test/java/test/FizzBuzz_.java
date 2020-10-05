package test;

import org.junit.Before;
import org.junit.Test;


import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assert.assertEquals;

public class FizzBuzz_ {
    /* 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz
    Múltiplos de 3 = Fizz; de 5 = Buzz; de 3 y 5 = FizzBuzz*/

    private FizzBuzz fizzBuzz;
    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_number_when_in_is_not_fizz_and_not_buzz() {
        //assertEquals(  "1",fizzBuzz.get(1));
        assertThat(fizzBuzz.of(1)).isEqualTo("1");
        assertThat(fizzBuzz.of(2)).isEqualTo("2");
        assertThat(fizzBuzz.of(4)).isEqualTo("4");

    }
    @Test
    public void should_return_fizz_when_it_is_multiple_of_3(){
        assertThat(fizzBuzz.of(3)).isEqualTo("Fizz");
    }
    @Test
    public void should_return_fizz_when_it_is_multiple_of_5(){
        assertThat(fizzBuzz.of(5)).isEqualTo("Buzz");
    }
    @Test
    public void should_return_fizz_when_it_is_multiple_of_15(){
        assertThat(fizzBuzz.of(15)).isEqualTo("FizzBuzz");
    }


    private static class FizzBuzz{
            public String of(int number) {
                if (isMultipleOf15(number)) return "FizzBuzz";
                if (isMultipleOf3(number)) return "Fizz";
                if (isMultipleOf5(number)) return "Buzz";
                return String.valueOf(number);
            }

        private boolean isMultipleOf15(int number) {
            return number % 15 == 0;
        }
        private boolean isMultipleOf3(int number){
                return number % 3 == 0;
            }
        private boolean isMultipleOf5(int number){
                return number % 5 == 0;
            }

    }

}
