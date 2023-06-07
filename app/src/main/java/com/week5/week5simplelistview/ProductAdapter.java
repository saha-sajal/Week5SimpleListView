package com.week5.week5simplelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ProductAdapter extends ArrayAdapter<Product> {

    ArrayList<Product> productsList;
    public ProductAdapter(Context context, int layoutId, ArrayList<Product> products)
    {
        super(context, layoutId, products);
        this.productsList = products;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //ViewHolder

        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
        }

        Product product = productsList.get(position);
        String productName = product.getName();
        int productPrice = product.getPrice();
        String productDoe = product.getDoe();

        TextView nameTextView = convertView.findViewById(R.id.textViewItemName);
        TextView priceTextView = convertView.findViewById(R.id.textViewItemPrice);
        TextView doeTextView = convertView.findViewById(R.id.textViewDoE);

        //ViewHolder

        nameTextView.setText(productName);
        priceTextView.setText(String.valueOf(productPrice));
        doeTextView.setText(productDoe);

        return convertView;


    }
}
