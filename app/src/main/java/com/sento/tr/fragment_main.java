package com.sento.tr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class fragment_main extends AppCompatActivity {
    ImageView far1,far2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
        far1 = findViewById(R.id.Fr1);
        far2 = findViewById(R.id.Fr2);

    }
    public void fr1(View v) {
        replaceFragment(new home());
    }
    public void fr2(View v) {
        replaceFragment(new profile());
    }
    public void log1(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void syarat(View v) {
        Intent intent = new Intent(this, sk.class);
        startActivity(intent);
    }
    public void kebijakan(View v) {
        Intent intent = new Intent(this, kp.class);
        startActivity(intent);
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame,fragment);
        ft.commit();
    }

    }

