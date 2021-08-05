package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(String specialNumber) {
        String word = "";
        int convertedNum = Integer.parseInt(specialNumber);
        if (convertedNum % 3 == 0) {
            word += "Fizz";
        }
        return word.length() == 0 ? specialNumber : word;
    }
}
