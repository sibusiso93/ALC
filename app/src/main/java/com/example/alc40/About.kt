package com.example.alc40

import android.net.http.SslError
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient


import kotlinx.android.synthetic.main.activity_about.*

class About : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        about.settings.javaScriptEnabled = true;
        about.webViewClient = object : WebViewClient() {
            override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler, error: SslError) {
                handler.proceed()
            }
        }
        about.loadUrl("https://andela.com/alc/")
    }
}
