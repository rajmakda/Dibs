package com.rajmakda.dibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EmailVerificationActivity extends AppCompatActivity {

    TextView emailTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_verification);
       String email = getIntent().getStringExtra("Email");
        emailTextView = (TextView) findViewById(R.id.email_textView);
        emailTextView.setText(email);
    }

    public void login(View view){
        Intent intent = new Intent(getApplicationContext(), LogInActivity.class);
        startActivity(intent);
    }
}
