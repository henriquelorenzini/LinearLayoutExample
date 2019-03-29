package com.example.linearlayoutexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonEntrarClick(View view){
        EditText usuarioEditText = findViewById(R.id.editTextUsuario);
        String usuario = usuarioEditText.getText().toString();

        EditText senhaEditText = findViewById(R.id.editTextsenha);
        String senha = senhaEditText.getText().toString();

        TextView resultadoTextView =  findViewById(R.id.textViewResultado);
        resultadoTextView.setText("Usuário: " + usuario + "\nSenha: " + senha);
    }

}
