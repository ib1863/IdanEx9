package com.example.idanex9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    Switch swDN;
    ConstraintLayout rl;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = (ToggleButton) findViewById(R.id.tB);
        swDN = (Switch) findViewById(R.id.sw);
        rl = findViewById(R.id.clVar1);

    }

    public void Clicked(View view) {
        if(tb.isChecked() == false && swDN.isChecked() == false)
        {
            rl.setBackgroundResource(R.color.black);
        }
        else if(tb.isChecked() == true && swDN.isChecked() == false)
        {
            rl.setBackgroundResource(R.color.green);
        }
        else if(tb.isChecked() == false && swDN.isChecked() == true)
        {
            rl.setBackgroundResource(R.color.yellow);
        }
        else
        {
            rl.setBackgroundResource(R.color.blue);
        }
    }
}