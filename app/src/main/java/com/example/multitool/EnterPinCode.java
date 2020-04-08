package com.example.multitool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

public class EnterPinCode extends AppCompatActivity {
    private Button enter;
    private Button cancel;
    private EditText pinCode;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_pin_code);
        enter = findViewById(R.id.button_enter);
        cancel = findViewById(R.id.button_cancel);
        pinCode = findViewById(R.id.edit_text_pin_code);
        toolbar = findViewById(R.id.toolBar);


    }


    public void hideApp(View view) {
    }
}
