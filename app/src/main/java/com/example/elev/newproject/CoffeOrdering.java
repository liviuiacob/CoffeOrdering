package com.example.elev.newproject;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import com.example.elev.newproject.R;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class CoffeOrdering extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffe_ordering);
    }

    /**
     * This method is called when the order button is clicked.
     */
    int number_of_coffe=0;

    public void submitOrder(View view) {

        display(number_of_coffe);
        displayPrice(number_of_coffe * 5);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void increment (View view)
    {
        number_of_coffe++;
        display(number_of_coffe);

    }
    public void decrement (View view)
    {
        if(number_of_coffe>0)
            number_of_coffe--;
            display(number_of_coffe);
    }

}
