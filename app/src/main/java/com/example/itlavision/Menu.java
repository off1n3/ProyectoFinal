package com.example.itlavision;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    ImageView btncodbarra, btntraductor, btnQR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        btncodbarra = findViewById(R.id.btnCodBarra);
        btnQR = findViewById(R.id.btnQR);
        btntraductor = findViewById(R.id.btnTrans);

        btncodbarra.setClickable(true);
        btntraductor.setClickable(true);
        btnQR.setClickable(true);


        btncodbarra.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnCodBarra){
            Toast.makeText(this, "Toast CodB", Toast.LENGTH_SHORT).show();
        }

        if(v.getId() == R.id.btnTrans){
            Toast.makeText(this, "Toast Transla", Toast.LENGTH_SHORT).show();
        }

        if(v.getId() == R.id.btnQR){
            Toast.makeText(this, "Toast CodB", Toast.LENGTH_SHORT).show();
        }
    }
}
