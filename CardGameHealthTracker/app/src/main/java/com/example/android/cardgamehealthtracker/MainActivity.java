package com.example.android.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.cardgamehealthtracker.R;

public class MainActivity extends AppCompatActivity {
    int yourHealth = 20;
    int FoeHealth = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForyourHealth(20);
    }

    public void resetScore(View v) {
        yourHealth = 20;
        FoeHealth = 20;
        displayForyourHealth(yourHealth);
        displayForFoeHealth(FoeHealth);
    }

    /**
     * Displays your health
     **/

    public void displayForyourHealth(int score) {
        TextView scoreView = (TextView) findViewById(R.id.YourHealth);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneForYou(View v) {
        yourHealth = yourHealth + 1;
        displayForyourHealth(yourHealth);
    }

    public void subOneForYou(View v) {
        yourHealth = yourHealth - 1;
        displayForyourHealth(yourHealth);
    }

    public void addTwoForYou(View v) {
        yourHealth = yourHealth + 2;
        displayForyourHealth(yourHealth);
    }
    public void subTwoForYou (View v){
        yourHealth = yourHealth -2;
        displayForyourHealth(yourHealth);
    }

    public void add3ForYou(View v) {
        yourHealth = yourHealth + 3;
        displayForyourHealth(yourHealth);
    }

    public void sub3ForYou(View v) {
        yourHealth = yourHealth - 3;
        displayForyourHealth(yourHealth);
    }

    /**
     * Displays foe health
     **/


    public void displayForFoeHealth(int score) {
        TextView scoreView = (TextView) findViewById(R.id.FoeHealth);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneForFoe(View v) {
        FoeHealth = FoeHealth + 1;
        displayForFoeHealth(FoeHealth);
    }

    public void subOneForFoe(View v) {
        FoeHealth = FoeHealth - 1;
        displayForFoeHealth(FoeHealth);
    }

    public void addTwoForFoe(View v) {
        FoeHealth = FoeHealth + 2;
        displayForFoeHealth(FoeHealth);
    }

    public void subTwoForFoe(View v) {
        FoeHealth = FoeHealth - 2;
        displayForFoeHealth(FoeHealth);
    }

    public void add3ForFoe(View v) {
        FoeHealth = FoeHealth + 3;
        displayForFoeHealth(FoeHealth);
    }

    public void sub3ForFoe(View v) {
        FoeHealth = FoeHealth - 3;
        displayForFoeHealth(FoeHealth);
    }
}
