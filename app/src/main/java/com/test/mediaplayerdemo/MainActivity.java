package com.test.mediaplayerdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * android 9.0 播放http的会报错，需要在AndroidManifest.xml中添加android:usesCleartextTraffic="true"
 */
public class MainActivity extends AppCompatActivity  {

    private Button btnPlayMp3;
    private Button btnStopMp3;
    private Button btnPlayWma;
    private Button btnStopWma;
    private Button btnPlayUrl;
    private Button btnStopUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlayMp3 = findViewById(R.id.btn_play_mp3);
        btnStopMp3 = findViewById(R.id.btn_stop_mp3);
        btnPlayWma = findViewById(R.id.btn_play_wma);
        btnStopWma = findViewById(R.id.btn_stop_wma);

        btnPlayUrl = findViewById(R.id.btn_play_url);
        btnStopUrl = findViewById(R.id.btn_stop_url);

        btnPlayMp3.setOnClickListener(click);
        btnStopMp3.setOnClickListener(click);
        btnPlayWma.setOnClickListener(click);
        btnStopWma.setOnClickListener(click);
        btnPlayUrl.setOnClickListener(click);
        btnStopUrl.setOnClickListener(click);

    }

    String mUrl = "http://tapi.95xiu.com/song.mp3";
    String mUrl1 = "https://www.twle.cn/static/i/song.mp3";
    String url1 = "https://tapi.95xiu.com/111.wma";

    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_play_mp3:
                    AudioManager.getInstance(MainActivity.this).playAssertAudio("test.mp3");
                    break;
                case R.id.btn_stop_mp3:
                    AudioManager.getInstance(MainActivity.this).stopAssertAudio();
                    break;
                case R.id.btn_play_wma:
                    AudioManager.getInstance(MainActivity.this).playAssertAudio("test.wma");
                    break;
                case R.id.btn_stop_wma:
                    AudioManager.getInstance(MainActivity.this).stopAssertAudio();
                    break;

                case R.id.btn_play_url:
                    AudioManager.getInstance(MainActivity.this).playAudio(mUrl);
                    break;
                case R.id.btn_stop_url:
                    AudioManager.getInstance(MainActivity.this).stopAudio(mUrl);
                    break;

                default:
                    break;
            }
        }
    };

}

