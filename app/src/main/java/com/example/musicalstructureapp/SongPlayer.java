package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class SongPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_player);
    }

    public void play(View v) {
        Toast.makeText(this,"Play", Toast.LENGTH_SHORT).show();
    }

    public void next(View v) {
        Toast.makeText(this,"Next", Toast.LENGTH_SHORT).show();
    }

    public void prev(View v) {
        Toast.makeText(this,"Previous", Toast.LENGTH_SHORT).show();
    }

    public void rewind(View v) {
        Toast.makeText(this,"Rewind", Toast.LENGTH_SHORT).show();
    }

    public void forward(View v) {
        Toast.makeText(this,"Forward", Toast.LENGTH_SHORT).show();
    }

}
