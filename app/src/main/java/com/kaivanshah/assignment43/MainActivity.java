package com.kaivanshah.assignment43;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> ImageList;
    GridView GV_Images;
    private ImageAdpater oAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GV_Images = (GridView) this.findViewById(R.id.GV_Images);


        ImageList = new ArrayList<Integer>();
        ImageList.add(R.drawable.gingerbread);
        ImageList.add(R.drawable.honeycomb);
        ImageList.add(R.drawable.icecream);
        ImageList.add(R.drawable.jellybean);
        ImageList.add(R.drawable.kitkat);
        ImageList.add(R.drawable.lollipop);

        oAdapter = new ImageAdpater(ImageList.size(), this, ImageList);
        GV_Images.setAdapter(oAdapter);

    }
}
