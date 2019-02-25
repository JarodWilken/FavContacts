package css.edu.favcontacts;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    TextView tvPerson1;
    TextView tvPerson2;
    TextView tvPerson3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        tvPerson1 = (TextView) findViewById(R.id.textViewPerson1);
        tvPerson2 = (TextView) findViewById(R.id.textViewPerson2);
        tvPerson3 = (TextView) findViewById(R.id.textViewPerson3);
    }
    public void buttonClick1(View view) {
        // Do something in response to button click
        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.setData(Uri.parse("sms:3204925929"));
        sendIntent.putExtra("sms_body", "Hi");
        if (sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(sendIntent);
        }

    }
    public void buttonClick2(View view) {
        // Do something in response to button click
        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.setData(Uri.parse("sms:7153385653"));
        sendIntent.putExtra("sms_body", "Hi");
        if (sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(sendIntent);
        }
    }
    public void buttonClick3(View view) {
        // Do something in response to button click
        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.setData(Uri.parse("sms:3202509384"));
        sendIntent.putExtra("sms_body", "Hi");

        if (sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(sendIntent);
        }

    }

}
