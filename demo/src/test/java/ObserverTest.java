import com.d.designDemo.observer.ObverserWQ;
import com.d.designDemo.observer.WeatherCenterBj;
import com.d.designDemo.observer.get.ObserverHN;
import com.d.designDemo.observer.get.ObserverSX;
import com.d.designDemo.observer.get.WeatherCenterSX;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/13.
 */
public class ObserverTest {

    //测试推
    @Test
    public void testPull(){
        WeatherCenterBj bj = new WeatherCenterBj();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        ObverserWQ obverserWQ = new ObverserWQ(bj);

        bj.setWeatherData(format.format(new Date()),2,33);
        bj.setWeatherData(format.format(new Date()),3333,6666);
        bj.setWeatherData(format.format(new Date()),4444,77777);
    }
    @Test
    public void testGet(){
        WeatherCenterSX ob =  new WeatherCenterSX() ;
        new ObserverSX(ob) ;
        new ObserverHN(ob) ;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        ob.setData(format.format(new Date()),2,33);
        ob.setData(format.format(new Date()),33333,32332);
        ob.setData(format.format(new Date()),4556,311232);
    }




}
