package download;

import java.io.*;
import java.net.*;

/**
 * Created by Dr.Wen on 2017/5/19.
 */
public class DownloadRunnable implements Runnable{
    private String urlImg;
    private String addressImg;

    public DownloadRunnable(String a,String b){
        urlImg = a;
        addressImg = b;
    }
    @Override
    public void run() {
        try{
            URL url = new URL(urlImg);
            HttpURLConnection img = (HttpURLConnection)url.openConnection();

            InputStream input = img.getInputStream();
            OutputStream output = new FileOutputStream(addressImg);

            //byte[] bytes = new byte[14211];
            //int len = input.read(bytes);
            int date;
            int i = 0;
            while((date=input.read()) != -1){
                output.write(date);
            }
            //System.out.println(i);
//            for(int j=0;j<i;j++){
//                output.write(ints[j]);
//            }
            //output.write(bytes,0,14211);

            input.close();
            output.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
