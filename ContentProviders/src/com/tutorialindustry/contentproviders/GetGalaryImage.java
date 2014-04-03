package com.tutorialindustry.contentproviders;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;

public class GetGalaryImage extends AsyncTask<Integer, Void, Bitmap> 
{
	public ProgressDialog dialog;
	int requestCode, resultCode;
	Intent intent;
	Context context;
	AsyncResponse asyncResponse;

	public interface AsyncResponse 
	{
		void processFinish(Bitmap bitmap);
	}

	
	public GetGalaryImage(int requestCode, int resultCode, Intent intent, Context context) 
	{
		this.requestCode = requestCode;
		this.resultCode = resultCode;
		this.intent = intent;
		this.context = context;
	}

	@Override
	protected void onPreExecute() 
	{
		super.onPreExecute();
		dialog = new ProgressDialog(context);
		dialog.setMessage("Uploading Image");
		dialog.setIndeterminate(true);
		dialog.setCancelable(false);
		dialog.show();
	}

	@Override
	protected void onPostExecute(Bitmap result) 
	{
		super.onPostExecute(result);
		if(dialog.isShowing())
		{
			dialog.dismiss();
		}

		try
		{
			asyncResponse.processFinish(result);
		}
		catch(OutOfMemoryError error)
		{
			asyncResponse.processFinish(null);
			error.printStackTrace();
		}
	}

	@Override
	protected Bitmap doInBackground(Integer... arg0) 
	{
		return returnBitmapFromUri();
	}

	private Bitmap returnBitmapFromUri()
	{
		Bitmap bitmap = null;
		if (resultCode == -1 && null != intent) 
		{
			Uri selectedImage = intent.getData();
			String[] filePathColumn = { MediaStore.Images.Media.DATA };
			Cursor cursor = context.getContentResolver().query(selectedImage, filePathColumn, null, null, null);
			cursor.moveToFirst();

			int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
			String picturePath = cursor.getString(columnIndex);
			cursor.close();

			try
			{
				bitmap = BitmapFactory.decodeFile(picturePath);
			}
			catch(OutOfMemoryError error)
			{
				error.printStackTrace();
			}
		}

		return bitmap;
	}

	public void getBitampFromAsyncTask(AsyncResponse asyncResponse)
	{
		this.asyncResponse = asyncResponse;
	}
	
	
}