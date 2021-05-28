package com.example.commtwoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onSendClick(View v)
    {
        if(v.getId() == R.id.button_send2) {
            EditText name = (EditText) findViewById(R.id.editmessage2);

            //Text entered in the textview is assigned to a variable and to string
            String namestr = name.getText().toString();

            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }


}
