package com.fskappa.javadex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class pokedex extends AppCompatActivity {
    private ImageButton pikachu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokedex);
        pikachu = (ImageButton) findViewById(R.id.pikachu);

        pikachu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), pokemon.class);
                intent.putExtra("nome", "pikachu");
                startActivity(intent);
            }
        });

    }
}
