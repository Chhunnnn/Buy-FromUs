package com.example.chhun.buyfromus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PhoneNumber extends AppCompatActivity {

    EditText p_n_phonenumber_input;

    String phone_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number);

        p_n_phonenumber_input = (EditText) findViewById(R.id.p_n_phonenumber_input);

    }
    public void submit(View view){
//        phone_value = Integer.parseInt(p_n_phonenumber_input.toString());
        phone_value = p_n_phonenumber_input.getText().toString();
        if (phone_value.equals("94765764108")){
            Intent i = new Intent(PhoneNumber.this, PINVerification.class);
            startActivity(i);
        }

    }
    public void cancel (View view) {
        Intent i = new Intent(PhoneNumber.this, PurchaseUnit.class);
        startActivity(i);
    }
}
