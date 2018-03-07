package signos2.cursoandroid.com.signos2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaSignos;
    private String[] signos = {

            "Áries", "Touro", "Gêmeos", "Peixes", "Escorpião", "Virgem", "Aquário",
            "Capricórnio", "Sargitário", "Libra", "Câncer", "Leão"
    };
    private String[] Perfis = {

            "Em Áries, podemos encontrar espontaneidade, uma energia que é total impulso e um forte anseio por existir.",
            "Em Touro, podemos encontrar a pulsão da vida em sua intensidade máxima. ",
            "No signo de Gêmeos, podemos encontrar a manifestação viva do poder da linguagem.",
            "No signo de Peixes encontramos o pensamento no coletivo.",
            "Em Escorpião, podemos encontrar um criador de seu próprio destino.",
            "No signo de Virgem, podemos encontrar uma simplicidade funcional, que tem por objetivo o aperfeiçoamento do mundo circundante.",
            "No signo de Aquário encontramos a abertura a novas ideias.",
            "No signo de Capricórnio, podemos encontrar ambições específicas e metas bem definidas.",
            "No signo de Sagitário, podemos encontrar a dualidade entre o mundo real e o imaginário.",
            "No signo de Libra, podemos encontrar o desenvolvimento da consciência através dos relacionamentos interpessoais.",
            "Em Câncer, encontramos a ligação às origens.",
            "Em Leão, podemos encontrar a ideia de calor, de irradiação de luz."

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listViewId);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        listaSignos.setAdapter(adaptador);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int codigoPosicao = position;
                Toast.makeText(getApplicationContext(), Perfis[codigoPosicao], Toast.LENGTH_SHORT).show();
            }
        });

    }
}
