package com.example.checkbox;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    CheckBox one, two, three, four;
    TextView result;
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.chkOne);
        two = findViewById(R.id.chkTwo);
        three = findViewById(R.id.chkThree);
        four = findViewById(R.id.chkFour);

        result = findViewById(R.id.tvResultGE6);
        click = findViewById(R.id.btnClickGE6);

        showResult();
    }

    public void showResult(){

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(two.isChecked() && four.isChecked()){
                    // this will show the TextView named result
                    result.setVisibility(View.VISIBLE);
                    result.setTextColor(Color.RED);
                    result.setText("Number Combination Color is RED");
                }else if (one.isChecked() && three.isChecked()){
                    result.setVisibility(View.VISIBLE);
                    result.setTextColor(Color.BLUE);
                    result.setText("Number Combination Color is BLUE");
                }else if ((one.isChecked() || three.isChecked()) ||
                        (two.isChecked() || four.isChecked())){
                    result.setVisibility(View.VISIBLE);
                    result.setTextColor(Color.GREEN);
                    result.setText("Number Combination Color is GREEN");
                }else{
                    // this will hide the TextView named result
                    result.setVisibility(View.INVISIBLE);
                }

            }
        });


    }
}
