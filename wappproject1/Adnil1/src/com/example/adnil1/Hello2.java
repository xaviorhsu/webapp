package com.example.adnil1;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.webkit.*;
import android.widget.*;

public class Hello2 extends Activity
{
	private WebView wv1=null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello2);
		
		wv1=(WebView)findViewById(R.id.webView1);
		
		WebSettings ws=wv1.getSettings();
		ws.setJavaScriptEnabled(true);
		ws.setBuiltInZoomControls(true);
		ws.setJavaScriptCanOpenWindowsAutomatically(true);
		
	    wv1.loadUrl("file:///android_asset/09apfom&Ex2(0104).html");
	}

	

}
