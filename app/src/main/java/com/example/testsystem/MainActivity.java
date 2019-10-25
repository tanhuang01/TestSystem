package com.example.testsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.testsystem._01_testNotification.TestNotificationActivity;

public class MainActivity extends AppCompatActivity {

    private Button _01_bt_SystemNotification;
    private Button _02_bt_immersive_notification_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 系统通知权限
        _01_bt_SystemNotification = findViewById(R.id._01_bt_test_notification);
        _01_bt_SystemNotification.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, TestNotificationActivity.class)));

        // 沉浸式效果
        _02_bt_immersive_notification_bar = findViewById(R.id._02_bt_test_immersive_notification_bar);

    }
}
