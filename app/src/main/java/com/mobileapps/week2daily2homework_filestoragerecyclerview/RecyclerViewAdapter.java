package com.mobileapps.week2daily2homework_filestoragerecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    Context context;
    ArrayList<Animals> list;

    public RecyclerViewAdapter (Context context, ArrayList<Animals> passedList){
        this.context = context;
        this.list= passedList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder viewHolder = new ViewHolder(inflater.inflate(R.layout.item,viewGroup,false));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder viewHolder, int i) {
        viewHolder.tvCommonName.setText(list.get(i).CommonName);
        viewHolder.tvFamily.setText(list.get(i).Family);
        viewHolder.tvSpecies.setText(list.get(i).Species);
        int id = context.getResources().getIdentifier(list.get(i).getAnimalPic(), "drawable", context.getPackageName());
        viewHolder.ivAnimalPic.setImageResource(id);

        }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvCommonName;
        TextView tvFamily;
        TextView tvSpecies;
        ImageView ivAnimalPic;


        public ViewHolder(@NonNull View itemView){
            super (itemView);
            tvCommonName=itemView.findViewById(R.id.tvCommonName);
            tvFamily=itemView.findViewById(R.id.tvFamily);
            tvSpecies=itemView.findViewById(R.id.tvSpecies);
            ivAnimalPic=itemView.findViewById(R.id.ivAnimalPic);

        }
    }
}