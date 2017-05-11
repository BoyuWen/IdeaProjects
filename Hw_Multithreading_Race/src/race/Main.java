package race;

/**
 * Created by Dr.Wen on 2017/5/11.
 */
public class Main {
    public static final int LENGTH = 50000;
    public static void main(String[] args){
        new Thread(new RabbitRunnable(LENGTH)).start();
        new Thread(new TortoiseRunnable(LENGTH)).start();
    }
}
