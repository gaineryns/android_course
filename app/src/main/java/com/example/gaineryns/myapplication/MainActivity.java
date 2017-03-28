package com.example.gaineryns.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edtxt = (EditText) findViewById(R.id.editText2);
                TextView text1 = (TextView) findViewById(R.id.textView);

                text1.setText("Hello "+ edtxt.getText().toString() + "  !!");
            }
        });
    }
}
