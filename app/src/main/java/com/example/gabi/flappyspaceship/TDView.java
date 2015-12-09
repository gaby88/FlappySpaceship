package com.example.gabi.flappyspaceship;

import android.content.Context;
import android.view.SurfaceView;

/**
 * Created by Gabi on 12/9/2015.
 */
public class TDView extends SurfaceView implements Runnable
{

    volatile boolean playing;
    Thread gameThread = null;
    public TDView(Context context) {
        super(context);

    }

    public void pause() {
        playing = false;
        try{
            gameThread.join();
        } catch (InterruptedException e){

        }
    }
    public  void resume() {
        playing = true;
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
       while (playing) {
           update();
           draw();
           control();

   }
    private void update() {

    }
    private void draw(){

    }
    private void control() {

    }
}

}
