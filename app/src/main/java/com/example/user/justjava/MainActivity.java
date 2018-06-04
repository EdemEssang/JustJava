package com.example.user.justjava;



//import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


 //This app confirms an order form to order coffee
public class MainActivity extends AppCompatActivity {

     int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This method is called when the order button is cliked.

     public void submitOrder(View view){


       int price = quantity*5;

         String priceMessage = "Total: $" + price +"\n"+ "Thank you!";
         displayMessage(priceMessage);

     }

     //This method handles the increment button is clicked

     public void increment(View view){


         quantity = quantity + 1;
         display(quantity);
     }

     //This method handles the decrement button is clicked

     public void decrement(View view){

         quantity = quantity - 1;
         display(quantity);
     }





     // This method displays the given quantity on the screen

     public void display(int number){
         TextView quantityTextView =   findViewById(R.id.quantity_text_view);
         quantityTextView.setText("" + number);
     }

     // This method displays the given quantity value on the screen

    /* public void displayPrice(int number){
         TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
         priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));

     }*/

     //this method handles the given message on the screen
     public void displayMessage(String message){
         TextView priceTextView =  findViewById(R.id.price_text_view);
         priceTextView.setText(message);
     }
}
