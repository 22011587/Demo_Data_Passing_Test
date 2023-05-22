package sg.edu.rp.c346.id22011587.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAnswer = findViewById(R.id.textView3);

        Intent intentReceived = getIntent();
        String value = intentReceived.getStringExtra("String");
        tvAnswer.setText("Character value received is: " + "a");
    }
}