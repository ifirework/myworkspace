
import com.d.designDemo.decorate.BaseCourse;
import com.d.designDemo.decorate.Course;
import com.d.designDemo.decorate.Image;
import com.d.designDemo.decorate.Video;
import com.d.designDemo.decorate.io.DectoryIo;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by wang on 2017/7/13.
 */
public class DecorateTest {

    @Test
    public void test1() {

        Course baseCourse = new BaseCourse();
        baseCourse.setSize(1);
        System.out.println(baseCourse.cost()+"==="+baseCourse.getDescri());

        baseCourse = new Image(baseCourse) ;
        baseCourse = new Video(baseCourse) ;
        baseCourse = new Video(baseCourse) ;

        System.out.println(baseCourse.cost()+"===="+baseCourse.getDescri());



    }
@Test
    public void test2(){

        try {
            FileInputStream in = new FileInputStream("D:\\develop\\code\\aa.txt");
            InputStream dectoryIo = new DectoryIo(in);
            int num =0;
            while (-1!=(num =dectoryIo.read()) ){
                System.out.println((char)num);
            }
            dectoryIo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
