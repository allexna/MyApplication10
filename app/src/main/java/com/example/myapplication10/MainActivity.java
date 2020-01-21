package com.example.myapplication10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public  void onClick(View view){
        String userEditText = "животное";
        String giftEditText = " в лоб";



        Intent intent=new Intent(MainActivity.this, myClass.class);startActivity(intent);

        Intent user = intent.putExtra("user", userEditText.toString());
        Intent gift = intent.putExtra("gift", giftEditText.toString());
        startActivity(intent);

    }
    public  void onClick2(View view){

        Intent intent=new Intent(MainActivity.this, Main2Activity.class);startActivity(intent);


    }
    public  void onClick3(View view){
        EditText userEditText = findViewById(R.id.editTextUser);
        EditText giftEditText = findViewById(R.id.editTextGift);


        Intent intent=new Intent(MainActivity.this, myClass.class);startActivity(intent);

       Intent user = intent.putExtra("user", userEditText.getText().toString());
         Intent gift = intent.putExtra("gift", giftEditText.getText().toString());
        startActivity(intent);


    }




}
