package decorator;

public class Iphone11 extends PhoneDecorator{
    public Iphone11(Iphone basicPhone){
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName()+" Pro";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+ 100;
    }

    @Override
    public int cameraCount() {
        return super.cameraCount();
    }
}