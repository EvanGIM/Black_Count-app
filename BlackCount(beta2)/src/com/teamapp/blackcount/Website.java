package com.teamapp.blackcount;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.Window;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.widget.Button;
import android.widget.EditText;

public class Website extends Activity
{
	private WebView webView;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.website);
		
		
		webView = (WebView) this.findViewById(R.id.webView);
		
		webView.getSettings().setJavaScriptEnabled(true);
		webView.getSettings().setBuiltInZoomControls(true);
		webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
		webView.getSettings().setLightTouchEnabled(true);
		webView.getSettings().setSavePassword(true);
		webView.getSettings().setSaveFormData(true);
		
		webView.setWebViewClient(new MyWebViewClient());
		
	webView.loadUrl("http://blackcount.bl.ee/");
		
	}
		
	private class MyWebViewClient extends WebViewClient { 
	    @Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			view.loadUrl(url);
			
			
			return true;
		}
    }
}
