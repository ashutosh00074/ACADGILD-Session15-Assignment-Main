package com.tech.gigabyte.androidversion;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by GIGABYTE on 5/29/2017.
 */

class VersionAdapter extends RecyclerView.Adapter<VersionAdapter.VersionViewHolder> {

    //Android Version Name
    private String[] version = {"Alpha", "Beta", "CupCake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb", "Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "Marshmallow", "Nougat"};

    @Override
    public VersionAdapter.VersionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.each_row, parent, false);
        return new VersionViewHolder(v);
    }

    @Override
    //Binding Data
    public void onBindViewHolder(VersionAdapter.VersionViewHolder holder, int position) {
        holder.text.setText(version[position]);
    }

    @Override
    public int getItemCount() {
        return version.length;
    }

    static class VersionViewHolder extends RecyclerView.ViewHolder {
        private TextView text;

        VersionViewHolder(View itemView) {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.textview_card);
        }
    }
}
