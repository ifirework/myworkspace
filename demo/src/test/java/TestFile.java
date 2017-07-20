import com.d.file.FileDemo;
import com.d.test.TestSingle;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017/7/12.
 */
public class TestFile {
    @Test
    public void testFile(){
        FileDemo fileDemo = new FileDemo();
        fileDemo.readFile();
    }

    @Test
    public void sort1(){
        int[] a = {34,2,45,64,12,33,41,87,23,77} ;

        for(int i=0;i<a.length-1;i++){

            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int tem = a[j+1] ;
                    a[j+1] = a[j] ;
                    a[j] = tem ;

                }

            }

        }

        String str="";
        for(int i=0;i<a.length;i++){
            str+=","+a[i];
        }
        System.out.println(str);
    }


    @Test
    public void testSingle(){

        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i=0;i<10;i++){
            System.out.println(i);
            executor.execute(new Runnable() {
                @Override
                public void run() {

                    System.out.println(Thread.currentThread().getName());
//                    TestSingle single = TestSingle.getInstence();
//                    System.out.println(single);
                }
            });
        }


    }


}
