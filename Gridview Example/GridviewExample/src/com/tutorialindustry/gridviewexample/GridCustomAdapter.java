package com.tutorialindustry.gridviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridCustomAdapter extends BaseAdapter 
{
	private Context mContext;

	

	public Integer[] images = {R.drawable.image_1,R.drawable.image_2,R.drawable.image_3,
			R.drawable.image_4,R.drawable.image_5,R.drawable.image_6,
			R.drawable.image_7,R.drawable.image_8,R.drawable.image_9,
			R.drawable.image_10,R.drawable.image_11,R.drawable.image_12};

	public static String[] imagesnames = {"Image 1","Image 2","Image 3",
			"Image 4","Image 5","Image 6",
			"Image 7","Image 8","Image 9",
			"Image 10","Image 11","Image 12",
	};
	
	public GridCustomAdapter(Context context)
	{
		mContext = context;
	}

	@Override
	public int getCount() {
		return imagesnames.length;
	}

	@Override
	public Object getItem(int position) {
		return imagesnames[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {

		LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		view=inflater.inflate(R.layout.griditem, parent, false);
		
		TextView image_name = (TextView)view.findViewById(R.id.image_name);
		ImageView icon = (ImageView)view.findViewById(R.id.image);
		
		image_name.setText(imagesnames[position]);
		icon.setImageResource(images[position]);
		
		return view;
	}

}
