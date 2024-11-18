package decorator;

public class Runner {
    public static void main(String[] args) {
        
        Phone p=new Iphone11ProMax(new Iphone());
        System.out.println(p.getName());
        System.out.println(p.getPrice());
        System.out.println(p.cameraCount());

    }
}