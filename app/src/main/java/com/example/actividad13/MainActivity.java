package com.example.actividad13;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Declaración
        ToggleButton toggleButton = findViewById(R.id.toggleButton);
        Switch switch1 = findViewById(R.id.switch1);
        SwitchCompat miSwitch = findViewById(R.id.miSwitch);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // SWITCH
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Switch Encendido", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Switch Apagado", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Switch Compat
        miSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                    Toast.makeText(MainActivity.this, "Switch Compat Encendido", Toast.LENGTH_SHORT).show();
                }

                else{
                    Toast.makeText(MainActivity.this, "Switch Compat Apagado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleButton.isChecked()){
                    Toast.makeText(MainActivity.this, "ToggleButton Encendido", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "ToggleButton Apagado", Toast.LENGTH_SHORT).show();

            }
        });
    }
}