package com.tw;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplicationTableBuilder {
    public boolean isInRange(int number) {
        return number > 0 && number <= 1000;
    }
    public boolean isStarterNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }
    public boolean isValid(int start, int end) {
        return start > 1 && start <= 1000 && end > 1 && end <= 1000;
    }

    public String generateExpression(int input1, int input2) {
        return input1 + "*" + input2 + "=" + input1 * input2;
    }

    public String generateLine(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .mapToObj(i -> generateExpression(i, end))
                .collect(Collectors.joining(" "));
    }

    public String generateTable(int start, int end) {
        return IntStream.rangeClosed(start, end)
                .mapToObj(i -> generateLine(start, i))
                .collect(Collectors.joining("\n"));
    }
}
