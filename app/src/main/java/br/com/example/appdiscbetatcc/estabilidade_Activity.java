package br.com.example.appdiscbetatcc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class estabilidade_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estabilidade);
    }

    public void Cancelar(View view) {
        finish();
    }
}
