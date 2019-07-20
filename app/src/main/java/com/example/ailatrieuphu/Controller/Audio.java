package com.example.ailatrieuphu.Controller;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Handler;

import com.example.ailatrieuphu.R;

class Audio {

    static void AudioCall(Activity activity) {
        SharedPreferences sharedPreferences = activity.getSharedPreferences("sound", Context.MODE_PRIVATE);
        if (sharedPreferences.getString("sound", "").equals("ok")) {
            final MediaPlayer mp = MediaPlayer.create(activity, R.raw.wrong_answer);
            mp.start();
        }
    }

    static void recallAudio(Activity activity, int i) {
        SharedPreferences sharedPreferences = activity.getSharedPreferences("sound", Context.MODE_PRIVATE);
        if (sharedPreferences.getString("sound", "").equals("ok")) {
            final MediaPlayer mp = MediaPlayer.create(activity, i);
            mp.start();
            new Handler().postDelayed(mp::stop, 2200);
        }
    }
}
