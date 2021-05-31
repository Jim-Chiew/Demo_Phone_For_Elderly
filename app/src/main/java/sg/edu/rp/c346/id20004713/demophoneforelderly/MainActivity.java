package sg.edu.rp.c346.id20004713.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCallSon;
    Button btnCallDaughter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCallSon = findViewById(R.id.ButtonCallSon);
        btnCallDaughter = findViewById(R.id.ButtonCallDaughter);

        btnCallSon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 92240336;
                calling(number);
            }
        });

        btnCallDaughter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 89675543;
                calling(number);
            }
        });
    }

    private void calling (int number){
        Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + number));
        startActivity(intentCall);
    }
}