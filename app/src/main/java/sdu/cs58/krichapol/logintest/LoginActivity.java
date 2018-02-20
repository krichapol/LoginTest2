package sdu.cs58.krichapol.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //1. Explicit (ประกาศตัวแปรบน Java)
    EditText NameEditText, UsernameEditText, PasswordEditText;
    Button LoginButton;
    String NameString, userString, passString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //2. Initial view ผูกตัวแปร Java ให้รู้จักกับ Element บน XML
        NameEditText = findViewById(R.id.txtName);
        UsernameEditText = findViewById(R.id.txtUsername);
        PasswordEditText = findViewById(R.id.txtPassword);
        LoginButton = findViewById(R.id.btnLogin);

        //3. สั่งให้ปุ่มคอยดักฟังว่า User คลิกที่ปุ่ม Login
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ดึงข้อมูลที่ User ป้อนในหน้า UI มาเก็บในตัวแปรชนิด String
                NameString = NameEditText.getText().toString().trim();
                userString = UsernameEditText.getText().toString().trim();
                passString = PasswordEditText.getText().toString().trim();

                //ตรวจสอบค่าว่าง
                if ((NameString.length()==0) || (userString.length()==0) || (passString.length()==0)) {
                    Toast.makeText(getApplicationContext(),"กรุณาใส่ข้อมูลให้ครบทุกช่อง",Toast.LENGTH_SHORT).show();
                }

                //ตรวจสอบการ Login
                else if ((userString.equals("admin")) && (passString.equals("1234"))) {
                    Toast.makeText(getApplicationContext(),"Login Success",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Login Failed",Toast.LENGTH_SHORT).show();
                }
                //Toast.makeText(getApplicationContext(),"Hello!! " +NameString,Toast.LENGTH_SHORT).show();
            }
        }); //4. End OnClickListener
    } //End Method onCreate
} //End Class
