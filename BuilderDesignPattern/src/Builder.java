public interface Builder {
    CarBuilder make(String make);
    CarBuilder model(String model);
    CarBuilder year(int year);
    CarBuilder color(String color);
    CarBuilder engineSize(double engineSize);
    CarBuilder horsepower(int horsepower);
    CarBuilder fuelType(String fuelType);
    CarBuilder numberOfDoors(int numberOfDoors);
    CarBuilder isAutomatic(boolean isAutomatic);
    CarBuilder mileage(double mileage);
    CarBuilder vin(String vin);
    CarBuilder licensePlate(String licensePlate);
    CarBuilder hasSunroof(boolean hasSunroof);
    CarBuilder owner(String owner);
    CarBuilder isInsured(boolean isInsured);
}
