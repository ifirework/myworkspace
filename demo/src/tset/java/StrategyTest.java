import com.d.designDemo.strategy.Car;
import com.d.designDemo.strategy.childCar.BomaCar;
import com.d.designDemo.strategy.engine.BigEngine;
import com.d.designDemo.strategy.engine.LowEngine;
import org.junit.Test;

/**
 * Created by Administrator on 2017/7/13.
 */
public class StrategyTest {
    @Test
    public void test1(){
        Car car =  new BomaCar() ;
        car.run() ;

        car.setEngine(new BigEngine());
        car.setEngine(new LowEngine());

    }


}
