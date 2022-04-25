package com.sento.tr;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class detail extends AppCompatActivity {
    TextView name,price1,detail2;
    ImageView detial;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        name = findViewById(R.id.name1);
        detial = findViewById(R.id.detail);
        detail2 = findViewById(R.id.detail1);
        price1 = findViewById(R.id.price1);
        Intent intent = getIntent();
        name.setText(intent.getStringExtra("nama"));
        price1.setText(intent.getStringExtra("harga"));
        detail2.setText(intent.getStringExtra("detail"));
        detial.setImageResource(intent.getIntExtra("image1",0));
    }
}
