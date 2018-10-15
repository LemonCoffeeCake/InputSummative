package com.example.generaljewish.inputsummative;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int team1Total=0;
    int team2Total=0;

    public void Team1ScoreFT(View view) {
        team1Total++;
        updateTeam1();
    }

    public void Team1ScoreFG(View view) {
        team1Total+=2;
        updateTeam1();
    }

    public void Team1Score3P(View view) {
        team1Total+=3;
        updateTeam1();
    }

    public void Team2ScoreFT(View view) {
        team2Total++;
        updateTeam2();
    }

    public void Team2ScoreFG(View view) {
        team2Total+=2;
        updateTeam2();
    }

    public void Team2Score3P(View view) {
        team2Total+=3;
        updateTeam2();
    }

    public void resetGame(View view) {
        team1Total=0;
        team2Total=0;
        updateTeam1();
        updateTeam2();
    }

    private void updateTeam1() {
        TextView scoreTextView = findViewById(R.id.Team1Score);
        scoreTextView.setText(Integer.toString(team1Total));
    }
    private void updateTeam2(){
        TextView scoreTextView = findViewById(R.id.Team2Score);
        scoreTextView.setText(Integer.toString(team2Total));
    }
}
