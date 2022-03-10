package singleton;

public class Singleton04 {
    private static Singleton04 instance;
    private Singleton04(){

    }
    public static Singleton04 getInstance(){
        if(instance==null){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Singleton04();
        }
        return instance;
    }
}
