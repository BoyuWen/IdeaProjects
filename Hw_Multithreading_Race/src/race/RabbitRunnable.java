package race;

//import java.lang.Object;
/**
 * Created by Dr.Wen on 2017/5/11.
 */
public class RabbitRunnable implements Runnable{
    private int step = 500;
    private int length;//赛道长度
    private int distance = 0;//已跑距离
    public static boolean done = false;//是否跑完
    //
    public RabbitRunnable(int y){
        length = y;
    }
    public void run(){
        try{
            while (distance < length){
                for(int i=0;i<100;i++){
                    distance += step;
                }
                Thread.sleep(1);
            }
        }catch(InterruptedException e){}
        done = true;
        if(!TortoiseRunnable.done){
            System.out.println("兔子赢了");
        }
    }
}
