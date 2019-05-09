package com.example.menumakanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    int[] foto = {
            R.drawable.nasgor,
            R.drawable.sayur,
            R.drawable.bayam,
            R.drawable.betutu,
            R.drawable.taliwang,
            R.drawable.aceh,
            R.drawable.bika,
            R.drawable.rendang




    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent NasiGoreng = new Intent(MainActivity.this, Deskripsi.class);
                    NasiGoreng.putExtra("posisi", position);
                    NasiGoreng.putExtra("link", "https://www.merdeka.com/gaya/cara-membuat-nasi-goreng-spesial-dan-rumahan-yang-enak-sederhana-serta-mudah-kln.html");
                    NasiGoreng.putExtra("foto",foto[0]);
                    startActivity(NasiGoreng);
                }else if (position == 1){
                    Intent SupSayur = new Intent(MainActivity.this,Deskripsi.class);
                    SupSayur.putExtra("posisi",position);
                    SupSayur.putExtra("link","https://www.merdeka.com/gaya/cara-membuat-sop-ayam-kampung-klaten-ala-pak-min.html");
                    SupSayur.putExtra("foto",foto[1] );
                    startActivity(SupSayur);
                }else if (position == 2) {
                    Intent SayurBayam = new Intent(MainActivity.this, Deskripsi.class);
                    SayurBayam.putExtra("posisi", position);
                    SayurBayam.putExtra("link", "https://www.merdeka.com/sehat/6-alasan-untuk-lebih-sering-makan-bayam.html");
                    SayurBayam.putExtra("foto", foto[2]);
                    startActivity(SayurBayam);
                }else if (position == 3){
                    Intent Betutu = new Intent(MainActivity.this,Deskripsi.class);
                    Betutu.putExtra("posisi",position);
                    Betutu.putExtra("link","https://www.fimela.com/lifestyle-relationship/read/3763216/resep-ayam-betutu-khas-bali-enaknya-juara");
                    Betutu.putExtra("foto", foto[3]);
                    startActivity(Betutu);

                }else if (position == 4){
                    Intent Taliwang = new Intent(MainActivity.this,Deskripsi.class);
                    Taliwang.putExtra("posisi",position);
                    Taliwang.putExtra("link","https://travel.kompas.com/read/2015/04/19/083700927/Ayam.Taliwang.Sensasi.Pedas.Ayam.Bakar.Khas.Lombok.");
                    Taliwang.putExtra("foto", foto[4]);
                    startActivity(Taliwang);
                }else if (position == 5){
                    Intent aceh = new Intent(MainActivity.this,Deskripsi.class);
                    aceh.putExtra("posisi",position);
                    aceh.putExtra("link","https://www.rumahmesin.com/cara-membuat-mie-aceh/");
                    aceh.putExtra("foto", foto[5]);
                    startActivity(aceh);
                }else if (position == 6){
                    Intent bika = new Intent(MainActivity.this,Deskripsi.class);
                    bika.putExtra("posisi",position);
                    bika.putExtra("link","http://www.negerikuindonesia.com/2016/07/bika-ambon-makanan-khas-medan-sumatera.html");
                    bika.putExtra("foto", foto[6]);
                    startActivity(bika);
                }else if (position == 7){
                    Intent rendang = new Intent(MainActivity.this,Deskripsi.class);
                    rendang.putExtra("posisi",position);
                    rendang.putExtra("link","https://indogastronomi.wordpress.com/2015/11/12/sejarah-rendang-makanan-khas-padang/");
                    rendang.putExtra("foto", foto[7]);
                    startActivity(rendang);
                }
            }
        });
    }
}
