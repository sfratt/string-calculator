package string.calculator;

import org.junit.*;

public class StringCalculatorTest {
    
    @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        StringCalculator.add("1,2");
        Assert.assertTrue(true);
    }
    
    @Test(expected = RuntimeException.class)
    public final void whenNonNumberIsUsedThenExceptionIsThrown() {
        StringCalculator.add("1,X");
    }

    @Test
    public final void whenEmptyStringIsUsedThenReturnValueIs0() {
        Assert.assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
        Assert.assertEquals(3, StringCalculator.add("3"));
    }

    @Test
    public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
        Assert.assertEquals(3+6, StringCalculator.add("3,6"));
    }

    @Test
    public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
        Assert.assertEquals(3+6+15+18+46+33, StringCalculator.add("3,6,15,18,46,33"));
    }

    @Test
    public final void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums() {
        Assert.assertEquals(3+6+15, StringCalculator.add("3, 6\n15"));
    }

    @Test
    public final void whenDelimiterSpaceIsSpecifiedThenItIsUsedToSeperateNumbers() {
        Assert.assertEquals(3+6+15, StringCalculator.add("//;\n3;6;15"));
    }

    @Test(expected = RuntimeException.class)
    public final void whenNegativeNumberIsUsedThenRuntimeExceptionIsThrown() {
        StringCalculator.add("3,-6,15,18,46,33");
    }

    @Test
    public final void whenNegativeNumbersAreUsedThenRuntimeExceptionIsThrown() {
        RuntimeException exception = null;

        try {
            StringCalculator.add("3,-6,15,-18,46,33");
        } catch (RuntimeException e) {
            exception = e;
        }

        Assert.assertNotNull(exception);
        Assert.assertEquals("Negatives not allowed: [-6, -18]", exception.getMessage());
    }
}
