import com.d.designDemo.facade.FacadeDemo;
import org.junit.Test;

/**
 * Created by wang on 2017/7/31.
 */
public class TestFacade {
    @Test
    public void testFacade1(){
        FacadeDemo facadeDemo = new FacadeDemo();
        facadeDemo.allOn();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        facadeDemo.allOff();

    }


}
