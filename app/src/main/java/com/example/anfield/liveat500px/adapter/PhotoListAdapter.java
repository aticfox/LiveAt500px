package com.example.anfield.liveat500px.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.anfield.liveat500px.view.PhotoListItem;

/**
 * Created by ANFIELD on 22/4/2560.
 */

public class PhotoListAdapter extends BaseAdapter{




    //listview ถาม Adapter ว่าตอนนี้ list ของเราทั้งหมดมีกี่ item
    @Override
    public int getCount() {
        return 10000;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    //เป็นตัวที่ listview จะถาม Adapter มา ว่าขอนี้นั้นนะ ก็จะสร้าง view และส่งกลับไปให้มัน มันก็จะไปเรียงไว้ให้บน listview
    //ตำแหน่งจะส่งมาทาง position
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PhotoListItem item;
        if(convertView != null)
            item = (PhotoListItem)convertView;
        else
            item = new PhotoListItem((parent.getContext()));
        return item;


    }
}
