package com.sento.tr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    private EditText TextUsername,TextPassword, TextCPassword;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        TextUsername = findViewById(R.id.TextUsername);
        TextPassword = findViewById(R.id.TextPassword);
        TextCPassword = findViewById(R.id.TextCPassword);
        buttonRegister = findViewById(R.id.buttonRegister);
    }

    public void login3(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void register(View v){
        String username = TextUsername.getText().toString();
        String password = TextPassword.getText().toString();
        String Cpassword = TextCPassword.getText().toString();
        if(username.length()==0){
            TextUsername.setError("");
            Toast.makeText(getBaseContext(),"Username Field is empty",Toast.LENGTH_LONG).show();
        }
        else if(password.length()==0)
        {
            TextPassword.setError("");
            Toast.makeText(getBaseContext(),"Password Field is empty",Toast.LENGTH_LONG).show();
        }
        else if(Cpassword.length()==0)
        {
            TextCPassword.setError("");
            Toast.makeText(getBaseContext(),"Confrim Password Field is empty",Toast.LENGTH_LONG).show();
        }

        else if(!Cpassword.equals(password))
        {
            TextCPassword.setError("");
            Toast.makeText(getBaseContext(),"Unidentical Confrim Password with password",Toast.LENGTH_LONG).show();
        }
        else {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("user", username);
            intent.putExtra("pass", password);
            startActivity(intent);
        }
    }
}