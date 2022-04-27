package com.sento.tr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class topup extends AppCompatActivity {
    private EditText Pi;
    String user;
Float a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topup);
        Pi = findViewById(R.id.Pi);
        Intent intent = getIntent();
        String pi1 = intent.getStringExtra("pi1");
        user = intent.getStringExtra("user");
        a = Float.parseFloat(pi1);
    }

    public void Top(View v) {
        DecimalFormat df = new DecimalFormat("#.##");
        String pi = Pi.getText().toString();
        b = Float.parseFloat(pi);
        c = a+b;
        String s=String.valueOf(df.format(c));
        Intent intent = new Intent(this, fragment_main.class);
        intent.putExtra("pi", s);
        intent.putExtra("user1", user);
        startActivity(intent);
    }
}
