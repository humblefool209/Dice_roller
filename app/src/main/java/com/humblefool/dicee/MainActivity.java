package com.humblefool.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating button
        final Button rollButton= findViewById(R.id.rollButton);

        //Creating Dice image-views
        final ImageView leftDice = findViewById(R.id.image_leftDice);
        final ImageView rightDice = findViewById(R.id.image_rightDice);

        //Defining an array of dice images
        final int[] diceArray= new int[]{R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        //Defining listener
        rollButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Generating random index between 0 and 6
                Random randomNumberGenerator = new Random();
                int number_random = randomNumberGenerator.nextInt(6);

                //Setting left dice image based on the generated index
                leftDice.setImageResource(diceArray[number_random]);

                //Setting right dice image
                number_random = randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(diceArray[number_random]);
            }

        });

    }
}
