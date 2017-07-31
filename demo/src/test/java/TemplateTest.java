import com.d.designDemo.template.TeaFrsx;
import org.junit.Test;

/**
 * Created by wang on 2017/7/31.
 */
public class TemplateTest {
    public static void main(String[] args) {
        TemplateTest templateTest = new TemplateTest();
        templateTest.test1();
    }

    @Test
    public void test1(){
        TeaFrsx teaFrsx = new TeaFrsx();
        teaFrsx.prepare();

    }


}
