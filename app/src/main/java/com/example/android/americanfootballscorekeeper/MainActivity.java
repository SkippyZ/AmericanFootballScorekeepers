package com.example.android.americanfootballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int TOUCHDOWN_POINTS = 6;
    final int FIELD_GOAL_POINTS = 3;
    final int EXTRA_POINT_1_POINT = 1;
    final int EXTRA_POINT_2_POINTS = 2;
    final int SAFETY_POINTS = 2;

    int team_a_score = 0;
    int team_b_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // To reset the team scores

    public void resetScores(View view) {
        team_a_score = 0;
        team_b_score = 0;
        displayTeamAScore(team_a_score);
        displayTeamBScore(team_b_score);
    }

    public void updateTeamScore(View view) {
        switch (view.getId()) {
            // Team A Points
            case R.id.team_a_touchdown:
                team_a_score += TOUCHDOWN_POINTS;
                break;
            case R.id.team_a_field_goal:
                team_a_score += FIELD_GOAL_POINTS;
                break;
            case R.id.team_a_extra_point_1:
                team_a_score += EXTRA_POINT_1_POINT;
                break;
            case R.id.team_a_extra_point_2:
                team_a_score += EXTRA_POINT_2_POINTS;
                break;
            case R.id.team_a_safety:
                team_a_score += SAFETY_POINTS;
                break;

            // Team B Points

            case R.id.team_b_touchdown:
                team_b_score += TOUCHDOWN_POINTS;
                break;
            case R.id.team_b_field_goal:
                team_b_score += FIELD_GOAL_POINTS;
                break;
            case R.id.team_b_extra_point_1:
                team_b_score += EXTRA_POINT_1_POINT;
                break;
            case R.id.team_b_extra_point_2:
                team_b_score += EXTRA_POINT_2_POINTS;
                break;
            case R.id.team_b_safety:
                team_b_score += SAFETY_POINTS;
                break;

            default:
                break;
        }

        displayTeamAScore(team_a_score);
        displayTeamBScore(team_b_score);
    }

    // Display the scores

    public void displayTeamAScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTeamBScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}


