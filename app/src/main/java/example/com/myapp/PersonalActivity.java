package example.com.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersonalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        final EditText edtOne = findViewById(R.id.edt_one);
        final EditText edtTwo = findViewById(R.id.edt_two);
        final TextView tvSum = findViewById(R.id.tv_sum);
        Button btnAdd = findViewById(R.id.add);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = Integer.parseInt(edtOne.getText().toString()) + Integer.parseInt(edtTwo.getText().toString());
                tvSum.setText(String.valueOf(sum));
            }
        });

    }
}
