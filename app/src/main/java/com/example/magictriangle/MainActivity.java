package com.example.magictriangle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {

    static final String r_current_level = "1";
    Integer current_level;

    Integer[] tab_num = {1,2,3,4,5,6,7,8,9};
    Integer[] tab_gap = {1,2,3,4,5,6,7,8,9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        current_level = Integer.parseInt(prefs.getString(r_current_level, "1"));
        TextView t_current_level = (TextView) findViewById(R.id.current_level);
        t_current_level.setText("Current level: " + current_level);
    }

    @Override
    protected void onRestoreInstanceState(Bundle data) {
        super.onRestoreInstanceState(data);
    }

    @Override
    protected void onSaveInstanceState(Bundle data) {
        super.onSaveInstanceState(data);
    }

    public void submit(View v){
        String[] tab_check = {"0", "0", "0", "0", "0", "0", "0", "0", "0"};
        int num_err = 0;

        EditText e1 = findViewById(R.id.e11);
        EditText e2 = findViewById(R.id.e12);
        EditText e3 = findViewById(R.id.e13);
        EditText e4 = findViewById(R.id.e21);
        EditText e5 = findViewById(R.id.e22);
        EditText e6 = findViewById(R.id.e23);
        EditText e7 = findViewById(R.id.e31);
        EditText e8 = findViewById(R.id.e32);
        EditText e9 = findViewById(R.id.e33);
        if ("" != valueOf(e1.getText())) {
            tab_check[0] = valueOf(e1.getText());
        }
        if ("" != valueOf(e2.getText())) {
            tab_check[1] = valueOf(e2.getText());
        }
        if ("" != valueOf(e3.getText())) {
            tab_check[2] = valueOf(e3.getText());
        }
        if ("" != valueOf(e4.getText())) {
            tab_check[3] = valueOf(e4.getText());
        }
        if ("" != valueOf(e5.getText())) {
            tab_check[4] = valueOf(e5.getText());
        }
        if ("" != valueOf(e6.getText())) {
            tab_check[5] = valueOf(e6.getText());
        }
        if ("" != valueOf(e7.getText())) {
            tab_check[6] = valueOf(e7.getText());
        }
        if ("" != valueOf(e8.getText())) {
            tab_check[7] = valueOf(e8.getText());
        }
        if ("" != valueOf(e9.getText())) {
            tab_check[8] = valueOf(e9.getText());
        }

        if (num_err == 0) {
            for (int i = 0; i < 9; i++) {
                if (tab_num[i] != Integer.parseInt(tab_check[i]) || Integer.parseInt(tab_check[i]) == 0) {
                    num_err++;
                }
            }
        }

        TextView text_res = findViewById(R.id.text1);
        if (num_err == 0){
            text_res.setText("Brawoooo! Really good!");
        }
        else{
            text_res.setText("Ohhh no! We have error!");
        }

        Button submit = findViewById(R.id.submit);
        submit.setEnabled(false);
    }

    @SuppressLint("SetTextI18n")
    public void newGame(View v) {
        EditText e1 = findViewById(R.id.e11);
        EditText e2 = findViewById(R.id.e12);
        EditText e3 = findViewById(R.id.e13);
        EditText e4 = findViewById(R.id.e21);
        EditText e5 = findViewById(R.id.e22);
        EditText e6 = findViewById(R.id.e23);
        EditText e7 = findViewById(R.id.e31);
        EditText e8 = findViewById(R.id.e32);
        EditText e9 = findViewById(R.id.e33);
        e1.setText("");
        e2.setText("");
        e3.setText("");
        e4.setText("");
        e5.setText("");
        e6.setText("");
        e7.setText("");
        e8.setText("");
        e9.setText("");

        List<Integer> tab_list = Arrays.asList(tab_num);
        Collections.shuffle(tab_list);
        tab_list.toArray(tab_num);
        List<Integer> gap_list = Arrays.asList(tab_gap);
        Collections.shuffle(gap_list);
        tab_list.toArray(tab_gap);

        for (int i = 0; i < 9-current_level; i++){
            switch (tab_gap[i]){
                case 1:
                    e1.setText(tab_num[0].toString());
                    break;
                case 2:
                    e2.setText(tab_num[1].toString());
                    break;
                case 3:
                    e3.setText(tab_num[2].toString());
                    break;
                case 4:
                    e4.setText(tab_num[3].toString());
                    break;
                case 5:
                    e5.setText(tab_num[4].toString());
                    break;
                case 6:
                    e6.setText(tab_num[5].toString());
                    break;
                case 7:
                    e7.setText(tab_num[6].toString());
                    break;
                case 8:
                    e8.setText(tab_num[7].toString());
                    break;
                case 9:
                    e9.setText(tab_num[8].toString());
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + tab_gap[i]);
            }
        }

        int sum1 = tab_num[0] + tab_num[1] + tab_num[2];
        int sum2 = tab_num[3] + tab_num[4] + tab_num[5];
        int sum3 = tab_num[6] + tab_num[7] + tab_num[8];
        int sum4 = tab_num[0] + tab_num[3] + tab_num[6];
        int sum5 = tab_num[1] + tab_num[4] + tab_num[7];
        int sum6 = tab_num[2] + tab_num[5] + tab_num[8];

        TextView t_sum1 = findViewById(R.id.sum1);
        t_sum1.setText(Integer.toString(sum1));
        TextView t_sum2 = findViewById(R.id.sum2);
        t_sum2.setText(Integer.toString(sum2));
        TextView t_sum3 = findViewById(R.id.sum3);
        t_sum3.setText(Integer.toString(sum3));
        TextView t_sum4 = findViewById(R.id.sum4);
        t_sum4.setText(Integer.toString(sum4));
        TextView t_sum5 = findViewById(R.id.sum5);
        t_sum5.setText(Integer.toString(sum5));
        TextView t_sum6 = findViewById(R.id.sum6);
        t_sum6.setText(Integer.toString(sum6));

        Button submit = findViewById(R.id.submit);
        submit.setEnabled(true);
    }

    public void resume(View v){
        Button submit = findViewById(R.id.submit);
        submit.setEnabled(true);
    }

    public void quit(View v){
        this.finish();
    }
}