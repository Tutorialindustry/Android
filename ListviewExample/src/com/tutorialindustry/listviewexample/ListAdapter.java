package com.tutorialindustry.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter 
{
	private Context mContext;

	

	public String[] movies = {"Movie 1","Movie 2","Movie 3",
			"Movie 4","Movie 5","Movie 6",
	};

	public String[] heros = {"Hero 1","Hero 2","Hero 3",
			"Hero 4","Hero 5","Hero 6",
	};
	
	public String[] heroine = {"Heroine 1","Heroine 2","Heroine 3",
			"Heroine 4","Heroine 5","Heroine 6",
	};


	public ListAdapter(Context context)
	{
		mContext = context;
	}

	@Override
	public int getCount() {
		return movies.length;
	}

	@Override
	public Object getItem(int position) {
		return movies[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {

		LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		view=inflater.inflate(R.layout.listitem, parent, false);
		
		TextView movie = (TextView)view.findViewById(R.id.movie_name);
		TextView hero = (TextView)view.findViewById(R.id.movie_hero);
		TextView heroine = (TextView)view.findViewById(R.id.movie_heroine);
		
		movie.setText(this.movies[position]);
		hero.setText(this.heros[position]);
		heroine.setText(this.heroine[position]);
		
		return view;
	}

}
