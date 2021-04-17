package com.example.magictriangle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ParametersActivity extends AppCompatActivity {

    static final String r_current_level = "1";
    static final String r_content = "1";
    static final String r_username = "player";
    Integer current_level;
    String content;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parameters);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        current_level = Integer.parseInt(prefs.getString(r_current_level, "1"));
        content = prefs.getString(r_content, "1");
        username = prefs.getString(r_username, "player");
        TextView t_current_level = (TextView) findViewById(R.id.current_level);
        t_current_level.setText("Current level: " + content);
        TextView t_current_username = (TextView) findViewById(R.id.current_username);
        t_current_username.setText("Current username: " + username);
    }

    public void back(View v){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor ed = prefs.edit();
        ed.putString(String.valueOf(r_current_level), String.valueOf(current_level));
        ed.putString(r_content, content);
        ed.putString(r_username, username);
        ed.commit();
        this.finish();
    }

    public void confirm_level(View v){
        EditText e_current_level = findViewById(R.id.edit_level);
        TextView t_current_level = (TextView) findViewById(R.id.current_level);
        content = e_current_level.getText().toString();
        try {
            current_level = Integer.parseInt(content);
            t_current_level.setText("Current level: "+content);
        } catch(NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }

    }

    public void confirm_username(View v){
        EditText e_current_username = findViewById(R.id.edit_username);
        TextView t_current_username = (TextView) findViewById(R.id.current_username);
        username = e_current_username.getText().toString();
        t_current_username.setText("Current usernme: "+username);
    }

}