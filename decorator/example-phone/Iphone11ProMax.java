package decorator;


public class Iphone11ProMax extends Iphone11Pro{
    public Iphone11ProMax(Iphone basicPhone){
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName()+" Max";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+ 200;
    }

    @Override
    public int cameraCount() {
        return super.cameraCount()+2;
    }
}