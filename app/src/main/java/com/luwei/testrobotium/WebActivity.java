package com.luwei.testrobotium;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class WebActivity extends AppCompatActivity {

    @InjectView(R.id.content_wv)
    WebView webView;

    public static void navigateTo(Context context) {
        Intent intent = new Intent(context, WebActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        ButterKnife.inject(this);

        initWidget();

    }

    private void initWidget() {
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://172.21.22.94:8080/Test/");
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                webView.loadUrl(url);
                return true;
            }
        });
    }

}
