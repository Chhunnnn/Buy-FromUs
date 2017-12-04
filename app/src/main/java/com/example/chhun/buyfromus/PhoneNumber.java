package com.example.chhun.buyfromus;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        AlertDialog.Builder ad = new AlertDialog.Builder(PhoneNumber.this);
        ad.setMessage("Are you sure, you want to buy this ticket? You will be charged USD 15.00!")
                .setCancelable(false)
                .setPositiveButton("Proceed", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
//                        finish();
                        phone_value = p_n_phonenumber_input.getText().toString();
                        if (phone_value.equals("94765764108")){
                            Intent i = new Intent(PhoneNumber.this, PINVerification.class);
                            startActivity(i);
                        }
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = ad.create();
        alert.setTitle("BuyFromUs");
        alert.show();
    }
    public void cancel (View view) {
        Intent i = new Intent(PhoneNumber.this, PurchaseUnit.class);
        startActivity(i);
    }
}
