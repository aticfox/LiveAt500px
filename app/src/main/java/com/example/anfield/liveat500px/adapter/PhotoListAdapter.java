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

    //ตรงนี้สำหรับมากกว่า 1 view
    /*@Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        return position % 2 == 0 ? 0 : 1;
    }*/

    //เป็นตัวที่ listview จะถาม Adapter มา ว่าขอนี้นั้นนะ ก็จะสร้าง view และส่งกลับไปให้มัน มันก็จะไปเรียงไว้ให้บน listview
    //ตำแหน่งจะส่งมาทาง position
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //มากกว่า 1 วิวใช้ตัวนี้
        /*
        if(getItemViewType(position) == 0){

            PhotoListItem item;
            if(convertView != null)
                item = (PhotoListItem)convertView;
            else
                item = new PhotoListItem(parent.getContext());
            return item;
        }
        else{
            TextView item;
            if(convertView != null)
                item = (TextView) convertView;
            else
                item = new TextView(parent .getContext());
            item.setText("Position" + position);
            return item;
        }*/
        PhotoListItem item;
        if(convertView != null)
            item = (PhotoListItem)convertView;
        else
            item = new PhotoListItem(parent.getContext());
        return item;

    }
}
