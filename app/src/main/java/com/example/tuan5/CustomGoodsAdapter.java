package com.example.tuan5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;

public class CustomGoodsAdapter extends BaseAdapter {
    Context ctx;
    int layoutItem;
    ArrayList<Goods> arrayList;

    public CustomGoodsAdapter(Context ctx, int layoutItem, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Goods good = arrayList.get(i);



        view= LayoutInflater.from(ctx).inflate(layoutItem,viewGroup,false);

        TextView tvName= view.findViewById(R.id.tvName);
        TextView tvShopName=view.findViewById(R.id.tvShopName);
        TextView tvPrice=view.findViewById(R.id.tvPrice);
        ImageView imgGoods= view.findViewById(R.id.imgGoods);
        ConstraintLayout itemPR=view.findViewById(R.id.itemPr);


        tvName.setText(arrayList.get(i).getName());
        tvShopName.setText(arrayList.get(i).getNameShop());
        tvPrice.setText(arrayList.get(i).getPrice());
        imgGoods.setImageResource(arrayList.get(i).getImgeGoods());

        itemPR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),MainActivity2.class);

                Bundle bundle=new Bundle();
                bundle.putSerializable("good", good);
                intent.putExtras(bundle);
                view.getContext().startActivity(intent);
            }
        });

        return view;
    }
}
