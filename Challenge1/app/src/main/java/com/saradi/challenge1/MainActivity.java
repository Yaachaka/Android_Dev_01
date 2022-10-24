package com.saradi.challenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void btnRegister(View view)
    {
        EditText editTxtFstName = findViewById(R.id.editTxtFstName);
        EditText editTxtLastName = findViewById(R.id.editTxtLastName);
        EditText editTxtEmailAddress = findViewById(R.id.editTxtEmailAddress);

        TextView textViewFirstName = findViewById(R.id.textViewFirstName);
        TextView textViewLastName = findViewById(R.id.textViewLastName);
        TextView textViewEMailID = findViewById(R.id.textViewEMailID);

        textViewFirstName.setText("First Name: " + editTxtFstName.getText().toString());
        textViewLastName.setText("Last Name: " + editTxtLastName.getText().toString());
        textViewEMailID.setText("Email: " + editTxtEmailAddress.getText().toString());


    }
}