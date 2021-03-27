package com.example.firstapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    public void buttonclick(View v){
        //Toast.makeText(getApplicationContext(), "버튼을 눌렀습니다!", Toast.LENGTH_LONG).show();
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
        startActivity(i);
    }

}