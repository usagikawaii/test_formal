package com.example.annieusa.welcome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Product extends AppCompatActivity {

    private Button button6;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        button6 = (Button)findViewById(R.id.button6);
        textView3 = (TextView)findViewById(R.id.textView3);

        button6.setOnClickListener(new Button.OnClickListener(){

            @Override

            public void onClick(View v) {

                // TODO Auto-generated method stub

                textView3.setText(" ");

            }

        });
    }

}



