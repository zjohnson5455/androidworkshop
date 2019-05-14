package com.example.briantomasco.androidworkshop;

import android.content.Context;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Toast;

/**
 * Created by zacharyjohnson on 5/14/19.
 */

public class PollActivity extends AppCompatActivity{

    NumberPicker numPick;
    Button finishButton;
    Context mContext;
    EditText howLong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poll);

        mContext = this;
        howLong = findViewById(R.id.how_many);

        setNumberPicker();

        addButtonListeners();

    }

    public void addButtonListeners(){
        finishButton = findViewById(R.id.finish_button);

        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String editVal = howLong.getText().toString();
                int pickVal = numPick.getValue();

                Toast.makeText(mContext, "You guessed " + editVal + " and " + pickVal + ". Best of luck!",
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    public void setNumberPicker() {

        // https://android--examples.blogspot.com/2015/05/how-to-use-numberpicker-in-android.html

        numPick = findViewById(R.id.number_picky);

        numPick.setMinValue(0);
        numPick.setMaxValue(10);

        numPick.setWrapSelectorWheel(true);
    }


}
