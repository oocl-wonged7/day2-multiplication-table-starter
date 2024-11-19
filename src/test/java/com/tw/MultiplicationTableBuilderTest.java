package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MultiplicationTableBuilderTest {
    @Test
    void should_return_true_when_isInRange_given_a_number_5() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 5;

        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);

        // Then
        assertTrue(isInRange);
    }

    // TODO: add more tests for isInRange
    @Test
    void should_return_false_when_isInRange_given_a_number_0() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 0;

        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);

        // Then
        assertFalse(isInRange);
    }

    @Test
    void should_return_false_when_isInRange_given_a_number_1001() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 1001;

        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);

        // Then
        assertFalse(isInRange);
    }

    @Test
    void should_return_true_when_isStarterNotBiggerThanEnd_given_start_2_and_end_3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 3;

        // When
        boolean isStarterNotBiggerThanEnd = multiplicationTableBuilder.isStarterNotBiggerThanEnd(start, end);

        // Then
        assertTrue(isStarterNotBiggerThanEnd);
    }

    @Test
    void shoud_retrn_true_when_isStarterNotBiggerThanEnd_given_start_3_and_end_3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 3;
        int end = 3;

        // When
        boolean isStarterNotBiggerThanEnd = multiplicationTableBuilder.isStarterNotBiggerThanEnd(start, end);

        // Then
        assertTrue(isStarterNotBiggerThanEnd);
    }

    @Test
    void should_return_false_when_isStarterNotBiggerThanEnd_given_start_3_and_end_2() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 3;
        int end = 2;

        // When
        boolean isStarterNotBiggerThanEnd = multiplicationTableBuilder.isStarterNotBiggerThanEnd(start, end);

        // Then
        assertFalse(isStarterNotBiggerThanEnd);
    }

    @Test
    void should_return_true_when_isValid_given_start_2_and_end_3() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 3;

        // When
        boolean isValid = multiplicationTableBuilder.isValid(start, end);

        // Then
        assertTrue(isValid);
    }

    @Test
    void should_return_false_when_isValid_given_start_2_and_end_1() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 1;

        // When
        boolean isValid = multiplicationTableBuilder.isValid(start, end);

        // Then
        assertFalse(isValid);
    }

    @Test
    void should_return_false_when_isValid_given_start_0_and_end_2() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 0;
        int end = 2;

        // When
        boolean isValid = multiplicationTableBuilder.isValid(start, end);

        // Then
        assertFalse(isValid);
    }

    @Test
    void should_return_false_when_isValid_given_start_2_and_end_1001() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 1001;

        // When
        boolean isValid = multiplicationTableBuilder.isValid(start, end);

        // Then
        assertFalse(isValid);
    }

    @Test
    void should_return_correct_expression_when_generateExpression_given_input1_2_and_input2_4() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int input1 = 2;
        int input2 = 4;

        // When
        String expression = multiplicationTableBuilder.generateExpression(input1, input2);

        // Then
        String expectedExpression = "2*4=8";
        assertTrue(expression.equals(expectedExpression));
    }

    @Test
    void should_return_correct_line_when_generateLine_given_start_2_and_end_4() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;

        // When
        String line = multiplicationTableBuilder.generateLine(start, end);

        // Then
        String expectedLine = "2*4=8 3*4=12 4*4=16";
        assertTrue(line.equals(expectedLine));
    }

    @Test
    void should_return_correct_table_when_generateTable_given_start_2_and_end_4() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;

        // When
        String table = multiplicationTableBuilder.generateTable(start, end);

        // Then
        String expectedTable = "2*2=4\n2*3=6 3*3=9\n2*4=8 3*4=12 4*4=16";
        assertTrue(table.equals(expectedTable));
    }
}
