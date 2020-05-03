package com.example.whackamole;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button ButtonLeft;
    private Button ButtonMiddle;
    private Button ButtonRight;
    private static final String TAG = "Whack A Mole";
    private int score = 0;
    private TextView scoreText;

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "Starting Game!");
        changeMole();

        ButtonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ButtonLeft.getText().toString() == "*") {
                    score++;
                    changeMole();
                    scoreText.setText("" +score);
                } else {
                    score--;
                    changeMole();
                    scoreText.setText("" +score);
                }
                Log.v(TAG, "Button 1 pressed");
            }
        });

        ButtonMiddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ButtonMiddle.getText().toString() == "*") {
                    score++;
                    changeMole();
                    scoreText.setText("" +score);
                } else {
                    score--;
                    changeMole();
                    scoreText.setText("" +score);
                }
                Log.v(TAG, "Button 1 pressed");
            }
        });

        ButtonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ButtonRight.getText().toString() == "*") {
                    score++;
                    changeMole();
                    scoreText.setText("" +score);
                } else {
                    score--;
                    changeMole();
                    scoreText.setText("" +score);
                }
                Log.v(TAG, "Button 1 pressed");
            }
        });
    }

    public void changeMole()
    {
        Random random = new Random();

        int randomize = random.nextInt(3);

        if (randomize == 0) {

            ButtonLeft.setText("O");
            ButtonMiddle.setText("O");
            ButtonRight.setText("*");

        } else if (randomize == 1) {

            ButtonLeft.setText("O");
            ButtonMiddle.setText("*");
            ButtonRight.setText("O");

        } else if (randomize == 2) {

            ButtonLeft.setText("*");
            ButtonMiddle.setText("O");
            ButtonRight.setText("O");

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "Destroying App");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "Stopping App");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "Pausing App");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "Resuming App");
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonLeft = (Button) findViewById(R.id.ButtonLeft);
        ButtonMiddle = (Button) findViewById(R.id.ButtonMiddle);
        ButtonRight = (Button) findViewById(R.id.ButtonRight);

        scoreText = (TextView) findViewById(R.id.textView);
    }
}
