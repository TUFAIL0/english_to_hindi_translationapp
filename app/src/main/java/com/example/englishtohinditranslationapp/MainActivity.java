package com.example.englishtohinditranslationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttoning(View view){

        int id = view.getId();
        String ourId ="";

        ourId=view.getResources().getResourceEntryName(id);

        int resId = view.getResources().getIdentifier(ourId,"raw","com.example.englishtohinditranslationapp");

        MediaPlayer mp = MediaPlayer.create(this, resId);
        mp.start();

        Log.i("buttonClick",ourId);



    }
}