package AutomatedTesting.FizzBuzz;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {
    @Test
    void translate0() {
        String expected = "FizzBuzz";
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate(15,"");
        fizzBuzzTranslate.traslate();

        assertEquals(expected,fizzBuzzTranslate.getResult());
    }

    @Test
    void translate1() {
        String expected = "Fizz";
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate(9,"");
        fizzBuzzTranslate.traslate();

        assertEquals(expected,fizzBuzzTranslate.getResult());
    }

    @Test
    void translate2() {
        String expected = "Buzz";
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate(10,"");
        fizzBuzzTranslate.traslate();

        assertEquals(expected,fizzBuzzTranslate.getResult());
    }

    @Test
    void translate3() {
        String expected = "một sáu";
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate(16,"");
        fizzBuzzTranslate.traslate();

        assertEquals(expected,fizzBuzzTranslate.getResult());
    }


}