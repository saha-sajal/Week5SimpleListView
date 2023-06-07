package com.week5.week5simplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Product> products;
    TextView textViewUserAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.simple_list);
         textViewUserAction = findViewById(R.id.useraction);

        Product apple = new Product("Apple", 2, "01/01/23");
        Product bun = new Product("Bun", 1,"01/02/23");
        Product banana = new Product("Banana", 1,"01/03/23");

        products = new ArrayList<>();
        products.add(apple);
        products.add(bun);
        products.add(banana);



        //ArrayAdapter<Product> arrayAdapter = new ArrayAdapter<Product>(this, Custom_layout, products);

        ProductAdapter productAdapter = new ProductAdapter(this, 0, products);
        listView.setAdapter(productAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Log.e("Product Clicked", products.get(position).getName());
               textViewUserAction.setText(products.get(position).getName());
            }
        });




    }
}