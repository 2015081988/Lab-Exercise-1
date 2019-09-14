package com.ong.labactivity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class UstHomeActivity extends AppCompatActivity {

    private Button mMyUsteBtn, mUstBtn, mBlackboardBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ust_home);
        mBlackboardBtn = findViewById(R.id.btn_blackboard_website);
        mMyUsteBtn = findViewById(R.id.btn_myuste_website);
        mUstBtn = findViewById(R.id.btn_ust_website);
        mBlackboardBtn.setOnClickListener((view) -> openUrl("https://ust.blackboard.com"));
        mMyUsteBtn.setOnClickListener((view) -> openUrl("https://myuste.ust.edu.ph"));
        mUstBtn.setOnClickListener((view) -> openUrl("http://www.ust.edu.ph/"));
    }


    private void openUrl(String url){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
