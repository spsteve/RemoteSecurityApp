package com.example.remotesecurityapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    Button armButton, disarmButton, rtspButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        armButton = findViewById(R.id.buttonArm);
        disarmButton = findViewById(R.id.buttonDisarm);
        rtspButton = findViewById(R.id.buttonRTSP);

        armButton.setOnClickListener(v -> {
            // Send Arm command (placeholder)
        });

        disarmButton.setOnClickListener(v -> {
            // Send Disarm command (placeholder)
        });

        rtspButton.setOnClickListener(v -> {
            Intent intent = new Intent(DashboardActivity.this, RTSPStreamActivity.class);
            startActivity(intent);
        });
    }
}
