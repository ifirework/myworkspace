import com.d.designDemo.factory.Pizz;
import com.d.designDemo.factory.PizzStore;
import com.d.designDemo.factory.SXPizzStore;

/**
 * Created by wang on 2017/7/17.
 */
public class FactoryTest {
    public static void main(String[] args) {
        PizzStore store = new SXPizzStore() ;
        Pizz pizz = store.Order("shanxi");
        System.out.println("you get a "+pizz.getName());

    }
}
