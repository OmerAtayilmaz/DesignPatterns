public class Bus extends Vehicle {
    public int doors;

    public Bus(String brand,String model,String color,int doors){
        super(brand,model,color);
        this.doors = doors;
    }

    public Bus(Bus bus) {
        super(bus);
        this.doors = bus.doors;
    }

    @Override
    public Bus clone() {
        return new Bus(this);
    }
}
