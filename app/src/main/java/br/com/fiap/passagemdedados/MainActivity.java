package br.com.fiap.passagemdedados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.campo_nome);
    }

    public void confirmar(View view) {
        String nome = edtNome.getText().toString();

        if (nome.trim().isEmpty()) {
            Toast.makeText(this, "Por favor informar seu nome", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent it = new Intent(this, BoasVindasActivity.class);
        it.putExtra("nome",nome);
        startActivity(it);
    }
}
