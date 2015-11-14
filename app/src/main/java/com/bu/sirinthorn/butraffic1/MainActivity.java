package com.bu.sirinthorn.butraffic1;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //explicit = variable declaration
    private ListView trafficListView;
    private Button aboutmeButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();   //alt + Enter to create this method automatically
        //Botton Controller
        buttonController();

    }//Main method

    private void buttonController() {
        aboutmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Sound Effect
                MediaPlayer buttonPlayer = MediaPlayer.create(getBaseContext(), R.raw.cat); //getbase tell android a sound is in the same location of prog
                buttonPlayer.start();
                //Intent to WebView


            }   //event onclick done
        });
    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutmeButton = (Button) findViewById(R.id.button); //alt + enter to casting type

    }
} //main class

