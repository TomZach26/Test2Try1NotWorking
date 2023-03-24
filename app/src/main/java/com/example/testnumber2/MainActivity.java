package com.example.testnumber2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText numberinput;
Button btnSendNum;
GameActivity gameActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberinput.findViewById(R.id.ETnumInput);
        btnSendNum.findViewById(R.id.btnSend);


        btnSendNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numofsquares;
                numofsquares = numberinput.getText().toString();
                gameActivity.NumOfSquares = numofsquares;
                openGame();
            }
        });
    }
    public void openGame()
    {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);

    }

}