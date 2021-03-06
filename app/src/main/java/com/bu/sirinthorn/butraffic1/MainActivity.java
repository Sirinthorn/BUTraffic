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

        //Create ListView
        createListView();

    }//Main method

    private void createListView() {
        //setup Array
        String[] strTitle = new String[20];
        strTitle[0] = "ห้ามเลี้ยวซ้าย";
        strTitle[1] = "ห้ามเลี้ยวขวา";
        strTitle[2] = "ตรงไป";
        strTitle[3] = "เลี้ยวขวา";
        strTitle[4] = "เลี้ยวซ้าย";
        strTitle[5] = "ทางออก";
        strTitle[6] = "ทางเข้า";
        strTitle[7] = "ทางออก";
        strTitle[8] = "หยุด";
        strTitle[9] = "จำกัดความสูง 2.5 เมตร";
        strTitle[10] = "ทางแยก";
        strTitle[11] = "ห้ามกลับรถ";
        strTitle[12] = "ห้ามจอด";
        strTitle[13] = "ห้ามสวนทาง";
        strTitle[14] = "ห้ามแซง";
        strTitle[15] = "ทางเข้า";
        strTitle[16] = "หยุดตรวจ";
        strTitle[17] = "จำกัดความเร็ว";
        strTitle[18] = "จำกัดความกว้าง";
        strTitle[19] = "จำกัดความสูง 5 เมตร";

        int[] intIcon = {R.drawable.traffic_01,R.drawable.traffic_02,R.drawable.traffic_03, R.drawable.traffic_04,
                         R.drawable.traffic_05,R.drawable.traffic_06,R.drawable.traffic_07,R.drawable.traffic_08,
                         R.drawable.traffic_09,R.drawable.traffic_10,R.drawable.traffic_11,R.drawable.traffic_12,
                         R.drawable.traffic_13,R.drawable.traffic_14,R.drawable.traffic_15,R.drawable.traffic_16,
                         R.drawable.traffic_17,R.drawable.traffic_18,R.drawable.traffic_19,R.drawable.traffic_20};
        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, strTitle, intIcon);
        trafficListView.setAdapter(objMyAdapter);

    }//Create ListView

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

