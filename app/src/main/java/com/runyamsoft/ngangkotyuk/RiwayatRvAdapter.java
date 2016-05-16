package com.runyamsoft.ngangkotyuk;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by octopus on 16/05/16.
 */
public class RiwayatRvAdapter extends RecyclerView.Adapter<RiwayatRvAdapter.ViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(RiwayatItemAdapter item);
    }
    private final OnItemClickListener listener;

    // Usually involves inflating a layout from XML and returning the holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView angkot, tujuan, harga, tgl;


        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            angkot = (TextView) itemView.findViewById(R.id.txtangkot);
            tujuan = (TextView) itemView.findViewById(R.id.txttujuan);
            harga = (TextView) itemView.findViewById(R.id.txtharga);
            tgl = (TextView) itemView.findViewById(R.id.txttgl);

        }
        public void bind(final RiwayatItemAdapter data, final OnItemClickListener listener) {
            angkot.setText(data.getAngkot());
            tujuan.setText(data.getTujuan());
            harga.setText(data.getHarga());
            tgl.setText(data.getTgl());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(data);
                }
            });

        }

    }



    private List<RiwayatItemAdapter> datas;

    // Pass in the contact array into the constructor
    public RiwayatRvAdapter(List<RiwayatItemAdapter> datas, OnItemClickListener listener) {
        this.datas = datas;
        this.listener = listener;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View rvView = inflater.inflate(R.layout.rv_riwayat, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(rvView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RiwayatRvAdapter.ViewHolder viewHolder, int position) {
        RiwayatItemAdapter data = datas.get(position);
        viewHolder.bind(data,listener);
    }

    @Override
    public int getItemCount() {
        return datas.size();

    }
}
