public class Main {
    public static void main(String[] args) {

        //Car --> CarFactory, CarBuilder, 
        //Product --> ProductFactory, ProductBuilder
        //Company --> CompanyFactory, CompanyBuidler

        Car c1 = new CarBuilder()
                .color("red")
                .engineSize(500d)
                .fuelType("motorin")
                .build();

        // Product p1 = new ProductBuilder()



    }
}