package com.kaivanshah.assignment43;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by kaivanrasiklal.s on 11-02-2017.
 */

public class ImageAdpater extends BaseAdapter {


    int TotalCount;
    Context myContext;
    private ArrayList<Integer> ImageList;

    public ImageAdpater(int Count, Context oContext, ArrayList<Integer> oImageList)
    {
        TotalCount = Count;
        myContext =  oContext;
        ImageList = oImageList;
    }


    @Override
    public int getCount() {
        return TotalCount;
    }

    @Override
    public Object getItem(int position) {
        return ImageList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(myContext);
            row = inflater.inflate(R.layout.row_list, parent, false);
        }
        ImageView grid_item_image = (ImageView)(row.findViewById(R.id.grid_item_image));

        int ImageId = (int) getItem(position);
        grid_item_image.setImageResource(ImageId);
        return  row;
    }
}
