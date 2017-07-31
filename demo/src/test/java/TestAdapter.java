import com.d.designDemo.adapter.ainterface.Teger;
import com.d.designDemo.adapter.impl.SmallCat;
import com.d.designDemo.adapter.impl.TegerAdapter;
import org.junit.Test;

/**
 * Created by wang on 2017/7/31.
 */
public class TestAdapter {

    @Test
    public  void  test1(){

        SmallCat smallCat = new SmallCat();
        Teger teger = new TegerAdapter(smallCat);
        teger.face();
        teger.waho();

    }

}
