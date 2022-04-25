package com.sento.tr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Username, Password;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = findViewById(R.id.LoginUsername);
        Password = findViewById(R.id.loginPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
    }

    public void login2(View v) {
        String username = Username.getText().toString();
        String password = Password.getText().toString();
        Intent intent = new Intent(this, fragment_main.class);
        intent.putExtra("user", username);
        intent.putExtra("pass", password);
        startActivity(intent);
    }
}
