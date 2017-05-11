package race;

//import java.lang.Object;
/**
 * Created by Dr.Wen on 2017/5/11.
 */
public class TortoiseRunnable implements Runnable{
    private int step = 1;
    private int length;
    private int distance = 0;
    public static boolean done = false;
    //
    public TortoiseRunnable(int y){
        length = y;
    }
    public void run(){
        while (distance < length){
            distance += step;
        }
        done = true;
        if(!RabbitRunnable.done){
            System.out.println("乌龟赢了");
        }
    }
}
