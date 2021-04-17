package com.example.magictriangle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ParametersActivity extends AppCompatActivity {

    Integer level_number;
    TextView text_current_level = (TextView) findViewById(R.id.current_level);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parameters);
        level_number = 1;
    }

    public void level1(View v){
        level_number = 1;
        text_current_level.setText("Current level: 1 - one empty cell");
    }
    public void level2(View v){
        level_number = 2;
        text_current_level.setText("Current level: 2 - two empty cells");
    }
    public void level3(View v){
        level_number = 3;
        text_current_level.setText("Current level: 3 - three empty cells");
    }
    public void level4(View v){
        level_number = 4;
        text_current_level.setText("Current level: 4 - four empty cells");
    }
    public void level5(View v){
        level_number = 5;
        text_current_level.setText("Current level: 5 - five empty cells");
    }
    public void level6(View v){
        level_number = 6;
        text_current_level.setText("Current level: 6 - six empty cells");
    }
    public void level7(View v){
        level_number = 7;
        text_current_level.setText("Current level: 7 - seven empty cells");
    }
    public void level8(View v){
        level_number = 8;
        text_current_level.setText("Current level: 8 - eight empty cells");
    }
    public void level9(View v){
        level_number = 9;
        text_current_level.setText("Current level: 9 - nine empty cells");
    }
}