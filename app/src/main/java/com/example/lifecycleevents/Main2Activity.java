package com.example.lifecycleevents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        System.out.print("onCreate2 Method \n");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.print("onStart2 Method \n");

    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.print("onResume2 Method \n");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.print("onPause2 Method \n");

    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.print("onStop2 Method \n");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        System.out.print("onRestart2 Method \n");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        System.out.print("onDestroy2 Method \n");

    }
}
