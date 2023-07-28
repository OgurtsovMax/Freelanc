package ru.netology.services;

public class WeekendService {
    public int calculate(int income, int expenses, int threshold) {

        int count = 0;

        for (int month = 0; month < 12; month++) {
            if (threshold >=20_000) {

                threshold = (threshold - expenses) / 3;
                count++;

            } else {

                threshold = threshold + income - expenses;
            }


        }
        return count;
    }
}











