package com.example.bat.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;


public class Main5Activity extends Activity {

    // Set Duration of the Splash Screen
    long Delay = 3000;
    long Dii=5000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Remove the Title Bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // Get the view from splash_screen.xml
        setContentView(R.layout.activity_main5);

        // Create a Timer
        // final Timer RunSplash = new Timer();
        Timer t1 = new Timer();
        //final TimerTask ShowSplash = new TimerTask() {
        //  @Override
        // public void run() {
        // Close SplashScreenActivity.class
        // finish();

        // Start MainActivity.class
        //Intent myIntent = new Intent(Main2Activity.this,
        //  MainActivity.class);
        // startActivity(myIntent);
        //}
        // };
        // Task to do when the timer ends
        TimerTask T1 = new TimerTask() {
            public void run() {
               // ImageView imageView= (ImageView) findViewById(R.id.imaage2);
                //imageView.setImageResource(R.drawable.moefff);
                finish();

                // Start MainActivity.class
                Intent myIntent = new Intent(Main5Activity.this,
                        MainActivity.class);
                startActivity(myIntent);
                //RunSplash.schedule(ShowSplash, Delay);
            }
        };
        t1.schedule(T1, Delay);


        // Start the timer
        //RunSplash.schedule(ShowSplash, Delay);
    }
}

