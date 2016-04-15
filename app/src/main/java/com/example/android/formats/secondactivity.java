package com.example.android.formats;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {

    Intent intent;
    String string;
    TextView tview;
    //ImageView vview;
    Button GB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        intent = getIntent();
        tview = (TextView) findViewById(R.id.Textresult);
        GB = (Button) findViewById(R.id.GB);
        string = intent.getExtras().getString("my_key");
        switch (string) {
            case "leaveletter":
                tview.setText(R.string.leaveLetter);
                break;
            case "coverLetter":
                tview.setText (R.string.coverLetter);
                //getDrawable(R.drawable.Resume1);
                // tview.setText(R.string.app_name);
            case "formalLetter":
                tview.setText(R.string.formalLetter);
                break;
        }

    }

    public void go_back(View view) {
        finish();
    }
}
