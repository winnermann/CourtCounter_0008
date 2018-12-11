package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;



    /**
     * Следующие два метода onSaveInstanceState и onRestoreInstanceState
     * не позволяют обнуляться значениям после поворота экрана.
     */


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("scoreTeamA", scoreTeamA);
        TextView teamAScore = (TextView) findViewById(R.id.team_a_score);
        outState.putString("team_a", teamAScore.getText().toString());


        outState.putInt("scoreTeamB", scoreTeamB);
        TextView teamBScore = (TextView) findViewById(R.id.team_b_score);
        outState.putString("team_b", teamBScore.getText().toString());
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        scoreTeamA = savedInstanceState.getInt("scoreTeamA", 0);
        scoreTeamB = savedInstanceState.getInt("scoreTeamB", 0);

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }





    //int resetScoreA;
    //int resetScoreB= scoreTeamB - scoreTeamB;



    /*

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Team A by 1 point.
     */


    public void addOneForTeamA(View v) {
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 1 point.
     */

    public void addOneForTeamB(View v) {
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View v){

        scoreTeamA= 0;
        displayForTeamA(scoreTeamA);

        scoreTeamB= 0;
        displayForTeamB(scoreTeamB);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForTeamA(8);
    }
}
