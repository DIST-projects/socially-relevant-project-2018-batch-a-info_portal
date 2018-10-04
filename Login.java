package com.journaldev.navigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText username,password,email,rollno,college;
    private Button submit;
    private TextView userlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.setTitle("SIGNUP");
        setup();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((validate())&&(evalidate()))
                {
//uploadd to database

                    final Context context=Login.this;
                    startActivity(new Intent(context,MainActivity.class));
                }

            }});

    }
    private void setup()
    {
        username=(EditText)findViewById(R.id.idname);
        password=(EditText)findViewById(R.id.idpass);
        rollno=(EditText)findViewById(R.id.idroll);
        email=(EditText)findViewById(R.id.idemail);
        college=(EditText)findViewById(R.id.idclg);
        submit=(Button)findViewById(R.id.idregister);
    }
    private Boolean validate(){
        Boolean result=false;
        String nam=username.getText().toString();
        String pas=password.getText().toString();
        String rol=rollno.getText().toString();
        if((nam.isEmpty()) || (pas.isEmpty()) || (rol.isEmpty()))
        { final Context context =Login.this;
            Toast.makeText(context,"Please Enter All Details",Toast.LENGTH_SHORT).show();
        }
        else
        {
            result=true;
        }
        return result;
    }
    private Boolean evalidate()
    {
        Boolean res=false;
        final Context context =Login.this;
        String mail = email.getText().toString().trim();

        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

// onClick of button perform this simplest code.
        if (mail.matches(emailPattern))
        {
            Toast.makeText(context,"valid email address",Toast.LENGTH_SHORT).show();
            res=true;
        }
        else
        {
            Toast.makeText(context,"Invalid email address", Toast.LENGTH_SHORT).show();
        }
        return res;
    }
}
