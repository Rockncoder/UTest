package com.tekadept.utest.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {
    TextView txtGreeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtGreeting = (TextView)findViewById(R.id.greeting);
        Random rndGenerator = new Random();
        int rnd = rndGenerator.nextInt(4);
        String greeting = getGreeting(rnd);
        txtGreeting.setText(greeting);
    }

    public String getGreeting(int msgNumber) {
        String greeting;
        switch(msgNumber){
            case 0:
                greeting = "Hola mundo";
                break;
            case 1:
                greeting = "Bonjour tout le monde";
                break;
            case 2:
                greeting = "Ciao mondo";
                break;
            case 3:
                greeting = "Hallo Welt";
                break;
            default:
                greeting = "Hello world";
                break;
        }
        return greeting;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
