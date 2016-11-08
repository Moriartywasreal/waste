package com.example.bat.splashscreen;

/**
 * Created by bat on 10/31/2016.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Belal on 2/3/2016.
 */

//Our class extending fragment
public class tab1 extends Fragment {

Intent intent;
    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating

        //Change R.layout.tab1 in you classes
        //return inflater.inflate(R.layout.tab1, container, false);
        //final Button waste = (Button) findViewB
        View root = inflater.inflate(R.layout.tab1, container, false);
        intent = new Intent(getActivity(), Main3Activity.class);
        final Button button = (Button) root.findViewById(R.id.button11);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        return root;
    }
}