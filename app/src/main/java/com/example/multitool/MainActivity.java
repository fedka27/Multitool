package com.example.multitool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Button appHider;
    private Button addBlocker;
    private Button smsReceiver;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListener();
    }
    private void initListener(){
        appHider = findViewById(R.id.button_app_hider);
        addBlocker = findViewById(R.id.button_add_blocker);
        smsReceiver = findViewById(R.id.button_sms_receiver);
        toolbar =  findViewById(R.id.toolBar);
    }

    public void enterPinCode(View view) {
        Intent intent = new Intent(MainActivity.this, EnterPinCode.class);
        startActivity(intent);
    }

}
