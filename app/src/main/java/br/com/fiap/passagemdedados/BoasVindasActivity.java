package br.com.fiap.passagemdedados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class BoasVindasActivity extends AppCompatActivity {

    TextView txtBoasVindas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boas_vindas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //Mostrar o botão
        getSupportActionBar().setHomeButtonEnabled(true);      //Ativar o botão
        getSupportActionBar().setTitle("Trabalhando com layouts"); //Titulo para ser exibido na sua Action Bar em frente à seta

        txtBoasVindas = findViewById(R.id.txtBoasVindas);

        Intent it = getIntent();
        if (it != null) {
            Bundle dados = it.getExtras();
            if (dados != null) {
                String nome = dados.getString("nome");
                String msg = String.format("Seja bem vindo, %s", nome);
                txtBoasVindas.setText(msg);
            }
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) { //Botão adicional na ToolBar
        switch (item.getItemId()) {
            case android.R.id.home:  //ID do seu botão (gerado automaticamente pelo android, usando como está, deve funcionar
                startActivity(new Intent(this, MainActivity.class));  //O efeito ao ser pressionado do botão (no caso abre a activity)
                finishAffinity();  //Método para matar a activity e não deixa-lá indexada na pilhagem
                break;
            default:break;
        }
        return true;
    }
}
