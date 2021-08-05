package tdd.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;
    @BeforeEach
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void should_return_special_number_given_special_number_is_not_a_multiple_of_any_special_number() {
        String specialNumber = "2";
        assertThat(fizzBuzz.countOff(specialNumber)).isEqualTo("2");
    }

    @Test
    void should_return_Fizz_given_special_number_is_a_multiple_of_three() {
        String specialNumber = "3";
        assertThat(fizzBuzz.countOff(specialNumber)).isEqualTo("Fizz");
    }

    @Test
    void should_return_Buzz_given_special_number_is_a_multiple_of_five() {
        String specialNumber = "5";
        assertThat(fizzBuzz.countOff(specialNumber)).isEqualTo("Buzz");
    }
}
