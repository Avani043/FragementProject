package com.example.acer.fragement;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Fragment f1;
    private Fragment f2;
    private Fragment f3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f1=new Fragment();
        f2=new Fragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.f1,f1)
                .replace(R.id.f2,f2)
                .commit();
    }
}
