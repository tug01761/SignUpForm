package temple.edu.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button save;
    EditText username, email, password, password_confirm;
    String sUsername, sEmail, sPassword, sPassword_Confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = (EditText) findViewById(R.id.getUsername);
        email = (EditText) findViewById(R.id.getEmail);
        password = (EditText) findViewById(R.id.getPassword);
        password_confirm = (EditText) findViewById(R.id.getPasswordConfirm);
        save = (Button) findViewById(R.id.saveBtn);

        save.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        //converting all the texts to string.
        sUsername = username.getText().toString().trim();
        sEmail = email.getText().toString().trim();
        sPassword = password.getText().toString().trim();
        sPassword_Confirm = password_confirm.getText().toString().trim();
        if (sUsername.isEmpty() || sEmail.isEmpty() || sPassword.isEmpty() || sPassword_Confirm.isEmpty())
        {
            Toast.makeText(this, "Please enter all the information!", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this, "Welcome to the SignUpForm App", Toast.LENGTH_LONG).show();
    }
}
