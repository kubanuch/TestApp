package com.example.testapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Math math = new Math();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initClickers();
    }

    private void initClickers() {
        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = binding.firstFieldEd.getText().toString();
                String num2 = binding.secondFieldEd.getText().toString();
                String result = math.add(num1, num2);
                binding.resultTv.setText(result);
            }
        });


    }
}