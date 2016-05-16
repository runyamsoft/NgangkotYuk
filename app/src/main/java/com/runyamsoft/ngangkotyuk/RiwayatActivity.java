package com.runyamsoft.ngangkotyuk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RiwayatActivity extends AppCompatActivity {

    private List <RiwayatItemAdapter> riwayatItem;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat);
        setItemExample();
        rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        final RiwayatRvAdapter rvAdapter = new RiwayatRvAdapter(riwayatItem, new RiwayatRvAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(RiwayatItemAdapter item) {
                Intent intent = new Intent(RiwayatActivity.this, SplashScreen.class);
                startActivity(intent);
            }
        });
        rv.setAdapter(rvAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);

    }


    public void setItemExample(){

        riwayatItem = new ArrayList<RiwayatItemAdapter>();

        RiwayatItemAdapter item;
        item = new RiwayatItemAdapter();
        item.setAngkot("Bimasakti");
        item.setTujuan("Mirota - Kaliurang");
        item.setHarga("Rp. 3000;");
        item.setTgl("28/03/2016");
        riwayatItem.add(item);


        item = new RiwayatItemAdapter();
        item.setAngkot("BintangSakti");
        item.setTujuan("Kaliurang - Merapi");
        item.setHarga("Rp. 3500;");
        item.setTgl("25/05/2016");
        riwayatItem.add(item);

        item = new RiwayatItemAdapter();
        item.setAngkot("Bimasakti");
        item.setTujuan("Mirota - Kaliurang");
        item.setHarga("Rp. 3000;");
        item.setTgl("24/05/2016");
        riwayatItem.add(item);

        item = new RiwayatItemAdapter();
        item.setAngkot("Bimasakti");
        item.setTujuan("Mirota-Kaliurang");
        item.setHarga("Rp. 3000;");
        item.setTgl("24/03/2016");
        riwayatItem.add(item);

        item = new RiwayatItemAdapter();
        item.setAngkot("Bimasakti");
        item.setTujuan("Mirota-Kaliurang");
        item.setHarga("Rp. 3000;");
        item.setTgl("23/03/2016");
        riwayatItem.add(item);

        item = new RiwayatItemAdapter();
        item.setAngkot("Bimasakti");
        item.setTujuan("Mirota-Kaliurang");
        item.setHarga("Rp. 3000;");
        item.setTgl("19/03/2016");
        riwayatItem.add(item);

        item = new RiwayatItemAdapter();
        item.setAngkot("Bimasakti");
        item.setTujuan("Mirota-Kaliurang");
        item.setHarga("Rp. 3000;");
        item.setTgl("18/03/2016");
        riwayatItem.add(item);

        item = new RiwayatItemAdapter();
        item.setAngkot("Bimasakti");
        item.setTujuan("Mirota-Kaliurang");
        item.setHarga("Rp. 3000;");
        item.setTgl("17/03/2016");
        riwayatItem.add(item);

        item = new RiwayatItemAdapter();
        item.setAngkot("Bimasakti");
        item.setTujuan("Mirota-Kaliurang");
        item.setHarga("Rp. 3000;");
        item.setTgl("16/03/2016");
        riwayatItem.add(item);

        item = new RiwayatItemAdapter();
        item.setAngkot("Bimasakti");
        item.setTujuan("Mirota-Kaliurang");
        item.setHarga("Rp. 3000;");
        item.setTgl("15/03/2016");
        riwayatItem.add(item);


    }
}
