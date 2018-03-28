package com.example.android.myapplicationdynamicfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyFragment fragment = new MyFragment();
        getFragmentManager().beginTransaction()
                .add(R.id.myContainer,fragment)
                .commit();
    }
}
