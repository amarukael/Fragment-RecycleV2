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

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyViewHolder> {

    Context mContext;
    List<list> mData;

    public RecycleAdapter(Context mContext, List<list> mData){
        this.mContext = mContext;
        this.mData = mData;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_title.setText(mData.get(position).getTitle());
        holder.tv_des.setText(mData.get(position).getDes());
        holder.img.setImageResource(mData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_title;
        private TextView tv_des;
        private ImageView img;

        public MyViewHolder(View itemView){

            super(itemView);

            tv_title = (TextView) itemView.findViewById(R.id.text1);
            tv_des = (TextView) itemView.findViewById(R.id.text2);
            img = (ImageView) itemView.findViewById(R.id.image1);
        }
    }

}
