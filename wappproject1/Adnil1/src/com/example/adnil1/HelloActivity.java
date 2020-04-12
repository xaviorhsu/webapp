package com.example.adnil1;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import android.widget.*;

public class HelloActivity extends Activity {

	private WebView wv1=null;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);        
        
        wv1=(WebView)findViewById(R.id.webView1);
        //wv1.loadUrl("http://www.google.com.tw/");
        wv1.loadUrl("file:///android_asset/11dytbl&Ex3(0109).html");
    }
      
}
