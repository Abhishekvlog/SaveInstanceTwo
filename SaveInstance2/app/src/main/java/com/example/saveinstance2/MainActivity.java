package com.example.saveinstance2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mtvSaveInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtvSaveInstance = findViewById(R.id.SaveInstance);
        mtvSaveInstance.setText("Welcome to Masai School");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String data =savedInstanceState.getString("key");
        mtvSaveInstance.setText(data);

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("key", "Screen Rotated");
    }
}