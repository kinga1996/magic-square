package com.example.magictriangle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    }

    public void newGame(View v){

    }

    public void resume(View v){

    }

    public void quit(View v){
        this.finish();
    }
}