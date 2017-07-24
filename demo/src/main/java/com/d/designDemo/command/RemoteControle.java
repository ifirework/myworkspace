package com.d.designDemo.command;

/**
 * Created by wang on 2017/7/24.
 */
public class RemoteControle {

    private Command[] buttonUp ;
    private Command[] buttonDown ;
    private Command lastCommand ;//记录上一个命令
    public RemoteControle() {

        buttonUp = new Command[7] ;
        buttonDown = new Command[7];
        //给每个命令进行默认初始化
        for(int i=0;i<7;i++){
            buttonUp[i] = new NoCommand() ;
            buttonDown[i] = new NoCommand() ;
        }

        lastCommand = new NoCommand() ;

    }

    public void setOnCommand(int slot,Command command){
        buttonUp[slot] = command ;
    }

    public void setOffCommand(int slot,Command command){
        buttonDown[slot] = command ;
    }

    public void buttonUp(int slot){
        buttonUp[slot].execute();
        lastCommand = buttonUp[slot] ;
    }

    public void buttonDown(int slot){
        buttonDown[slot].execute();
        lastCommand = buttonDown[slot];
    }

    public void undo(){
        lastCommand.undo();
    }

}

