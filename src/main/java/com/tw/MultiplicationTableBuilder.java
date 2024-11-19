package com.tw;

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
        return "";
    }
}
