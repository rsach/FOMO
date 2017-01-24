package com.example.rahul.fomo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
        myRef.setValue("Hello, World!");

        Intent a = new Intent(MainActivity.this,LoginActivity.class);
        this.startActivity(a);
// Todo create a log in
// Todo create a host user with a group id
        // Todo connect the user with the host user by nfc
        // Todo create a hostspot
        // Todo music will be played by the host user
        // Todo shuffle the music list such that every user gets to listen a song from their playlist
        // todo host will host a server which will let each user stream music once in a loop according to the length of the group





    }
}
