package com.example.tuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvGoods;
    CustomGoodsAdapter adt;
    ArrayList<Goods> arrayList;


    ArrayList<Goods> arr;

    Button btn1;
    Button btn2;
    Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGoods=findViewById(R.id.lvGoods);

        arrayList=new ArrayList<>();
        arrayList.add(new Goods("Tasty donut","Spicy tasty donut family","$10.00",R.drawable.donut_yellow_1));
        arrayList.add(new Goods("Pink donut","Spicy tasty donut family","$20.00",R.drawable.tasty_donut_1));
        arrayList.add(new Goods("Floating donut","Spicy tasty donut family","$30.00",R.drawable.green_donut_1));
        arrayList.add(new Goods("Tasty Donut","Spicy tasty donut family","$30.00",R.drawable.donut_red_1));

        adt=new CustomGoodsAdapter(this,R.layout.item_listview,arrayList);
        lvGoods.setAdapter(adt);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arr=new ArrayList<>();
                for(Goods g:arrayList){
                    if (g.getName().equals("Tasty donut")){
                        //Toast.makeText(getApplicationContext(),"r",Toast.LENGTH_SHORT).show();
                        arr.add(g);
                    }
                }

                adt=new CustomGoodsAdapter(getApplicationContext(),R.layout.item_listview,arr);
                lvGoods.setAdapter(adt);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arr=new ArrayList<>();
                for(Goods g:arrayList){
                    if (g.getName().equals("Pink donut")){
                        //Toast.makeText(getApplicationContext(),"r",Toast.LENGTH_SHORT).show();
                        arr.add(g);
                    }
                }

                adt=new CustomGoodsAdapter(getApplicationContext(),R.layout.item_listview,arr);
                lvGoods.setAdapter(adt);
            }
        });
        EditText editText=findViewById(R.id.edtSearch);
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                String e = editText.getText().toString();
                System.out.println(e);
                arr=new ArrayList<>();
                for(Goods g:arrayList){
                    if (g.getName().equals(e)){
                        //Toast.makeText(getApplicationContext(),"r",Toast.LENGTH_SHORT).show();
                        arr.add(g);
                    }
                }

                adt=new CustomGoodsAdapter(getApplicationContext(),R.layout.item_listview,arr);
                lvGoods.setAdapter(adt);
                return false;

            }
        });
    }

}