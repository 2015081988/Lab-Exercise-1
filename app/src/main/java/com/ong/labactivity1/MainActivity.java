package com.ong.labactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button mPortalBtn, mGreetingsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPortalBtn = findViewById(R.id.btn_portals);
        mGreetingsBtn = findViewById(R.id.btn_greetings);
        mPortalBtn.setOnClickListener((view) -> openActivity(UstHomeActivity.class));
        mGreetingsBtn.setOnClickListener((view)-> executeService(MyService.class));
    }

    private void executeService(Class activityClass){
        Intent i = new Intent(this, activityClass);
        startService(i);
    }

    private void openActivity(Class activityClass){
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }

}