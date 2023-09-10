import seminarsfirst.model.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
    public static void main(String[] args) {

        // Проверки расчета скидки, с использованием AssertJ:
        assertThat(Calculator.calculatingDiscount(200.50, 50)).isEqualTo(100.25);
        assertThat(Calculator.calculatingDiscount(200.50, 0)).isEqualTo(200.50);

        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(0, 50)
        ).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(-1, 50)
        ).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(200.50, -1)
        ).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(200.50, 100)
        ).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(200.50, 101)
        ).isInstanceOf(ArithmeticException.class);
    }
}