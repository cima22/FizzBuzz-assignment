package dssc.assignment.fizzbuzz;

public class FizzBuzz {

    public static void main(String... args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for(int i = 1; i <= 105; i++)
            System.out.println(fizzBuzz.computeNumber(i));
    }

    public String fizzable(int i) {
        return i % 3 == 0 ? "Fizz" : "";
    }

    public String buzzable(int i) {
        return i % 5 == 0 ? "Buzz" : "";
    }

    public String bangable(int i) {
        return i % 7 == 0 ? "Bang" : "";
    }

    public String computeNumber(int num) {
        String out = "";
        out += fizzable(num);
        out += buzzable(num);
        out += bangable(num);
        out += out.isEmpty() ? num : "";
        return out;
    }
}
