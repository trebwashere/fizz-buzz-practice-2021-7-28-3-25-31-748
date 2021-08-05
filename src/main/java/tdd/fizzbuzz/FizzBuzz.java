package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(String specialNumber) {
        String word = "";
        int convertedNum = Integer.parseInt(specialNumber);
        word += evaluateMultipleThree(convertedNum);
        word += evaluateMultipleFive(convertedNum);
        word += evaluateMultipleSeven(convertedNum);
        return word.length() == 0 ? specialNumber : word;
    }

    public String evaluateMultipleThree(int num) {
        return num % 3 == 0 ? "Fizz" : "";
    }

    public String evaluateMultipleFive(int num) {
        return num % 5 == 0 ? "Buzz" : "";
    }

    public String evaluateMultipleSeven(int num) {
        return num % 7 == 0 ? "Whizz" : "";
    }
}
