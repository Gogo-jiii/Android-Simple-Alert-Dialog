package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnShowDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowDialog = findViewById(R.id.btnShowDialog);
        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SimpleAlertDialog alertDialog = new SimpleAlertDialog(MainActivity.this);
                alertDialog.show(getSupportFragmentManager(), "simple dialog");
                alertDialog.setCancelable(false);
            }
        });
    }
}