package id.ac.poliban.tari.latihan03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etUsername = findViewById(R.id.etUsername);
        EditText etPassword = findViewById(R.id.etPassword);
        Button btClear = findViewById(R.id.btClear);
        Button btLogin = findViewById(R.id.btLogin);
        
        btClear.setOnClickListener(v -> {
            //mengosongkan editText
            etUsername.setText("");
            etPassword.setText("");
            //meletakan kursor di eUsername
            etUsername.requestFocus();
        });
        
        btLogin.setOnClickListener(v -> {
            etUsername.setText("");
            etPassword.setText("");
            
            etUsername.requestFocus();
            Toast.makeText(this, "you have logged", Toast.LENGTH_SHORT).show();;
        });
        
        
        
    }
}
