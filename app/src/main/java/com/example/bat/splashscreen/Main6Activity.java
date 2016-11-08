package com.example.bat.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main6Activity extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;

    int []imageArray={R.drawable.vermi,R.drawable.vermi1,R.drawable.vermi2};
    int []imageArray1={R.drawable.ewaste,R.drawable.ewaste1,R.drawable.ewaste2};
    int []imageArray2={R.drawable.ewaste3,R.drawable.ewaste4,R.drawable.ewaste6};
    int []imageArray3={R.drawable.biomedicalwaste,R.drawable.medical1,R.drawable.medical2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        imageView = (ImageView)findViewById(R.id.imageView12);
        imageView1 = (ImageView)findViewById(R.id.imageView22);
        imageView2 = (ImageView)findViewById(R.id.imageView32);
        imageView3 = (ImageView)findViewById(R.id.imageView);
        //imageView = (ImageView)findViewById(R.id.imageView2);

        final Handler handler = new Handler();
        Runnable runnable = new Runnable()
        {
            int i=0;
            public void run()
            {
                imageView.setImageResource(imageArray[i]);
                imageView1.setImageResource(imageArray1[i]);
                imageView2.setImageResource(imageArray2[i]);
                imageView3.setImageResource(imageArray3[i]);
                i++;
                if(i>imageArray1.length-1)
                {
                    i=0;
                }
                handler.postDelayed(this, 5000);  //for interval...
            }

        };
        handler.postDelayed(runnable, 1000);


        Button Home= (Button)findViewById(R.id.button41);
        Home.setOnClickListener(new View.OnClickListener()
        {   public void onClick(View v)
        {
            Intent intent = new Intent(Main6Activity.this, Main7Activity.class);
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
