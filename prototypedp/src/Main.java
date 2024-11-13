import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Car c1 = new Car("Porche","2019","Black",500);
        Bus b1 = new Bus("Ferrari","1991","Red",2);

        Car c2 = c1.clone();
        Bus b2 = b1.clone();

        //Modern Çözümler :)

        Product p1 = new Product("Telefon");
        Product p2 = (Product) p1.clone();

        System.out.println(p1);
        System.out.println(p2);

        //Süre Hesabı ?? Aslında ilkel olan daha iyi ancak mode



    }
}