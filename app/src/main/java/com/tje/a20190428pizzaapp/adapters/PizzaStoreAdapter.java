package com.tje.a20190428pizzaapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.tje.a20190428pizzaapp.R;
import com.tje.a20190428pizzaapp.datas.PizzaStore;

import java.util.List;

public class PizzaStoreAdapter  extends ArrayAdapter<PizzaStore> {
    Context mContext;
    List<PizzaStore> mList;
    LayoutInflater inf;

    public PizzaStoreAdapter(Context context, List<PizzaStore> list){
        super(context,R.layout.pizza_list_item,list);

        mContext =context;
        mList = list;
        inf= LayoutInflater.from(mContext);
    }


    @Override
    public View getView(int position,View convertView, ViewGroup parent) {
       View row = convertView;
       if(row == null){
           row = inf.inflate(R.layout.pizza_list_item,null);
       }
       PizzaStore pizzaStoreData = mList.get(position);

        TextView storeName= row.findViewById(R.id.storeName);
        TextView openTime = row.findViewById(R.id.openTime);

        return row;

    }
}
