package io;

import processor.Car;
import processor.CarsList;

public interface IO {
    Car[] readObjects(CarsList cars);
    void writeObjects(CarsList cars);
}