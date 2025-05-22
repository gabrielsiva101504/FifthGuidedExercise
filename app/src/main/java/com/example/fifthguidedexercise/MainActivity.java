package com.example.fifthguidedexercise;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    RadioGroup rgColors;
    RadioButton rbRed, rbBlue, rbYellow, rbGreen;
    TextView tvColorResult;
    ConstraintLayout clMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clMain = findViewById(R.id.clMain);
        rgColors = findViewById(R.id.rgColors);
        rbRed = findViewById(R.id.rbRed);
        rbBlue = findViewById(R.id.rbBlue);
        rbYellow = findViewById(R.id.rbYellow);
        rbGreen = findViewById(R.id.rbGreen);
        tvColorResult = findViewById(R.id.tvColorResult);

        rgColors.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.rbRed) {
                clMain.setBackgroundColor(Color.RED);
                tvColorResult.setText("Color: RED");
            } else if (checkedId == R.id.rbBlue) {
                clMain.setBackgroundColor(Color.BLUE);
                tvColorResult.setText("Color: BLUE");
            } else if (checkedId == R.id.rbYellow) {
                clMain.setBackgroundColor(Color.YELLOW);
                tvColorResult.setText("Color: YELLOW");
            } else if (checkedId == R.id.rbGreen) {
                clMain.setBackgroundColor(Color.GREEN);
                tvColorResult.setText("Color: GREEN");
            }
        });
    }
}
