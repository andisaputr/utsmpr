package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
        snackbarTest();
    }

    private void snackbarTest() {
        Snackbar snackbar = Snackbar.make(
                findViewById(R.id.tampilhasil),
                "Pindah Halaman",
                Snackbar.LENGTH_SHORT
        );
    snackbar.show();
    }

}