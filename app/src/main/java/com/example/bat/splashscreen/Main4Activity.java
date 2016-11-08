package com.example.bat.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Main4Activity extends Activity {
    ImageView imageView;
    ImageView imageView1;
    ImageView imageView2;

    int []imageArray={R.drawable.r1,R.drawable.r2,R.drawable.wealthsuccess};
    int []imageArray1={R.drawable.r4,R.drawable.r5,R.drawable.r3};
    int []imageArray2={R.drawable.r7,R.drawable.r8,R.drawable.r9};

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        imageView = (ImageView)findViewById(R.id.imageView12);
        imageView1= (ImageView)findViewById(R.id.imageView22);
        imageView2= (ImageView)findViewById(R.id.imageView32);
        final Handler handler = new Handler();
        Runnable runnable = new Runnable()
        {
            int i=0;
            public void run()
            {
                imageView.setImageResource(imageArray[i]);
                imageView1.setImageResource(imageArray1[i]);
                imageView2.setImageResource(imageArray2[i]);
                i++;
                if(i>imageArray.length-1)
                {
                    i=0;
                }
                handler.postDelayed(this, 5000);  //for interval...
            }

        };
        handler.postDelayed(runnable, 1000); //for initial delay..
   // protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main4);

        Button Home= (Button)findViewById(R.id.button21);
        Home.setOnClickListener(new View.OnClickListener()
        {   public void onClick(View v)
        {
            Intent intent = new Intent(Main4Activity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        });
    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.activity_main3, menu);
        return false;
    }
}
