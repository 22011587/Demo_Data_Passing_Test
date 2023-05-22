package sg.edu.rp.c346.id22011587.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //Event Handling Step 1
    Button btnPassInteger;
    Button btnPassChar;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event Handling Step 2
        btnPassInteger = findViewById(R.id.buttonPassInteger);
        btnPassChar = findViewById(R.id.buttonPassChar);
        tv = findViewById(R.id.textView2);

        //Event Handling Step 3
        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });

        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Actions to perform when the TextView is clicked
                Intent intent = new Intent(MainActivity.this, FourthActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);

            }
        });
    }
}
