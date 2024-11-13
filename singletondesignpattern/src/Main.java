public class Main {
    public static void main(String[] args) {

        for(double i=0;i<10000;i+=0.0001){
            System.out.println("Hello world!" + Singleton.getInstance("Hello there"));
            System.out.println("Hello world!" + Singleton.getInstance("Hello there"));
        }

       // System.out.println("Hello world!" + new Singleton("adas"));
    }
}