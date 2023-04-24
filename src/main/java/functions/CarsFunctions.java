package functions;

import processor.CarsList;

import java.util.Scanner;

public interface CarsFunctions {
    void createCarsArray(CarsList cars);
    void printCarsList(CarsList cars);
    void addNewCar(CarsList cars, Scanner scanner);
    void deleteElementById(CarsList cars, Scanner scanner);
    void printCarOfTheSameModelByReleaseYear(CarsList cars, Scanner scanner);
    void printModelInUseMoreThenYears(CarsList cars, Scanner scanner);
    void printReleaseYearWithPriceMoreThen(CarsList cars, Scanner scanner);
    void sortByPrice(CarsList cars, Scanner scanner);
}