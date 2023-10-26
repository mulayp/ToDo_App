package com.example.todo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.todo_app.Data.DataClass;
import com.example.todo_app.Data.DataStorage;
import com.example.todo_app.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ImageButton addbutton = findViewById(R.id.imageButton);
        EditText  newTask = findViewById(R.id.tasks_new);
        addbutton.setOnClickListener(
                v->{
                    DataStorage.setData(new DataClass(false , newTask.getText().toString()  ));
                }
        );
    }
}