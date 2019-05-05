package com.example.administrator.ui_all_four;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class uitwo extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View view2 = View.inflate(uitwo.this, R.layout.uitwoxml, null);
        final EditText username = (EditText) view2.findViewById(R.id.username);
        final EditText password = (EditText) view2.findViewById(R.id.password);
        final Button button = (Button) view2.findViewById(R.id. btn_login);
        final Button button1 = (Button) view2.findViewById(R.id.btn_cancel);
        builder.setTitle("自定义对话框").setIcon(R.drawable.header_logo).setView(view2);
        final AlertDialog alertDialog1 = builder.create();
        alertDialog1.show();
    }
}



