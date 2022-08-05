package com.mega.constraintdesign;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mega.constraintdesign.bottomsheetdialog.BottomNavigationActivity;

public class MainActivity extends AppCompatActivity {
    Button saveAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        saveAdd=findViewById(R.id.saveAdd);
        saveAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BottomNavigationActivity.class);
                startActivity(intent);
            }
        });


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        }
}