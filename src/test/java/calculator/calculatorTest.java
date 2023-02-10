package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calculatorTest {

    @Test
    void Must_Add_Numbers() {

        Calculator calculator = new Calculator();

        String result = calculator.add ("5.3","-3");

        Assertions.assertEquals("2.3",result);
    }

    @Test
    void Must_Minus_Numbers() {
        Calculator calculator = new Calculator();

        String result = calculator.min("3.2", "8.5");

        Assertions.assertEquals("-5.3",result);
    }

    @Test
    void Must_Divide_Numbers() {
        Calculator calculator = new Calculator();

        String result = calculator.div("8","4");

        Assertions.assertEquals("2.0", result);
    }

    @Test
    void Must_Multiple_Numbers() {
        Calculator calculator = new Calculator();

        String result = calculator.multi("3.2","4");

        Assertions.assertEquals("12.8", result);
    }
}
