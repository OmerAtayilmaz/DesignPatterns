public class CarBuilder implements Builder{
    private String make;         // Marka
    private String model;        // Model
    private int year;            // Yıl
    private String color;        // Renk
    private double engineSize;   // Motor Hacmi
    private int horsepower;      // Beygir Gücü
    private String fuelType;     // Yakıt Türü
    private int numberOfDoors;   // Kapı Sayısı
    private boolean isAutomatic; // Otomatik mi?
    private double mileage;      // Kilometre
    private String vin;          // Araç Kimlik Numarası (VIN)
    private String licensePlate; // Plaka
    private boolean hasSunroof;  // Sunroof var mı?
    private String owner;        // Sahibi
    private boolean isInsured;   // Sigortalı mı?


    public CarBuilder make(String make){
        this.make = make;
        return this;
    }
    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder year(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder engineSize(double engineSize) {
        this.engineSize = engineSize;
        return this;
    }

    public CarBuilder horsepower(int horsepower) {
        this.horsepower = horsepower;
        return this;
    }

    public CarBuilder fuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public CarBuilder numberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public CarBuilder isAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
        return this;
    }

    public CarBuilder mileage(double mileage) {
        this.mileage = mileage;
        return this;
    }

    public CarBuilder vin(String vin) {
        this.vin = vin;
        return this;
    }

    public CarBuilder licensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
        return this;
    }

    public CarBuilder hasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
        return this;
    }

    public CarBuilder owner(String owner) {
        this.owner = owner;
        return this;
    }

    public CarBuilder isInsured(boolean isInsured) {
        this.isInsured = isInsured;
        return this;
    }

    public Car build() {
        Car car = new Car();
        car.make = this.make;
        car.model = this.model;
        car.year = this.year;
        car.color = this.color;
        car.engineSize = this.engineSize;
        car.horsepower = this.horsepower;
        car.fuelType = this.fuelType;
        car.numberOfDoors = this.numberOfDoors;
        car.isAutomatic = this.isAutomatic;
        car.mileage = this.mileage;
        car.vin = this.vin;
        car.licensePlate = this.licensePlate;
        car.hasSunroof = this.hasSunroof;
        car.owner = this.owner;
        car.isInsured = this.isInsured;
        return car;
    }
}
