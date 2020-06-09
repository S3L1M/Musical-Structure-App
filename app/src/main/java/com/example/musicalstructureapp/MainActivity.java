package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public void playingNow(View v) {
        Toast.makeText(this,"go to playing now", Toast.LENGTH_SHORT).show();
    }

    public void play(View v) {
        Toast.makeText(this,"play", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Song> songs = new ArrayList<Song>();
        String[] titles = {"Nightcore - What do I with a boy like you",
                "Phoenix (ft. Cailin Russo and Chrissy Costanza)",
                "True Damage - GIANTS (ft. Becky G, Keke Palmer, SOYEON, DUCKWRTH, Thutmose)",
                "Warriyo - Mortals (ft. Laura Brehm)",
                "Nightcore- Dreamer",
                "Nightcore - Light It Up",
                "Nightcore - Made for this",
                "Nightcore - Fancy Toys",
                "Alan Walker - Lost Control (Feat. Sorana)",
                "ON MY WAY - Alan Walker",
                "Tiësto & Mabel - God Is A Dancer",
                "NC - Say HUH",
                "Nightstep-Somebody That I Used To Know",
                "Nightcore - No Consequences",
                "Nightcore - B Team",
                "Cant Control Myself",
                "Nightcore ~ Circles",
                "Nightcore--white rabbit",
                "Nightcore - Animals",
                "Nightcore - I'm A Machine"};
        String[] uploaders = {"NightcoreSoulProductions",
                "League of Legends Nightcore",
                "League of Legends",
                "Warriyo",
                "LEGEND NEVER DIE",
                "Kora Nightcore 3",
                "Koneko Nightcore",
                "Cypress King",
                "Charge BPM",
                "Jackson Xie",
                "Tiësto",
                "Reina KawaII",
                "NightcoreForeva",
                "\uD83C\uDFB6♦Neptune♦\uD83C\uDFB6",
                "William Tao",
                "яαη∂σмηєѕѕ ιѕ αωєѕσмєηєѕѕ",
                "nightcore01",
                "iornterra",
                "Gustavo Weyber",
                "NightCore"};
        for(int i=0;i<20;i++) {
            songs.add(0, new Song(titles[i], uploaders[i]));
            Log.v("added song", titles[i]+" by "+uploaders[i]);
        }


    }
}
