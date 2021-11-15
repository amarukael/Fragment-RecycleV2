package com.fahmiamaru.fragmentrecyclev2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleAdapterHero extends RecyclerView.Adapter<RecycleAdapterHero.MyViewHolderHero> {

    Context mContext1;
    List<hero> mData1;

    public RecycleAdapterHero(Context mContext1, List<hero> mData1){
        this.mContext1 = mContext1;
        this.mData1 = mData1;
    }

    @NonNull
    @Override
    public RecycleAdapterHero.MyViewHolderHero onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext1).inflate(R.layout.hero,parent,false);
        RecycleAdapterHero.MyViewHolderHero viewHolder1 = new RecycleAdapterHero.MyViewHolderHero(v);

        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleAdapterHero.MyViewHolderHero holder, int position) {
        holder.tv_title1.setText(mData1.get(position).getTitle1());
        holder.img1.setImageResource(mData1.get(position).getPhoto1());
    }

    @Override
    public int getItemCount() {
        return mData1.size();
    }

    public static class MyViewHolderHero extends RecyclerView.ViewHolder{
        private TextView tv_title1;
        private ImageView img1;

        public MyViewHolderHero(@NonNull View itemView1) {
            super(itemView1);
            tv_title1 = (TextView) itemView1.findViewById(R.id.text3);
            img1 = (ImageView) itemView1.findViewById(R.id.image2);
        }
    }
}
