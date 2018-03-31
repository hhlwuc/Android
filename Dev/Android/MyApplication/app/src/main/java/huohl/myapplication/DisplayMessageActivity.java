package huohl.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayMessageActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);


        Button btnReturn = findViewById(R.id.button_ok);
        btnReturn.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.button_ok) {
            Intent intent = new Intent();
            intent.putExtra("data_return", "I revieve the message,thanks");
            setResult(RESULT_OK, intent);

            finish();
        }
    }
}
