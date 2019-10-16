package com.example.menumakanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ListView;

public class Deskripsi extends AppCompatActivity {
    WebView web;
    ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

        web = findViewById(R.id.web);
        gambar = findViewById(R.id.gambar);
        Intent deskripsi = getIntent();
                getSupportActionBar().setDisplayShowHomeEnabled(true);

        deskripsi.getIntExtra("posisi",0);
        String link = deskripsi.getStringExtra("link");

        int foto = deskripsi.getIntExtra("foto",  0 );

        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl(link);
        gambar.setImageResource(foto);


    }
}
