package com.example.kson.reflectannotation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kson.reflectannotation.butterknife.ContentView;
import com.example.kson.reflectannotation.butterknife.MyBindView;
import com.example.kson.reflectannotation.butterknife.MyButterKnife;

import butterknife.BindView;
import butterknife.ButterKnife;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @MyBindView(R.id.tv)
    TextView tv;
    @MyBindView(R.id.btn)
    Button button;
    @MyBindView(R.id.btn2)
    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyButterKnife.bind(this);

        tv.setText("kson");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "button", Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "button2", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
