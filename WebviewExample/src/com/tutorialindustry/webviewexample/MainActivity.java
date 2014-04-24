package com.tutorialindustry.webviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity {
	 
		private WebView webView;
	 
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
	 
			webView = (WebView) findViewById(R.id.webView1);
			webView.getSettings().setJavaScriptEnabled(true);
			//webView.loadUrl("http://www.tutorialindustry.com");
			
			String customHtml = "<html><body><h1>WebView Layout</h1></body></html>";
			   webView.loadData(customHtml, "text/html", "UTF-8");
	 
		}
	 
}