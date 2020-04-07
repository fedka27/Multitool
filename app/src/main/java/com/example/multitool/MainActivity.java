package com.example.multitool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button appHider;
    private Button addBlocker;
    private Button smsReceiver;

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
    }

    public void enterPinCode(View view) {
        Intent intent = new Intent(MainActivity.this, EnterPinCode.class);
        startActivity(intent);
    }
}
