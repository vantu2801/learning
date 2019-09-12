package com.example.learning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnResult;
    private EditText edtNumberA,edtNumberB;
    private int numberA,numberB;
    private String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnResult=findViewById(R.id.btn_result);
        edtNumberA=findViewById(R.id.edt_numberA);
        edtNumberB=findViewById(R.id.edt_numberB);

      btnResult.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              numberA = Integer.parseInt( edtNumberA.getText().toString());
              numberB = Integer.parseInt( edtNumberB.getText().toString());
              result=String.valueOf(numberB+numberA);
              Toast.makeText(MainActivity.this, result,Toast.LENGTH_LONG).show();
          }
      });
    }
}
