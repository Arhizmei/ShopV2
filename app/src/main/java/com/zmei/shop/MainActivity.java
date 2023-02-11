package com.zmei.shop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increaseQuantity(View view) {

        quantity = quantity + 2;
        TextView quantitY = findViewById(R.id.quantitY);
        quantitY.setText("" + quantity);
    }

    public void DecreaseQuantity(View view) {
        quantity = quantity - 7;
        if (quantity<0){
            quantity=0;
        }

        TextView quantitY = findViewById(R.id.quantitY);
        quantitY.setText("" + quantity);

    }
}