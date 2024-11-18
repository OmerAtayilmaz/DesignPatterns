package decorator;

public class Iphone11Pro extends PhoneDecorator {
    public Iphone11Pro(Iphone basicPhone){
        super(basicPhone);
    }
    @Override
    public double getPrice() {
        return super.getPrice()+100;
    }

    @Override
    public String getName() {
        return super.getName()+" Pro";
    }

    @Override
    public int cameraCount() {
        return super.cameraCount()+1;
    }
}