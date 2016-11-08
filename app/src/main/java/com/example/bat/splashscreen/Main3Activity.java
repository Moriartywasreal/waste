package com.example.bat.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {

     //Button Button41 = (Button) findViewById(R.id.button41);
   // View view = findViewById()
   //  Button41.setOnClickListener(new View.OnClickListener(){

   // });
    //final TextView registerLink=(TextView) findViewById(R.id.RegisterHere);
    //Button btn = (Button) findViewById(R.getVbutton41)


    ImageView imageView;
    int []imageArray={R.drawable.waste1,R.drawable.waste2,R.drawable.waste3};


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imageView = (ImageView)findViewById(R.id.imageView111);

        final Handler handler = new Handler();
        Runnable runnable = new Runnable()
        {
            int i=0;
            public void run()
            {
                imageView.setImageResource(imageArray[i]);
                i++;
                if(i>imageArray.length-1)
                {
                    i=0;
                }
                handler.postDelayed(this, 3000);  //for interval...
            }

        };
        handler.postDelayed(runnable, 1000);
        //for initial delay..
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main3);

        Button Home= (Button)findViewById(R.id.button111);
        Home.setOnClickListener(new View.OnClickListener()
        {   public void onClick(View v)
        {
            Intent intent = new Intent(Main3Activity.this, Main2Activity.class);
            startActivity(intent);
            //finish();
        }
        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.activity_main3, menu);
        return false;
    }
}