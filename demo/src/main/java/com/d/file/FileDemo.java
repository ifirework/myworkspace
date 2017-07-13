package com.d.file;

import io.netty.buffer.ByteBuf;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Administrator on 2017/7/12.
 */
public class FileDemo {

    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("E:\\resin-4.0.38\\webapps\\file\\name.txt");
            FileOutputStream out = new FileOutputStream("E:\\resin-4.0.38\\webapps\\file\\name2.txt");
            FileChannel incha = in.getChannel();
            FileChannel outcha = out.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            while (-1!=incha.read(buffer)){
                buffer.flip() ;
                outcha.write(buffer) ;
                buffer.clear() ;

            }

            outcha.close();
            incha.close();
            out.close();
            in.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void readFile(){

        try {
            BufferedReader bufferReader;
            bufferReader = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\resin-4.0.38\\webapps\\file\\name.txt"),"GB2312"));
            String line="" ;
            while((line = bufferReader.readLine())!=null){

                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
