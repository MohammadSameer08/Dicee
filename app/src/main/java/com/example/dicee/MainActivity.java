package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button rol;
ImageView die1,die2;
int dicee[]={R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rol=(Button)findViewById(R.id.btnroll);
        die1=(ImageView) findViewById(R.id.die1);
        die2=(ImageView) findViewById(R.id.die2);
       rol.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v)
           {
               Random random=new Random();
               int r=random.nextInt(6);
               die1.setImageResource(dicee[r]);
               int x=random.nextInt(6);
               die2.setImageResource(dicee[r]);//

           }
       });


    }
}
