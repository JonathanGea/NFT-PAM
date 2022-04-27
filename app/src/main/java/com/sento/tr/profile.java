package com.sento.tr;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class profile extends Fragment implements View.OnClickListener {
    private TextView User,coin;
    private Button top,logout;
    String user;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        user = getActivity().getIntent().getStringExtra("user");
        String user1 = getActivity().getIntent().getStringExtra("user1");
        String pi = getActivity().getIntent().getStringExtra("pi");
        view = inflater.inflate(R.layout.profile, container, false);
        User = view.findViewById(R.id.user);
        coin = view.findViewById(R.id.coin);
        top = view.findViewById(R.id.buttonTop1);
        logout = view.findViewById(R.id.logout);
        top.setOnClickListener(this);
        if(pi == null)
        {
            User.setText(""+user);
            coin.setText("0");
        }
        else {
            User.setText(""+user1);
            coin.setText(pi);
        }
        return view;
    }

    @Override
    public void onClick(View view) {
        String pi1 = coin.getText().toString();
        String user = User.getText().toString();
        if(pi1 == null)
        {
            Intent intent = new Intent(getActivity(),topup.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(getActivity(),topup.class);
            intent.putExtra("pi1", pi1);
            intent.putExtra("user", user);
            startActivity(intent);
        }
    }


}

