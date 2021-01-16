package com.example.conversion;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    EditText E1;
    EditText E2;

    public void Conv(View view){

        E1 = (EditText)findViewById(R.id.e1);
        E1.setInputType(InputType.TYPE_CLASS_NUMBER);

        E2 = (EditText)findViewById(R.id.e2);
        E2.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(E1.getText().toString());

        E2.setText(String.valueOf(a*140));

        Button b1=(Button) findViewById(R.id.b1);
        b1.setEnabled(false);




    }


}
