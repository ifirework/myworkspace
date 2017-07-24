package com.d.designDemo.command;

/**
 * Created by wang on 2017/7/24.
 */
public class LightOffCommand implements Command {

    private Light light ;
    public LightOffCommand(Light light) {
        this.light = light ;
    }

    @Override
    public void execute() {
        light.LightOff();
    }

    @Override
    public void undo() {
        light.LightOn();
    }
}
