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
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class SignUpActivity extends AppCompatActivity {

    EditText name,email,password,reTypePassword;
    private FirebaseAuth mAuth;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        name=findViewById(R.id.editTextName);
        email=findViewById(R.id.editTextEmailUp);
        password=findViewById(R.id.editTextPasswordUp);
        reTypePassword=findViewById(R.id.editTextRePassword);
        mAuth = FirebaseAuth.getInstance();
        progressBar=findViewById(R.id.progressbar);
    }

    public void SignUpClick(View view){
        registerUser();

    }

    private void registerUser(){
        String name=this.name.getText().toString().trim();
        String email=this.email.getText().toString().trim();
        String password=this.password.getText().toString().trim();
        String repass=this.reTypePassword.getText().toString().trim();
        if(name.isEmpty()){
            this.name.setError("Name is required");
            this.name.requestFocus();
            return;
        }
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
        if (!password.equals(repass)){
            this.reTypePassword.setError("Passwords do not match");
            this.reTypePassword.requestFocus();
            return;
        }
        progressBar.setVisibility(View.VISIBLE);
        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressBar.setVisibility(View.GONE);
                if (task.isSuccessful()){
                    Toast.makeText(getApplicationContext(), "User registered successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(SignUpActivity.this,LoginActivity.class));
                }
                else {
                    if (task.getException() instanceof FirebaseAuthUserCollisionException) {
                        Toast.makeText(getApplicationContext(), "User already registered", Toast.LENGTH_SHORT).show();
                        return;
                    }else{
                        Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }

}
