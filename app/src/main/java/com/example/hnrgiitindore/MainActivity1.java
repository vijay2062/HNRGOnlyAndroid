package com.example.hnrgiitindore;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;


public class MainActivity1 extends AppCompatActivity implements View.OnClickListener {

    // creating three buttons
    // by the of btn1, btn2,btn3,btn3,btn4
    Button btn1, btn2 ,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        // connecting buttons with the
        // layout using findViewById()
        btn1= findViewById(R.id.button);
        btn2= findViewById(R.id.button2);
        btn3= findViewById(R.id.button3);
        btn4= findViewById(R.id.button4);
        btn5= findViewById(R.id.button5);

        // apply setOnClickListener over buttons
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);


    }

    // common onClick() for all buttons
    @Override
    public void onClick(View v) {

        switch (v.getId()){

            // cases applied over different buttons
            case R.id.button:

                // Toast message appears when button pressed
//                Toast.makeText(this, "button1 pressed", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, MainActivity2.class);
                this.startActivity ( intent );
                break;

            case R.id.button2:

//                Toast.makeText(this, "button2 pressed", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(this, MainActivity3.class);
                this.startActivity ( intent1 );
                break;

            case R.id.button3:

                //Toast.makeText(this, "button3 pressed", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(this, MainActivity4.class);
                this.startActivity ( intent2 );
                break;

            case R.id.button4:

                //Toast.makeText(this, "button4 pressed", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(this, MainActivity5.class);
                this.startActivity ( intent3 );
                break;

            case R.id.button5:

                //Toast.makeText(this, "button5 pressed", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(this, MainActivity6.class);
                this.startActivity ( intent4 );
                break;
        }
    }
}
