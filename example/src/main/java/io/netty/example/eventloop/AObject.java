package io.netty.example.eventloop;

/**
 * Created by tuyuelai on 2017/12/1.
 */
public class AObject {
    static int i = 0;
    private AObject(){

    }
    public static final AObject getAobject(){
        return new AObject();
    }
}
