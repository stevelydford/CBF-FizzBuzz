package main;

public class FizzBuzzCalculator {
    public String calculate(int number) {
        if(number % 3 == 0){
            return "Fizz";
        }

        return Integer.toString(number);
    }
}
