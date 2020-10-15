package com.engineerfadyfawzi.americanfootballscores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the American Football score for 2 teams.
 */
public class MainActivity extends AppCompatActivity
{
    // Tracks the score for Team A
    int scoreTeamA = 0;
    
    // Tracks the score for Team B
    int scoreTeamB = 0;
    
    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }
    
    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA( View v )
    {
        scoreTeamA++;
        displayForTeamA( scoreTeamA );
    }
    
    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA( View v )
    {
        scoreTeamA += 2;
        displayForTeamA( scoreTeamA );
    }
    
    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA( View v )
    {
        scoreTeamA += 3;
        displayForTeamA( scoreTeamA );
    }
    
    /**
     * Increase the score for Team A by 6 points.
     */
    public void addSixForTeamA( View view )
    {
        scoreTeamA += 6;
        displayForTeamA( scoreTeamA );
    }
    
    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB( View v )
    {
        scoreTeamB++;
        displayForTeamB( scoreTeamB );
    }
    
    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB( View v )
    {
        scoreTeamB += 2;
        displayForTeamB( scoreTeamB );
    }
    
    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB( View v )
    {
        scoreTeamB += 3;
        displayForTeamB( scoreTeamB );
    }
    
    /**
     * Increase the score for Team B by 6 points.
     */
    public void addSixForTeamB( View view )
    {
        scoreTeamB += 6;
        displayForTeamB( scoreTeamB );
    }
    
    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore( View v )
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA( scoreTeamA );
        displayForTeamB( scoreTeamB );
    }
    
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA( int score )
    {
        TextView scoreView = findViewById( R.id.team_a_score );
        scoreView.setText( String.valueOf( score ) );
    }
    
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB( int score )
    {
        TextView scoreView = findViewById( R.id.team_b_score );
        scoreView.setText( String.valueOf( score ) );
    }
}