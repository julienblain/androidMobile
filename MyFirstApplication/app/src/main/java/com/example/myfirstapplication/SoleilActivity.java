package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SoleilActivity extends AppCompatActivity {

    private ImageView homeImg;

    private TextView countText;

    int count;

   // private final int count =0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soleil);

        count =0;

        this.homeImg = findViewById(R.id.soleil2);
        this.homeImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                countText = (TextView) findViewById(R.id.count2);
                count = ++count;
                countText.setText("Compteur de click : " + count);
            }
        });

    }


}
