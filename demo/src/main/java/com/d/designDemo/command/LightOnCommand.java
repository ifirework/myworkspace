package com.d.designDemo.command;

import sun.rmi.runtime.Log;

/**
 * Created by wang on 2017/7/24.
 */
public class LightOnCommand implements Command {

    private Light light ;

    public LightOnCommand(Light light) {
        this.light = light ;
    }

    @Override
    public void execute() {
        light.LightOn();
    }

    @Override
    public void undo() {
        light.LightOff();
    }
}
