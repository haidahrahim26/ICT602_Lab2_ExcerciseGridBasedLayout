package com.example.lab2haidah_gridbasedlayout;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter
{
   private Context mContext;

   public Integer[] thumbImages = {
           R.drawable.d1,R.drawable.d2,R.drawable.d3,R.drawable.d4,
           R.drawable.d5,R.drawable.d6,R.drawable.d7,R.drawable.d8,
           R.drawable.d9,
   };

   public ImageAdapter(Context c){mContext = c;}

   public int getCount(){return thumbImages.length;}

   public Object getItem(int position){return 0;}

   @Override
   public long getItemId(int position) {
      return 0;
   }

   public View getView (int position, View convertView, ViewGroup parent){
      ImageView imageView = new ImageView(mContext);
      imageView.setLayoutParams(new ViewGroup.LayoutParams(250,250));
      imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
      imageView.setPadding(8,8,8,8);
      imageView.setImageResource(thumbImages[position]);
      return imageView;
   }
}
