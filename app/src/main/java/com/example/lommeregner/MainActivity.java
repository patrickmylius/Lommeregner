package com.example.lommeregner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Lommeregner lommeregner = new Lommeregner();

    private EditText doubleA;
    private TextView textA;

    private EditText doubleB;
    private TextView textB;

    private EditText resultat;
    private TextView resultatText;

    private Button addButton;
    private Button subtractButton;
    private Button multiplyButton;
    private Button divisionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doubleA = findViewById(R.id.doubleA);
        textA = findViewById(R.id.textA);

        doubleB = findViewById(R.id.doubleB);
        textB = findViewById(R.id.textB);

        resultat = findViewById(R.id.resultat);
        resultatText = findViewById(R.id.resultatText);

        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divisionButton = findViewById(R.id.divisionButton);
    }

    public void addClick(View view) {

        try {
            double a = Double.parseDouble(doubleA.getText().toString());
            double b = Double.parseDouble(doubleB.getText().toString());

            resultat.setText(String.format(Locale.GERMAN, "%.2f",lommeregner.add(a, b)));

        } catch (Exception e) {
            resultat.setText("Illegal input, try again");
        }
    }

    public void subtractClick(View view) {
        try {
            double a = Double.parseDouble(doubleA.getText().toString());
            double b = Double.parseDouble(doubleB.getText().toString());

            resultat.setText(String.format(Locale.GERMAN, "%.2f",lommeregner.subtract(a, b)));

        } catch (Exception e) {
            resultat.setText("Illegal input, try again");
        }
    }

    public void multiplyClick(View view) {
        try {
            double a = Double.parseDouble(doubleA.getText().toString());
            double b = Double.parseDouble(doubleB.getText().toString());

            resultat.setText(String.format(Locale.GERMAN, "%.2f",lommeregner.multiply(a, b)));

        } catch (Exception e) {
            resultat.setText("Illegal input, try again");
        }
    }

    public void divisionClick(View view) {


        try {
            double a = Double.parseDouble(doubleA.getText().toString());
            double b = Double.parseDouble(doubleB.getText().toString());

            resultat.setText(String.format(Locale.GERMAN, "%.2f",lommeregner.division(a, b)));

        } catch (Exception e) {
            resultat.setText("Illegal input, try again");
        }
    }





}
