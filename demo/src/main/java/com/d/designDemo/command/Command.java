package com.d.designDemo.command;

/**
 * Created by wang on 2017/7/24.
 */
public interface Command {
    public void  execute() ;//执行命令
    public void undo();//撤销命令
}
