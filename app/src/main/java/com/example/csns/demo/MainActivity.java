package com.example.csns.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Demo for Gitgub ", Toast.LENGTH_SHORT).show();
         Toast.makeText(this, "this toast is Chagened from git ", Toast.LENGTH_SHORT).show();
    }
}
