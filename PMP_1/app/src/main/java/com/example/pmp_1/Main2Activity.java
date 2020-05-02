package com.example.pmp_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button nextButton = findViewById(R.id.button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivity1();
            }
        });
    }

    public void openActivity1(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
