package hw2;

import org.junit.jupiter.api.Test;
import seminars.second.hw.Car;
import seminars.second.hw.Motorcycle;
import seminars.second.hw.Vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VehicleTest {
    Car car = new Car("LADA", "Granta", 2019);
    Motorcycle motorcycle = new Motorcycle("Harley", "Davidson", 2023);
    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        assertEquals(car.getNumWheels(), 4);
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    public void testCarSpeed() {
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    @Test
    public void testMotorcycleSpeed() {
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test
    public void testCarPark() {
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    @Test
    public void testMotorcyclePark() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}