package com.example.chhun.buyfromus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PINVerification extends AppCompatActivity {

    EditText p_v_pin_input;
    String pin_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinverification);

        p_v_pin_input = (EditText) findViewById(R.id.p_v_pin_input);
    }
    public void submitPin(View view) {
//        pin_value = Integer.parseInt((p_v_pin_input.toString()));
        pin_value = p_v_pin_input.getText().toString();
        if (pin_value.equals("100298")){
            Intent i = new Intent(PINVerification.this, Receipt.class);
            startActivity(i);
        }
    }
}
