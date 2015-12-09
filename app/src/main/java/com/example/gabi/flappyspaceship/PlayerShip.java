package com.example.gabi.flappyspaceship;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by Gabi on 12/9/2015.
 */
public class PlayerShip {

    public  PlayerShip (Context context) {

        x = 50;
        y = 50;
        speed = 1;
        bitmap = BitmapFactory.decodeResource(context.getResources(),R.drawable.ship);

    }

    private Bitmap bitmap;
    private int x, y;
    private int speed = 0;


}
