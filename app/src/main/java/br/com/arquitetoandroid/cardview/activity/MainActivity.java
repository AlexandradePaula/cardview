package br.com.arquitetoandroid.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import br.com.arquitetoandroid.cardview.R;
import br.com.arquitetoandroid.cardview.adapter.PostagemAdapter;
import br.com.arquitetoandroid.cardview.model.Postagem;

import static android.widget.LinearLayout.HORIZONTAL;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();


    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Define layout
        //Visualizar como LinearLayout orientação Horizontal
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(HORIZONTAL);

        //Visualizar como GridLayoutManager
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerPostagem.setLayoutManager( layoutManager);

        //Define adapter
        this.prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }
    public void prepararPostagens(){

        Postagem p = new Postagem("Alexandra dos Santos","#tbt viagem legal!", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("Alexandra dos Santos","#tbt viagem legal!", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Alexandra dos Santos","#tbt viagem legal!", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Alexandra dos Santos","#tbt viagem legal!", R.drawable.imagem4);
        this.postagens.add(p);

    }

}