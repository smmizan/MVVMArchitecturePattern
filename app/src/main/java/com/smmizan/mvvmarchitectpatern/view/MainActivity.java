package com.smmizan.mvvmarchitectpatern.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.smmizan.mvvmarchitectpatern.R;
import com.smmizan.mvvmarchitectpatern.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {
    
    EditText etValue1,etValue2;
    Button bCalculate;


    MainActivityViewModel mainActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);


        
        etValue1 = findViewById(R.id.editText1);
        etValue2 = findViewById(R.id.editText2);
        
        bCalculate = findViewById(R.id.button);
        
        
        bCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String result = mainActivityViewModel.calculateValue(etValue1.getText().toString(),etValue2.getText().toString());

                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();

            }
        });
        
    }
}
