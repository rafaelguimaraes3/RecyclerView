package rafael.guimaraes.recyclerview.activity.activity.adapter;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import rafael.guimaraes.recyclerview.R;
import rafael.guimaraes.recyclerview.activity.activity.model.Cursos;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Cursos> listaCursos;

    public Adapter(List<Cursos> lista) {
        this.listaCursos=lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Cursos cursos = listaCursos.get(position);
        holder.curso.setText(cursos.getCursoCursos());
        holder.valor.setText(cursos.getValorCursos());
        holder.tempo.setText(cursos.getTempoCursos());
        holder.professor.setText(cursos.getProfessorCursos());
        //holder.imagem.setImageResource('res/drawable/_03_java.xml');
    }

    @Override
    public int getItemCount() {
        return listaCursos.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView curso;
        TextView valor;
        TextView tempo;
        TextView professor;
        ImageView imagem;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            curso = itemView.findViewById(R.id.textCurso);
            valor = itemView.findViewById(R.id.textValor);
            tempo = itemView.findViewById(R.id.textTempo);
            professor = itemView.findViewById(R.id.textProf);
            imagem = itemView.findViewById(R.id.imageCurso);

        }
    }
}
