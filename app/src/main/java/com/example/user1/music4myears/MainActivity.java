package com.example.user1.music4myears;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    MediaPlayer song1;
    MediaPlayer song2;
    MediaPlayer song3;
    Button music1;
    Button music2;
    Button music3;
    Button play;
    Button pause;
    int songid;
    TextView playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        music1= (Button) findViewById(R.id.music1);
        music2 = (Button) findViewById(R.id.music2);
        music3 = (Button) findViewById(R.id.music3);
        play = (Button) findViewById(R.id.play);
        pause = (Button) findViewById(R.id.pause);
        playing = (TextView) findViewById(R.id.playing);


        song1 = MediaPlayer.create(this, R.raw.media1);
        song2 = MediaPlayer.create(this, R.raw.media2);
        song3 = MediaPlayer.create(this, R.raw.media3);

        music1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                songid = 1;
                playing.setText("Playing Track: Music1");
            }
        });
        music2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                songid = 2;
                playing.setText("Playing Track: Music2");
            }
        }); music3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                songid = 3;
                playing.setText("Playing Track: Music3");
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(songid==1)
                    song1.start();
                if(songid==2)
                    song2.start();
                else
                    song3.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    song1.pause();
                    song2.pause();
                    song3.start();
            }
        });








    }
}
