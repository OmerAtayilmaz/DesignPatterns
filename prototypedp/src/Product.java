public class Product implements Cloneable{


    public String name;

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
