package com.example.pr12golovatyuk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
    }
    public void menu(View view) {
        Animation topMenu = AnimationUtils.loadAnimation(this, R.anim.menu_scale_top);
        Animation menu = AnimationUtils.loadAnimation(this, R.anim.menu_scale);
        LinearLayout topMenuLL = (LinearLayout) findViewById(R.id.topMenu);
        LinearLayout menuLL = (LinearLayout) findViewById(R.id.menu);
        topMenuLL.startAnimation(topMenu);
        menuLL.startAnimation(menu);
    }

    public void historybtn(View view) {
        Intent intent = new Intent(this, history.class);
        startActivity(intent);
    }

    public void backmenu(View view) {
        Animation topMenu = AnimationUtils.loadAnimation(this, R.anim.menu_scale_top_bck);
        Animation menu = AnimationUtils.loadAnimation(this, R.anim.menu_scale_bck);
        LinearLayout topMenuLL = (LinearLayout) findViewById(R.id.topMenu);
        LinearLayout menuLL = (LinearLayout) findViewById(R.id.menu);
        topMenuLL.startAnimation(topMenu);
        menuLL.startAnimation(menu);
    }

    public void settings(View view) {
        Intent intent = new Intent(this, settings.class);
        startActivity(intent);
    }
}