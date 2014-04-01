package com.tutorialindustry.contentproviders;

import java.io.ByteArrayOutputStream;

import com.tutorialindustry.contentproviders.GetGalaryImage.AsyncResponse;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	public static final int RESULT_LOAD_IMAGE = 1;
	byte[] byteImage;
	String temp;
	Context context;
	Button picked_button;
	ImageView picked_image;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		context = this;
		initUi();

		picked_button.setOnClickListener(this);
	}

	private void initUi() {
		picked_button = (Button)findViewById(R.id.picked_button);
		picked_image = (ImageView)findViewById(R.id.picked_image);
	}

	public void setBitmapImage(byte[] _byteImage)
	{
		picked_image.setImageBitmap(BitmapFactory.decodeByteArray(_byteImage , 0, _byteImage.length));
	}

	private void getPick() 
	{
		Intent i = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
		startActivityForResult(i,RESULT_LOAD_IMAGE);
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent _intent) 
	{
		if(resultCode == RESULT_OK) 
		{
			switch (requestCode) 
			{
			case RESULT_LOAD_IMAGE:
				bitmapFromGallery(requestCode, resultCode, _intent,RESULT_LOAD_IMAGE, context);
				break;
			}
		}
	}

	private void bitmapFromGallery(int requestCode, int resultCode, Intent intent, int paramValue, Context context)
	{
		GetGalaryImage getGalaryImage = new GetGalaryImage(requestCode, resultCode, intent, context);
		getGalaryImage.execute(paramValue);
		getGalaryImage.getBitampFromAsyncTask(new AsyncResponse() {

			@Override
			public void processFinish(Bitmap bitmap) {
				if(bitmap != null)
				{
					byteImage = convertBitmapToByteArray(bitmap);
					temp = getStringFromBitmap(bitmap);
					setBitmapImage(byteImage);
				}
				else
				{
					Toast.makeText(getApplicationContext(), "Please Enter Smaller Image", Toast.LENGTH_SHORT).show();
				}
			}
		});
	}

	public byte[] convertBitmapToByteArray(Bitmap _bitmap)
	{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		_bitmap.compress(Bitmap.CompressFormat.PNG, 100, bos);

		return bos.toByteArray();
	}


	public String getStringFromBitmap(Bitmap bitmapPicture) {
		/*
		 * This functions converts Bitmap picture to a string which can be
		 * JSONified.
		 * */
		/* final int COMPRESSION_QUALITY = 100;
	 String encodedImage;
	 ByteArrayOutputStream byteArrayBitmapStream = new ByteArrayOutputStream();
	 bitmapPicture.compress(Bitmap.CompressFormat.PNG, COMPRESSION_QUALITY,byteArrayBitmapStream);
	 byte[] b = byteArrayBitmapStream.toByteArray();
	 encodedImage = Base64.encodeToString(b, Base64.DEFAULT);*/

		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		bitmapPicture.compress(Bitmap.CompressFormat.JPEG, 100, stream);
		byte[] byteArray = stream.toByteArray();
		String strBase64=Base64.encodeToString(byteArray, 0);


		return strBase64;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.picked_button:
			getPick();
			break;

		}		
	}
}
