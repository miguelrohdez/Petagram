package com.miguerohdez.petagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void agregarFav(){
        FloatingActionButton miFav = (FloatingActionButton) findViewById(R.id.btnFav);

        miFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getBaseContext(), getResources().getString(R.string.action_btn), Toast.LENGTH_LONG).show();
                Snackbar.make(v, getResources().getString(R.string.action_btn), Snackbar.LENGTH_LONG)
                        .setAction(getResources().getString(R.string.app_name), new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Log.i("FuncionaSnack", "CLIKSNACK");
                            }
                        }) .show();
                System.out.println("Funciona");

            }
        });
    }
}