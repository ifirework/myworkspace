import com.d.designDemo.command.Light;
import com.d.designDemo.command.LightOffCommand;
import com.d.designDemo.command.LightOnCommand;
import com.d.designDemo.command.RemoteControle;
import org.junit.Test;

/**
 * Created by wang on 2017/7/24.
 */
public class TestCommand {

    @Test
    public void testCommand(){
        RemoteControle remoteControle = new RemoteControle();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remoteControle.setOnCommand(0,lightOnCommand);
        remoteControle.setOffCommand(0,lightOffCommand);
        remoteControle.buttonUp(0);
        remoteControle.buttonDown(0);
        remoteControle.undo();

    }

}
