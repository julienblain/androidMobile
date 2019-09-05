package com.example.myfirstapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    private ImageView soleil;
    private TextView text = null;
    private Button btnImc;
    private MediaPlayer mediaPlayer;
    private  Menu menu = null;
    private Button buttonPop;
    private Button buttonInjec;

    private MainActivity activity;

    public NotificationManager notificationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        this.soleil = (ImageView) findViewById(R.id.soleil);
        this.buttonPop = findViewById(R.id.pop);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.son);

        //envoie toast-notification
        buttonPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*toast
                Context context = getApplicationContext();
                CharSequence text = "hello hello hello";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                toast.show(); */

                AlertDialog.Builder pop = new AlertDialog.Builder(activity);
                pop.setTitle("sdfsdf");
                pop.setMessage("sdqfqs");
                pop.show();
            }

        });
        this.activity = this; //le pop est lié a la page et va la remplacer, ecraser pdt un moment donc on lie le layout au popup

        this.buttonInjec = findViewById(R.id.buttonInjec);
        buttonInjec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //renvoie vers une autre page
                Intent oActivity = new Intent(getApplicationContext(), Injection2Activity.class);
                startActivity(oActivity);
                finish();
            }
        });

        this.soleil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), SoleilActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }

    public void sound(View view) {
        mediaPlayer.start();
    }

    public void imcPage1(View view) {
        setContentView(R.layout.activity_imc);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        //R.menu.menu est l'id de notre menu
        inflater.inflate(R.menu.game_menu, menu);
        return true;
    }



}

