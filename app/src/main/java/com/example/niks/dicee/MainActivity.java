package com.example.niks.dicee;

import android.support.v7.app.AppCompatActivity;
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

        Button button_roll;
        button_roll = (Button) findViewById(R.id.button_roll);

        final ImageView LeftDice = (ImageView)findViewById(R.id.image_leftdice);
        final ImageView RightDice = (ImageView) findViewById(R.id.image_rightdice);

        final int[] DiceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
                                };
        button_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Random rand=new Random();
                int num1 = rand.nextInt(6);
                int num2 = rand.nextInt(6);

                LeftDice.setImageResource(DiceArray[num1]);
                RightDice.setImageResource(DiceArray[num2]                 );

            }
        });
    }
}
