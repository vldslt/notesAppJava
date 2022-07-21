package com.example.notesappjava.NotesMain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.notesappjava.NotesFragments.NotesFragment;
import com.example.notesappjava.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NotesFragment notesFragment = new NotesFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, notesFragment)
                .commit();


/*
        //Обычный подход
        MyConfig myConfig = new MyConfig();
        myConfig.color = "red";
        myConfig.height = 100;
        myConfig.lenght = 200;

        //Текущий интерфейс
        IconfigFluent fluentConfig = new ConfigFluent()
                .SetColor("black")
                .SetHeight(150)
                .SetLenght(250);
        */
    }


}