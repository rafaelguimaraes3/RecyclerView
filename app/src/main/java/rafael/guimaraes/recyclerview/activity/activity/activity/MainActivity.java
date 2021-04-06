package rafael.guimaraes.recyclerview.activity.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import rafael.guimaraes.recyclerview.R;
import rafael.guimaraes.recyclerview.activity.activity.RecyclerItemClickListener;
import rafael.guimaraes.recyclerview.activity.activity.adapter.Adapter;
import rafael.guimaraes.recyclerview.activity.activity.model.Cursos;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;


    private List<Cursos> listaCursos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        this.criarCursos();

        Adapter adapter = new Adapter(listaCursos);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Cursos cursos = listaCursos.get(position);
                                Toast.makeText(getApplicationContext(), cursos.getCursoCursos() + " "+ cursos.getValorCursos(), Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Cursos cursos = listaCursos.get(position);
                                Toast.makeText(getApplicationContext(), cursos.getProfessorCursos() + " "+ cursos.getTempoCursos(), Toast.LENGTH_LONG).show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )
        );

    }
    public void criarCursos(){

        Cursos cursos = new Cursos("Curso: Java", "Valor: R$ 39,90", "Tempo de curso: 12 Horas", "Professor: João Lima", R.drawable.java);
        this.listaCursos.add(cursos);

        cursos = new Cursos("Curso: PHP", "Valor: R$ 59,90", "Tempo de curso: 22 Horas", "Professor: Pedro Amaro", R.drawable.php);
        this.listaCursos.add(cursos);

        cursos = new Cursos("Curso: CSS", "Valor: R$ 29,90", "Tempo de curso: 5 Horas", "Professor: Carlos Magno", R.drawable.css);
        this.listaCursos.add(cursos);

        cursos = new Cursos("Curso: Javascript", "Valor: R$ 69,90", "Tempo de curso: 24 Horas", "Professor: Pedro Amaro", R.drawable.javascript);
        this.listaCursos.add(cursos);

        cursos = new Cursos("Curso: Python", "Valor: R$ 39,90", "Tempo de curso: 9 Horas", "Professor: Renata Lyra", R.drawable.python);
        this.listaCursos.add(cursos);

        cursos = new Cursos("Curso: Ruby", "Valor: R$ 69,90", "Tempo de curso: 24 Horas", "Professor: Pedro Amaro", R.drawable.ruby);
        this.listaCursos.add(cursos);

        cursos = new Cursos("Curso: C","Valor: R$ 39,90", "Tempo de curso: 12 Horas", "Professor: João Lima", R.drawable.c);
        this.listaCursos.add(cursos);

        cursos = new Cursos("Curso: C++","Valor: R$ 39,90", "Tempo de curso: 12 Horas", "Professor: João Lima", R.drawable.cplusplus);
        this.listaCursos.add(cursos);

        cursos = new Cursos("Curso: C#","Valor: R$ 39,90", "Tempo de curso: 12 Horas", "João Lima", R.drawable.csharp);
        this.listaCursos.add(cursos);

    }


}