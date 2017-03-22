package com.anantjaitha.workoutbuddy;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckedTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final CheckedTextView set11 = (CheckedTextView) findViewById(R.id.set11);

        set11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                set11.toggle();
            }
        });

        final CheckedTextView set12 = (CheckedTextView) findViewById(R.id.set12);

        set12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                set12.toggle();
            }
        });

        final CheckedTextView set21 = (CheckedTextView) findViewById(R.id.set21);

        set21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                set21.toggle();
            }
        });

        final CheckedTextView set22 = (CheckedTextView) findViewById(R.id.set22);

        set22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                set22.toggle();
            }
        });

        final CheckedTextView set31 = (CheckedTextView) findViewById(R.id.set31);

        set31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                set31.toggle();
            }
        });

        final CheckedTextView set32 = (CheckedTextView) findViewById(R.id.set32);

        set32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                set32.toggle();
            }
        });

        final CheckedTextView set41 = (CheckedTextView) findViewById(R.id.set41);

        set41.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                set41.toggle();
            }
        });

        final CheckedTextView set42 = (CheckedTextView) findViewById(R.id.set42);

        set42.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                set42.toggle();
            }
        });

        final CheckedTextView set51 = (CheckedTextView) findViewById(R.id.set51);

        set51.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                set51.toggle();
            }
        });

        final CheckedTextView set52 = (CheckedTextView) findViewById(R.id.set52);

        set52.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                set52.toggle();
            }
        });

        final CheckedTextView set61 = (CheckedTextView) findViewById(R.id.set61);

        set61.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                set61.toggle();
            }
        });

        final CheckedTextView set62 = (CheckedTextView) findViewById(R.id.set62);

        set62.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                set62.toggle();
            }
        });

        final CheckedTextView set71 = (CheckedTextView) findViewById(R.id.set71);

        set71.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                set71.toggle();
            }
        });

        final CheckedTextView set72 = (CheckedTextView) findViewById(R.id.set72);

        set72.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                set72.toggle();
            }
        });

        final CheckedTextView set81 = (CheckedTextView) findViewById(R.id.set81);

        set81.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                set81.toggle();
            }
        });

        final CheckedTextView set82 = (CheckedTextView) findViewById(R.id.set82);

        set82.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                set82.toggle();
            }
        });

        final CheckedTextView set91 = (CheckedTextView) findViewById(R.id.set91);

        set91.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                set91.toggle();
            }
        });

        final CheckedTextView set92 = (CheckedTextView) findViewById(R.id.set92);

        set92.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                set92.toggle();
            }
        });

        final CheckedTextView set101 = (CheckedTextView) findViewById(R.id.set101);

        set101.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                set101.toggle();
            }
        });

        final CheckedTextView set102 = (CheckedTextView) findViewById(R.id.set102);

        set102.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                set102.toggle();
            }
        });

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
}
