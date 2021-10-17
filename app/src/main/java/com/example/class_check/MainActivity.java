package com.example.class_check;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

//HW
//calc with 1-0
//        + - = / *
//on clicking 1 we should be able to see it on edit text
//click 2
//12
//click +
//12 disappears and gets stored in a variable
//click 654
//click =
//654 stored in num2
//computation should be done and show case value(use flags for each operation )
//flag intial 0
//selected it becomes 1
public class MainActivity extends AppCompatActivity {

    CheckBox c1;
    CheckBox c2;
    CheckBox c3;
    CheckBox c4;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.bt);
        c1 = findViewById(R.id.cb1);
        c2 = findViewById(R.id.cb2);
        c3 = findViewById(R.id.cb3);
        c4 = findViewById(R.id.cb4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "";//if any checkbox is ticked we will append it to this string...store it in this string
                if(c1.isChecked())
                    s = s+c1.getText().toString()+ " ";//we take the value and append in s
                if(c2.isChecked())
                    s=s+c2.getText().toString()+ " ";//we take the value and append in s
                if(c3.isChecked())
                    s=s+c3.getText().toString()+ " ";//we take the value and append in s
                if(c4.isChecked())
                    s=s+c4.getText().toString()+ " ";//we take the value and append in s
                if(s.isEmpty())
                    Toast.makeText(MainActivity.this,"No items selected",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,s+"Selected",Toast.LENGTH_SHORT).show();

            }
        });

    }
}