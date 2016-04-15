package com.example.android.formats;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    public TextView disp;
     public Button button;
    public  String xyz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        //disp = (TextView) findViewById(R.id.displayText);
       //
        button = (Button) findViewById(R.id.leaveLetter);

        xyz= getString(R.string.leaveLetter);
       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void action (View view) {
        //Intent intent = new Intent(this, secondactivity.class);
        switch (view.getId()) {
            case R.id.leaveLetter:
                Intent intent = new Intent(this, secondactivity.class);
                intent.putExtra("my_key", "leaveletter");
                startActivity(intent);
                break;
            case R.id.coverLetter:
                Intent intent1 = new Intent(this, secondactivity.class);
                intent1.putExtra("my_key", "coverLetter");
                startActivity(intent1);
                break;
            case R.id.resume:
                Intent intent2 = new Intent(this, imageactivity.class);
                startActivity(intent2);

                break;

            case R.id.formalLetter:
                Intent intent3 = new Intent(this, formalactivity.class);
                intent3.putExtra("my_key", "formalLetter");
                startActivity(intent3);
                break;

            case R.id.magazineArticle:
                Intent intent4 = new Intent(this, magazineactivity.class);
                intent4.putExtra("my_key", "magazineArticle");
                startActivity(intent4);
                break;
        }

    }

}
