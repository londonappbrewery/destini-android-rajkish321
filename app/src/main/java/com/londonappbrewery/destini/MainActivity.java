package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyText;
    Button topButton, botButton;
    int storyNum = 1;
    String[] stories = {

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyText = findViewById(R.id.storyTextView);
        topButton = findViewById(R.id.buttonTop);
        botButton = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch(storyNum){
                    case 1:
                        storyText.setText(R.string.T3_Story);
                        topButton.setText(R.string.T3_Ans1);
                        botButton.setText(R.string.T3_Ans2);
                        storyNum = 3;
                        break;

                    case 2:
                        storyText.setText(R.string.T3_Story);
                        topButton.setText(R.string.T3_Ans1);
                        botButton.setText(R.string.T3_Ans2);
                        storyNum = 3;
                        break;

                    case 3:
                        storyText.setText(R.string.T6_End);

                        topButton.setVisibility(View.INVISIBLE);
                        botButton.setVisibility(View.INVISIBLE);
                        //delete top and bottom buttons
                        storyNum = 6;
                        break;

                }


            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        botButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(storyNum){
                    case 1:
                        storyText.setText(R.string.T2_Story);
                        topButton.setText(R.string.T2_Ans1);
                        botButton.setText(R.string.T2_Ans2);
                        storyNum = 2;
                        break;

                    case 2:
                        storyText.setText(R.string.T4_End);
                        //delete top and bottom buttons
                        topButton.setVisibility(View.INVISIBLE);
                        botButton.setVisibility(View.INVISIBLE);
                        storyNum = 4;
                        break;

                    case 3:
                        storyText.setText(R.string.T5_End);


                        //delete top and bottom buttons
                        topButton.setVisibility(View.INVISIBLE);
                        botButton.setVisibility(View.INVISIBLE);
                        storyNum = 5;
                        break;

                }

            }
        });

    }
}
