package com.example.lifecycleevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.Navigate);
        System.out.println("onCreate1 method \n");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart1 method \n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.print("onStop1 Method \n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.print("onDestroy1 Method \n");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.print("onPause1 Method \n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.print("onResume1 Method \n");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        System.out.print("onReStart1 Method \n");

    }
}
