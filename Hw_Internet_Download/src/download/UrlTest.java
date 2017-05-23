package download;

import java.util.Scanner;

/**
 * Created by Dr.Wen on 2017/5/19.
 */
public class UrlTest {
    public static void main(String[] args){
        for (int i=0;i<2;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入图片保存路径：");
            String address = sc.nextLine();
            System.out.println("请输入图片获取链接：");
            String url = sc.nextLine();
            new Thread(new DownloadRunnable(url,address)).start();
            new Thread(new DownloadRunnable(url,address)).start();
        }
    }
}