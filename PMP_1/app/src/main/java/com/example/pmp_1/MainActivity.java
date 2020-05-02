package com.example.pmp_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText deafult_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        deafult_value= findViewById(R.id.editText);
        deafult_value.setEnabled(false);
        deafult_value.setText("Default Value");




        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Klikl jsi na button",Toast.LENGTH_LONG).show();
            }
        });

        final Button nextButton = findViewById(R.id.button2);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivity2();
            }
        });

    }

    public void openActivity2(){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
