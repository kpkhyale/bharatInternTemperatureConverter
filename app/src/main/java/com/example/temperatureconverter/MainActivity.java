package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn ;
    RadioButton ctof, ftoc ;
    TextView display,display2;
    EditText enterview;
    //Boolean isChecked = true;
    String enterTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        ctof = (RadioButton) findViewById(R.id.ctof);
        ftoc = (RadioButton) findViewById(R.id.ftoc);
        display = (TextView) findViewById(R.id.display);
        display2 = (TextView) findViewById(R.id.display2);
        enterview = (EditText) findViewById(R.id.enterView);


        btn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                enterTemp = enterview.getText().toString();

                if (enterTemp.equals("")) {



                } else {

                    double convertTemp;
                    String finalTemp;

                    if (ctof.isChecked()) {

                        convertTemp = ((Double.parseDouble(enterTemp)) * 9 / 5) + 32;

                        finalTemp = String.valueOf(convertTemp);

                        display.setText(finalTemp);
                        display2.setText("fahrenheit");


                    } else if (ftoc.isChecked()) {

                        convertTemp = ((Double.parseDouble(enterTemp)) - 32) * 5 / 9;

                        finalTemp = String.valueOf(convertTemp);

                        display.setText(finalTemp);
                        display2.setText("celsius");

                    }

                }
            }
        });
    }

}