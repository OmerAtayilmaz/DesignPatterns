public class Car extends Vehicle{

    public int topSpeed;

    public Car(String brand,String model,String color,int topSpeed){
        super(brand,model,color);
        this.topSpeed = topSpeed;
    }
    protected Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
    }

    @Override
    public Car clone() {
       return new Car(this);
    }
}
