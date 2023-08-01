package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        WeekendService service = new WeekendService();

        System.out.println(service.calculate(10_000, 3_000, 20_000));

    }

}
