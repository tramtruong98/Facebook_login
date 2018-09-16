package com.example.tram.loginfacebook;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView btn_sign_up = (TextView) findViewById(R.id.btn_sign_up);

        btn_sign_up.setPaintFlags(btn_sign_up.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);


    }
}
