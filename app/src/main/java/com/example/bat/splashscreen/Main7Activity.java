package com.example.bat.splashscreen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main7Activity extends AppCompatActivity {
    ImageView imageView2;

    int []imageArrayw={R.drawable.success1,R.drawable.success2,R.drawable.success3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        //super.onCreate(savedInstanceState);
        imageView2= (ImageView)findViewById(R.id.imageView321);
        final Handler handler = new Handler();
        Runnable runnable = new Runnable()
        {
            int i=0;
            public void run()
            {
                //imageView.setImageResource(imageArray[i]);
                //imageView1.setImageResource(imageArray1[i]);
                imageView2.setImageResource(imageArrayw[i]);
                i++;
                if(i>imageArrayw.length-1)
                {
                    i=0;
                }
                handler.postDelayed(this, 5000);  //for interval...
            }

        };
        handler.postDelayed(runnable, 1000);
        Button Home = (Button) findViewById(R.id.button321);
        Home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main7Activity.this, MainActivity.class);
                startActivity(intent);
                //finish();
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.activity_main3, menu);
        return false;
    }
}


