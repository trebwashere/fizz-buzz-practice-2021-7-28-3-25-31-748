package tdd.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Test
    void should_return_Buzz_given_special_number_is_a_multiple_of_seven() {
        String specialNumber = "7";
        assertThat(fizzBuzz.countOff(specialNumber)).isEqualTo("Whizz");
    }

    @Test
    void countOff_should_return_expected_output_given_combinations_of_numbers() {
        List<String> numbersList = Arrays.asList("1","3","5","7","9","12","15","18","21","22","23","24","25","26","27","28","29","30");
        List<String> expectedOutputList = Arrays.asList("1","Fizz","Buzz","Whizz","Fizz","Fizz","FizzBuzz",
                "Fizz","FizzWhizz","22","23","Fizz","Buzz","26","Fizz","Whizz","29","FizzBuzz");
        List<String> outputList = new ArrayList<>();
        for(String number : numbersList) {
            outputList.add(fizzBuzz.countOff(number));
        }
        assertThat(expectedOutputList.toString()).isEqualTo(outputList.toString());

    }
}
