package temple.edu.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button save;
    EditText username, email, password, password_confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = (EditText) findViewById(R.id.getUsername);
        email = (EditText) findViewById(R.id.getEmail);
        password = (EditText) findViewById(R.id.getPassword);
        password_confirm = (EditText) findViewById(R.id.getPasswordConfirm);

        save = (Button) findViewById(R.id.saveBtn);

        


    }
}
