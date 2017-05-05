package com.rajmakda.dibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LogInActivity extends AppCompatActivity {


    private EditText input_email;
    private EditText input_password;
    TextView signupLink;
    Button logInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        input_email = (EditText) findViewById(R.id.lastNameEditText);
        input_password = (EditText) findViewById(R.id.passwordEditText);
        signupLink = (TextView)findViewById(R.id.signup_link_textview);
        logInButton = (Button) findViewById(R.id.logInButton);
    }

    /*
   Login Button onClick
    */
    public void logIn(View view)    {
        Toast.makeText(this, "Button Working", Toast.LENGTH_SHORT).show();
    }

    /*
    Sign up TextView onClick
     */
    public void signUpClicked(View view)    {
        Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
        startActivity(intent);
    }
}
