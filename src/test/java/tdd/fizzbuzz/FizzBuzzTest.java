package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {

    @Test
    void should_return_special_number_given_special_number_is_not_a_multiple_of_any_special_number() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String specialNumber = "2";
        assertThat(fizzBuzz.countOff(specialNumber)).isEqualTo("2");
    }
}
