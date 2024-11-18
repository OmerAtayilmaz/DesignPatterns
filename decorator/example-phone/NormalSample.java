package decorator;

public class NormalSample {
    
    public static class Iphone11{
        String name(){
            return "Iphone 11";
        }
        int getCameraCount(){
            return 2;
        }   
    }
    public static class Iphone11Pro{
        String name(){
            return "Iphone 11 Pro";
        }
        int getCameraCount(){
            return 3;
        }   
    }
    public static class Iphone11Max{
        String name(){
            return "Iphone 11 Pro Max";
        }
        int getCameraCount(){
            return 3;
        }   
    }
}