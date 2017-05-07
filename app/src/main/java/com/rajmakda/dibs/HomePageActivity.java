package com.rajmakda.dibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void signOut(View view)  {
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(getApplicationContext(), LogInActivity.class);
        startActivity(intent);
    }
}
