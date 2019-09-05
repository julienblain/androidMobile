package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Injection2Activity extends AppCompatActivity {

    private ConstraintLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_injection2);

        this.myLayout = (ConstraintLayout) findViewById(R.id.injec2);

        ImageView image = new ImageView(this);
        ViewGroup.LayoutParams params = new ActionBar.LayoutParams(200, 200);
        image.setLayoutParams(params);
        image.setBackgroundResource(R.drawable.soleil);
        myLayout.addView(image);
    }
}
