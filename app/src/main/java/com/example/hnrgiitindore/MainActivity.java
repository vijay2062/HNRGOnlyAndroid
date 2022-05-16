package com.example.hnrgiitindore;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // creating three buttons
    // by the of btn1, btn2,btn3,btn3,btn4
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // connecting buttons with the
        // layout using findViewById()
        btn1= findViewById(R.id.button);
        btn2= findViewById(R.id.button2);

        // apply setOnClickListener over buttons
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

    }

    // common onClick() for all buttons
    @Override
    public void onClick(View v) {

        switch (v.getId()){

            // cases applied over different buttons
            case R.id.button:

                // Toast message appears when button pressed
//                Toast.makeText(this, "button1 pressed", Toast.LENGTH_SHORT).show();
                Intent intentx = new Intent(this, MainActivity1.class);
                this.startActivity ( intentx );
                break;

//            case R.id.button2:
//
//                Toast.makeText(this, "button2 pressed", Toast.LENGTH_SHORT).show();
////                Intent intent1 = new Intent(this, MainActivity3.class);
////                this.startActivity ( intent1 );
////                break;

        }
    }
}
