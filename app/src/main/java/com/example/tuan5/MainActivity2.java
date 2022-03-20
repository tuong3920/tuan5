package com.example.tuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private ImageView imgGoods;
    private TextView tvName;
    private TextView tvShopName;
    private TextView tvPrice;

    Goods goods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imgGoods=findViewById(R.id.imgGoods);
        tvName=findViewById(R.id.tvName);
        tvShopName=findViewById(R.id.tvShopName);
        tvPrice=findViewById(R.id.tvPrice);

        goods= (Goods) getIntent().getExtras().get("good");
        System.out.println(goods.getName());

        tvName.setText(goods.getName());
        tvShopName.setText(goods.getNameShop());
        tvPrice.setText(goods.getPrice());
        imgGoods.setImageResource(goods.getImgeGoods());
    }
}