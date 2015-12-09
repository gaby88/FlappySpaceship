package com.example.gabi.flappyspaceship;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class GameActivity extends Activity {

    private  TDView gameView;

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        gameView = new TDView(this);

        setContentView(gameView);
    }

    protected  void onPause() {
        super.onPause();
        gameView.pause();
    }

    protected void onResume() {
        super.onResume();
        gameView.resume();
    }


    }


