package com.sento.tr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        Intent intent = getIntent();
        String user = intent.getStringExtra("user");
        String pass = intent.getStringExtra("pass");
        if(username.equals(user)&&password.equals(pass)) {
            Intent intent1 = new Intent(this, fragment_main.class);
            intent1.putExtra("user", username);
            intent1.putExtra("pass", password);
            startActivity(intent1);
        }
        else if(username.length()==0)
        {
            Username.setError("");
            Toast.makeText(getBaseContext(),"Username field is empty",Toast.LENGTH_LONG).show();
        }
        else if(password.length()==0)
        {
            Password.setError("");
            Toast.makeText(getBaseContext(),"Password Field is empty",Toast.LENGTH_LONG).show();
        }
        else if(!username.equals(user))
        {
            Username.setError("");
            Toast.makeText(getBaseContext(),"Wrong Username",Toast.LENGTH_LONG).show();
        }
        else if(!password.equals(pass))
        {
            Password.setError("");
            Toast.makeText(getBaseContext(),"Wrong Password",Toast.LENGTH_LONG).show();
        }
    }

    public void register1(View v) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}
