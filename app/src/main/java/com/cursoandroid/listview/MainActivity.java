package com.cursoandroid.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private String[] itens = {
            "Angra dos Reis", "Caldas Novas", "Campos do Jordão", "Costa do Sauípe",
            "Ilhéus", "Porto Seguro", "Tiradentes", "Praga", "Santiago", "Zurique",
            "Caribe", "Buenos Aires", "Budapeste", "Cancún", "Aruba"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.listLocais);

        //Criar adaptador para a Lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(), //Contexto
                android.R.layout.simple_list_item_1, //Escolha do Layout
                android.R.id.text1, // ID dentro do simple_list_item
                itens // Meu array
        );

        //Adicionar o adaptador na lista
        listLocais.setAdapter(adaptador);

        //Adicionar click na lista
        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String valorSelecionado = listLocais.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(), valorSelecionado, Toast.LENGTH_SHORT).show();

            }
        });

    }



}
