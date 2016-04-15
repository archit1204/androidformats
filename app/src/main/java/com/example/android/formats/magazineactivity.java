package com.example.android.formats;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class magazineactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magazineactivity);
    }

    public void sample (View view){
        Intent intent = new Intent(this, sampleactivity.class);
        startActivity(intent);
    }
}
