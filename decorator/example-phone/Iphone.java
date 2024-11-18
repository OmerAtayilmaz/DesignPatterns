package decorator;

class Iphone implements Phone {
    @Override
    public String getName() {
        return "Iphone";
    }

    @Override
    public double getPrice() {
        return 599.00;
    }

    @Override
    public int cameraCount() {
        return 2;
    }
}