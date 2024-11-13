/*
* only one instance can be created!
* constructor - private
* race condition --> 2 tane thread aynı anda erişirse ne olur?
* */

public class Singleton {
    public static volatile Singleton instance;
    public String message;

    private Singleton(String message){
        this.message = message;
    }
    public static Singleton getInstance(String message){
        Singleton result = instance;
        if(result == null){
            synchronized(Singleton.class){
                if(result == null){
                    instance = result = new Singleton(message);
                }
            }
        }


        return instance;
    }
}
