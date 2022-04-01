package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void SqareСalculateMainParameters() {
        SQRService service = new SQRService();
        long min = 200;
        long max = 300;
        long expected = 3;
        long actual = service.SqareСalculate(min , max);
        assertEquals(expected, actual);
    }
    @Test
    void SqareСalculateExtraOptions() {
        SQRService service = new SQRService();
        long min = 400;
        long max = 600;
        long expected = 5;
        long actual = service.SqareСalculate(min , max);
        assertEquals(expected, actual);
    }
    @Test
    void SqareСalculateMinParameters() {
        SQRService service = new SQRService();
        long min = 1;
        long max = 3;
        long expected = 0;
        long actual = service.SqareСalculate(min , max);
        assertEquals(expected, actual);
    }
    @Test
    void SqareСalculateMaxParameters() {
        SQRService service = new SQRService();
        long min = 1;
        long max = 300000;
        long expected = 90;
        long actual = service.SqareСalculate(min , max);
        assertEquals(expected, actual);
    }
    @Test
    void SqareСalculateOneParameters() {
        SQRService service = new SQRService();
        long min = 100;
        long max = 110;
        long expected = 1;
        long actual = service.SqareСalculate(min , max);
        assertEquals(expected, actual);
    }
}