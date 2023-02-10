package calculator;

import static java.lang.Double.parseDouble;

public class Calculator {

    public String add (final String number1, final String number2) {
        final double n1 = parseDouble(number1);
        final double n2 = parseDouble(number2);
        final double result = n1 + n2;

        return String.valueOf(result);
    }

    public String min (String number1, String number2){
        Double n1 = Double.parseDouble(number1);
        Double n2 = Double.parseDouble(number2);
        Double result = n1 - n2;

        return String.valueOf(result);
    }


    public String div (String number1, String number2) {
        Double n1 = Double.parseDouble(number1);
        Double n2 = Double.parseDouble(number2);
        Double result = n1/n2;
        return String.valueOf(result);
    }


    public String multi(String number1, String number2) {
        Double n1 = Double.parseDouble(number1);
        Double n2 = Double.parseDouble(number2);
        Double result = n1*n2;

        return String.valueOf(result);
    }
}
