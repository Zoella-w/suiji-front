package com.example.suijifront;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TodoAddActivity extends AppCompatActivity {

    private Button todo_preserve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_add);

        todo_preserve=(Button)findViewById(R.id.todo_preserve);
        todo_preserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TodoAddActivity.this,TodoShowActivity.class);
                startActivity(intent);

            }
        });
    }
}