package test;

import main.FizzBuzzCalculator;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzCalculatorMust {

    @Test
    public void returnOneWhenPassedOne(){
        // Arrange
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();

        // Act
        String result = fizzBuzzCalculator.calculate(1);

        // Assert
        Assert.assertEquals("1", result);
    }

    @Test
    public void returnTwoWhenPassedTwo(){
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();

        String result = fizzBuzzCalculator.calculate(2);

        Assert.assertEquals("2", result);
    }

    @Test
    public void returnFizzWhenPassedThree(){
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();

        String result = fizzBuzzCalculator.calculate(3);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void returnFizzWhenPassedSix()
    {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();

        Assert.assertEquals("Fizz", fizzBuzzCalculator.calculate(6));
    }

    @Test
    public void returnFizzWhenPassedNumberDivisibleByThree()
    {
        FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();

        Assert.assertEquals("Fizz", fizzBuzzCalculator.calculate(9));
    }
}
