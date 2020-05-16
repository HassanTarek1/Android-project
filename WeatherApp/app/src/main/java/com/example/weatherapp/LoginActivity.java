package com.example.weatherapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    FirebaseAuth mAuth;
    EditText email,password;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth=FirebaseAuth.getInstance();
        email=findViewById(R.id.editText_email);
        password=findViewById(R.id.editText_pass);
        progressBar=findViewById(R.id.progressbarIn);
    }

    public void launchListActivity(View view) {
        userLogIn();
    }
    public void launchSignUpActivity(View view){
        Intent signUpIntent=new Intent(this,SignUpActivity.class);
        startActivity(signUpIntent);
    }
    private void userLogIn(){
        String email=this.email.getText().toString().trim();
        String password=this.password.getText().toString().trim();
        if(email.isEmpty()){
            this.email.setError("Email is required");
            this.email.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            this.email.setError("Please enter a valid email");
            this.email.requestFocus();
            return;
        }
        if(password.isEmpty()){
            this.password.setError("Password is required");
            this.password.requestFocus();
            return;
        }
        if (password.length()<6){
            this.password.setError("Minimum length of password is 6");
            this.password.requestFocus();
            return;
        }
        progressBar.setVisibility(View.VISIBLE);
        this.mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressBar.setVisibility(View.GONE);
                if (task.isSuccessful()){
                    Intent listIntent=new Intent(LoginActivity.this,ListActivity.class);
                    listIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(listIntent);
                }else{
                    Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
