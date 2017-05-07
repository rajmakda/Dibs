package com.rajmakda.dibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EmailVerificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_verification);
    }

    public void login(View view){
        Intent intent = new Intent(getApplicationContext(), LogInActivity.class);
        startActivity(intent);
    }
}
