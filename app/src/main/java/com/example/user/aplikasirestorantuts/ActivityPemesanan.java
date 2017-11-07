package com.example.user.aplikasirestorantuts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityPemesanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemesanan);

        TextView textView,textView1,textView2,textView3,textView4,textView5,textView6,textView7;
        EditText editText2,editText3,editText4,editText5,editText6,editText7,editText8;
        Button button2;
        textView = (TextView) findViewById(R.id.textView);
        textView1 = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView);
        textView3 = (TextView) findViewById(R.id.textView);
        textView4 = (TextView) findViewById(R.id.textView);
        textView5 = (TextView) findViewById(R.id.textView);
        textView6 = (TextView) findViewById(R.id.textView);

        editText2 = (EditText) findViewById(R.id.editText);
        editText3 = (EditText) findViewById(R.id.editText);
        editText4 = (EditText) findViewById(R.id.editText);
        editText5 = (EditText) findViewById(R.id.editText);
        editText6 = (EditText) findViewById(R.id.editText);
        editText7 = (EditText) findViewById(R.id.editText);
        editText8 = (EditText) findViewById(R.id.editText);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener((View.OnClickListener) this);
    }
}
