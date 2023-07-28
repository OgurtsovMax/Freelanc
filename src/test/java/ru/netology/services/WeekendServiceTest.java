package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class WeekendServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/weekend.csv")
    public void testWeekendInYear(int income, int expense, int threshold, int expected) {
        WeekendService service = new WeekendService();

        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);


    }
}

