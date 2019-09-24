package temple.edu.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button save;
    EditText username, email, password, password_confirm;
    TextView showtext;
    String sUsername, sEmail, sPassword, sPassword_Confirm;

    boolean done = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = (EditText) findViewById(R.id.getUsername);
        email = (EditText) findViewById(R.id.getEmail);
        password = (EditText) findViewById(R.id.getPassword);
        password_confirm = (EditText) findViewById(R.id.getPasswordConfirm);
        showtext = (TextView) findViewById(R.id.show_text);
        save = (Button) findViewById(R.id.saveBtn);

        save.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //converting all the texts to string.
        sUsername = username.getText().toString().trim();
        sEmail = email.getText().toString().trim();
        sPassword = password.getText().toString().trim();
        sPassword_Confirm = password_confirm.getText().toString().trim();


        //making sure all the fields are filled
        if ((sUsername.isEmpty() || sEmail.isEmpty() || sPassword.isEmpty() || sPassword_Confirm.isEmpty()) && done == true) {
            Toast.makeText(this, "Please enter all the information!", Toast.LENGTH_SHORT).show();
        }
        //making sure that the password and password confirmation field are not empty first before checking whether they are matching or not
        if ((sPassword.isEmpty() == false && sPassword_Confirm.isEmpty() == false && sPassword.equals(sPassword_Confirm) == false) && done == true) {
            Toast.makeText(this, "Your password and password confirmation does not match!", Toast.LENGTH_SHORT).show();
        }

        if (sUsername.isEmpty() == false && sEmail.isEmpty() == false && sPassword.isEmpty() == false && sPassword_Confirm.isEmpty() == false && done ==true)
        {
            showtext.setText("Welcome, "+ sUsername +", to the SignUpForm App");
            done = false;//making sure the "error" toast will not show up again
        }
    }
}
