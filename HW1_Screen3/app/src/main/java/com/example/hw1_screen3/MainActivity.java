package com.example.hw1_screen3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("http://acnolan.tech");
        getSupportActionBar().hide();
    }

    public void loadMySite(View theButton){
        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl("http://acnolan.tech");
    }

    public void loadWPI(View theButton){
        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl("https://www.wpi.edu/");
    }

    public void load528(View theButton){
        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl("https://web.cs.wpi.edu/~emmanuel/courses/cs528/F20/");
    }
}