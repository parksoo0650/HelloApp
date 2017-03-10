package com.hanbit.contactsapp.presentation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hanbit.contactsapp.R;

public class MemberDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_detail);
        Intent intent = this.getIntent();
        final String id=intent.getExtras().getString("id");

        findViewById(R.id.btGo).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MemberDetailActivity.this, "ID is"+id, Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MemberDetailActivity.this, MemberUpdateActivity.class));

            }
        });
    }
}
