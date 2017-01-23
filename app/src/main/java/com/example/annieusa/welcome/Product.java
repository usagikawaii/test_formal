package com.example.annieusa.welcome;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.DialogInterface;

public class Product extends AppCompatActivity {

    private Button button6;

    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this).create();;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        button6 = (Button)findViewById(R.id.button6);

        dialog.setTitle("基本訊息對話按鈕");
        dialog.setMessage("基本訊息對話功能介紹");
        dialog.setNeutralButton("OK",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                // TODO Auto-generated method stub
                }
        });

        button6.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                dialog.show();
            }

        });
    }

}



