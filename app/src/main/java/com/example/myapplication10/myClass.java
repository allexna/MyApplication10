package com.example.myapplication10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.myapplication10.R;

public class myClass extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        String user="Жывотное";
         String gift="дырку от бублика";
        Intent intent=getIntent();
         user = getIntent().getStringExtra("user");
        gift=getIntent().getStringExtra("gift");
        TextView infoTextView =findViewById(R.id.textView);
        infoTextView.setText((user+" , вам передали "+ gift));
    }
}
