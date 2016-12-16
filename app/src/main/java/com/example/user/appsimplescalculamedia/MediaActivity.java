package com.example.user.appsimplescalculamedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MediaActivity extends AppCompatActivity {

    private EditText nota1;
    private EditText nota2;
    private EditText nota3;
    private Button btnCalcular;
    private TextView mediaFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        nota1 = (EditText) findViewById(R.id.txtNota1);
        nota2 = (EditText) findViewById(R.id.txtNota2);
        nota3 = (EditText) findViewById(R.id.txtNota3);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        mediaFinal = (TextView) findViewById(R.id.txtMediaFinal);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double n1 = Double.valueOf(nota1.getText().toString());
                Double n2 = Double.valueOf(nota2.getText().toString());
                Double n3 = Double.valueOf(nota3.getText().toString());
                Double media = (n1 + n2 + n3)/3;
                mediaFinal.setText(media.toString());
            }
        });

    }
}
