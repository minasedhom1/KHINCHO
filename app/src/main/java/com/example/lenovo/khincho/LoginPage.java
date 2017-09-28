package com.example.lenovo.khincho;

import android.content.Intent;
import android.os.Build;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {

    EditText email_ed,password_ed;
    View get_help_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        getSupportActionBar().hide();
        email_ed= (EditText) findViewById(R.id.email_et);
        password_ed= (EditText) findViewById(R.id.password_et);

        get_help_tv=findViewById(R.id.to_get_help_page);
        get_help_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginPage.this,GetHelpPage.class));
            }
        });

        final Button login_btn= (Button) findViewById(R.id.login_btn);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginPage.this,HomePage.class));

            }
        });

        email_ed.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!editable.toString().equals("") && !password_ed.getText().toString().equals("")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        login_btn.setBackground(getResources().getDrawable(R.drawable.rounded_corner_login_btn_on));
                        login_btn.setTextColor(getResources().getColor(R.color.white));
                    }
                }
                if (editable.toString().equals("")) {
                    login_btn.setBackground(getResources().getDrawable(R.drawable.rounded_corner_login_btn_off));
                    login_btn.setTextColor(getResources().getColor(R.color.login_btn_color));
                }
            }
        });

       password_ed.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!editable.toString().equals("") && !email_ed.getText().toString().equals(""))
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        login_btn.setBackground(getResources().getDrawable(R.drawable.rounded_corner_login_btn_on));
                        login_btn.setTextColor(getResources().getColor(R.color.white));
                    }
                }
                if(editable.toString().equals("") ){
                    login_btn.setBackground(getResources().getDrawable(R.drawable.rounded_corner_login_btn_off));
                    login_btn.setTextColor(getResources().getColor(R.color.login_btn_color));
                }
            }
        });
    }
}
