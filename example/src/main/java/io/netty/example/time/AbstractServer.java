package io.netty.example.time;

/**
 * Created by tuyuelai on 2017/12/19.
 */
public abstract class AbstractServer implements IServer {
    @Override
    public void start(){
        init();
        perform();
    }

    public abstract void stop();

    public void init(){
        System.out.println("init");
    }

    public abstract void perform();
}

