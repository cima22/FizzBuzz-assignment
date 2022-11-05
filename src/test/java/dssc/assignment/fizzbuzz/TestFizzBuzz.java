package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFizzBuzz {
    @Test
    void is_3_Fizz() {
        // Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 3;
        // Act
        String res = fizzBuzz.fizzable(num);
        // Assert
        assertEquals("Fizz",res);
    }

    @Test
    void is_5_not_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 5;
        String res = fizzBuzz.fizzable(num);
        assertEquals("",res);
    }

    @Test
    void is_5_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 5;
        String res = fizzBuzz.buzzable(num);
        assertEquals("Buzz",res);
    }

    @Test
    void is_3_not_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 3;
        String res = fizzBuzz.buzzable(num);
        assertEquals("",res);
    }

    @Test
    void is_3_computable() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 3;
        String res = fizzBuzz.computeNumber(num);
        assertEquals("Fizz",res);
    }

    @Test
    void is_5_computable() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 5;
        String res = fizzBuzz.computeNumber(num);
        assertEquals("Buzz",res);
    }

    @Test
    void is_15_computable() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 15;
        String res = fizzBuzz.computeNumber(num);
        assertEquals("FizzBuzz",res);
    }

    @Test
    void is_7_computable() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 7;
        String res = fizzBuzz.computeNumber(num);
        assertEquals("Bang",res);
    }

    void is_35_computable() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 7;
        String res = fizzBuzz.computeNumber(num);
        assertEquals("BuzzBang",res);
    }

    void is_13_computable() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int num = 7;
        String res = fizzBuzz.computeNumber(num);
        assertEquals("13",res);
    }
}
