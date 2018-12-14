package com.example.solucionalternativa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton agenda,catalogo,contacto,pedido;

        agenda = (ImageButton) findViewById(R.id.btnAgenda);
        catalogo = (ImageButton) findViewById(R.id.btnCatalogo);
        pedido = (ImageButton) findViewById(R.id.btnPedidos);
        contacto = (ImageButton) findViewById(R.id.btnContacto);

        agenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), AgendaActivity.class);
                startActivity(i);
            }
        });
        catalogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CatalogoActivity.class);
                startActivity(i);
            }
        });
        contacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ContactoActivity.class);
                startActivity(i);
            }
        });
        pedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PedidoActivity.class);
                startActivity(i);
            }
        });
    }
}
