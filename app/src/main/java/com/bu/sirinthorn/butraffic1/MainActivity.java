package com.bu.sirinthorn.butraffic1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
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
                //use ctrl + space to guess the method or name
                Intent objIntent = new Intent(Intent.ACTION_VIEW); //this object inherit from intent class
                //action view = android open a browser
                objIntent.setData(Uri.parse("https://sites.google.com/a/bu.ac.th/sirinthorn/home"));
                startActivity(objIntent);



            }   //event onclick done
        });
    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutmeButton = (Button) findViewById(R.id.button); //alt + enter to casting type

    }
} //main class

