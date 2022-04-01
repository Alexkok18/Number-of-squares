package ru.netology.sqr;

public class SQRService {
    public long SqareСalculate(long min, long max) {
        int counter = 0;
        for (int i = 10; i >= 10 && i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                counter++;
            }
        }
        System.out.println("Подходящих результатов: " + counter);
        return counter;
    }
}