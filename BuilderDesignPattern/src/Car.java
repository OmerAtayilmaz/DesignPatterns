public class Car {
     String make;         // Marka
     String model;        // Model
     int year;            // Yıl
     String color;        // Renk
     double engineSize;   // Motor Hacmi
     int horsepower;      // Beygir Gücü
     String fuelType;     // Yakıt Türü
     int numberOfDoors;   // Kapı Sayısı
     boolean isAutomatic; // Otomatik mi?
     double mileage;      // Kilometre
     String vin;          // Araç Kimlik Numarası (VIN)
     String licensePlate; // Plaka
     boolean hasSunroof;  // Sunroof var mı?
     String owner;        // Sahibi
     boolean isInsured;   // Sigortalı mı?


     public String getMake() {
          return make;
     }

     public void setMake(String make) {
          this.make = make;
     }

     public String getModel() {
          return model;
     }

     public void setModel(String model) {
          this.model = model;
     }

     public int getYear() {
          return year;
     }

     public void setYear(int year) {
          this.year = year;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public double getEngineSize() {
          return engineSize;
     }

     public void setEngineSize(double engineSize) {
          this.engineSize = engineSize;
     }

     public int getHorsepower() {
          return horsepower;
     }

     public void setHorsepower(int horsepower) {
          this.horsepower = horsepower;
     }

     public String getFuelType() {
          return fuelType;
     }

     public void setFuelType(String fuelType) {
          this.fuelType = fuelType;
     }

     public int getNumberOfDoors() {
          return numberOfDoors;
     }

     public void setNumberOfDoors(int numberOfDoors) {
          this.numberOfDoors = numberOfDoors;
     }

     public boolean isAutomatic() {
          return isAutomatic;
     }

     public void setAutomatic(boolean automatic) {
          isAutomatic = automatic;
     }

     public double getMileage() {
          return mileage;
     }

     public void setMileage(double mileage) {
          this.mileage = mileage;
     }

     public String getVin() {
          return vin;
     }

     public void setVin(String vin) {
          this.vin = vin;
     }

     public String getLicensePlate() {
          return licensePlate;
     }

     public void setLicensePlate(String licensePlate) {
          this.licensePlate = licensePlate;
     }

     public boolean isHasSunroof() {
          return hasSunroof;
     }

     public void setHasSunroof(boolean hasSunroof) {
          this.hasSunroof = hasSunroof;
     }

     public String getOwner() {
          return owner;
     }

     public void setOwner(String owner) {
          this.owner = owner;
     }

     public boolean isInsured() {
          return isInsured;
     }

     public void setInsured(boolean insured) {
          isInsured = insured;
     }
}
