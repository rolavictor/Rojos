package com.example.solucionalternativa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.solucionalternativa.R;

public class CatalogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutcatalogo);

        Button tablet,movil,portatil;

        tablet = (Button) findViewById(R.id.BTNtablets);
        movil = (Button) findViewById(R.id.BTNmoviles);
        portatil = (Button) findViewById(R.id.BTNportatiles);

        tablet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TabletActivity.class);
                startActivity(i);
            }
        });
}
}