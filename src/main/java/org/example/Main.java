package org.example;

import io.IO;
import io.IOProcessor;
import functions.CarsFunctionProcessor;
import functions.CarsFunctions;
import processor.CarsList;

import java.io.*;
import java.util.Scanner;

public class Main implements Serializable {
    public static void main(String[] args) {
        new Main().run();
    }
    private void menu() {
        System.out.println("\nОберіть потрібний вам функціонал: ");
        System.out.println("1 - Створити список автомобілів.");
        System.out.println("2 - Вивести список всіх автомобілів.");
        System.out.println("3 - Список автомобілів заданої моделі в порядку зростання року випуску.");
        System.out.println("4 - Список автомобілів заданої моделі, які експлуатуються більше заданих років.");
        System.out.println("5 - Список автомобілів заданого року випуску, ціна яких більше вказаної.");
        System.out.println("6 - Список автомобілів в порядку спадання ціни. Якщо ціна однакова,\n" +
                " то в порядку зростання року випуску");
        System.out.println("7 - Додати автомобіль до списку.");
        System.out.println("8 - Видалити зі списку за номером.");
        System.out.println("9 - Прочитати файл.");
        System.out.println("10 - Зберегти файл.");
        System.out.println("11 - Вихід.\n");
        System.out.println("Введіть ваш запит: ");
    }
    private void run() {
        CarsFunctions carsFunctions = new CarsFunctionProcessor();
        IO io = new IOProcessor();
        CarsList cars = new CarsList();
        Scanner scanner = new Scanner(System.in);
        boolean status = true;
        menu();
        while (status) {
            int request = scanner.nextInt();
            switch (request) {
                case 1 -> carsFunctions.createCarsArray(cars);
                case 2 -> carsFunctions.printCarsList(cars);
                case 3 -> carsFunctions.printCarOfTheSameModelByReleaseYear(cars, scanner);
                case 4 -> carsFunctions.printModelInUseMoreThenYears(cars, scanner);
                case 5 -> carsFunctions.printReleaseYearWithPriceMoreThen(cars, scanner);
                case 6 -> carsFunctions.sortByPrice(cars, scanner);
                case 7 -> carsFunctions.addNewCar(cars, scanner);
                case 8 -> carsFunctions.deleteElementById(cars, scanner);
                case 9 -> cars.setCarsList(io.readObjects(cars));
                case 10 -> io.writeObjects(cars);
                case 11 -> status = false;
            }
        }
    }
}