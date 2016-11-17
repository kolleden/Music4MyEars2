package com.example.user1.music4myears;

import android.app.Notification;
import android.app.Service;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.content.Context;


public abstract class UseService extends Service
{
    MediaPlayer song1;
    MediaPlayer song2;
    MediaPlayer song3;
    int songid;
    Notification notification;
    Context mcontext;


    Intent intent;


    protected void onCreate(Bundle savedInstanceState) {

        song1 = MediaPlayer.create(this, R.raw.media1);
        song2 = MediaPlayer.create(this, R.raw.media2);
        song3 = MediaPlayer.create(this, R.raw.media3);
        boolean running = false;


        if (songid == 1)
            song1.start();
        if (songid == 2)
            song2.start();
        else
            song3.start();
        startForeground(songid, notification);

        running = true;

        stopForeground(running);

    }
}

