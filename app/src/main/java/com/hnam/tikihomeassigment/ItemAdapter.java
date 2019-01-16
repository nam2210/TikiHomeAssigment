package com.hnam.tikihomeassigment;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by nampham on 1/16/19.
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemVH> {

    private LayoutInflater mInflater;
    private List<String> mData;

    public ItemAdapter(Context context){
        mInflater = LayoutInflater.from(context);
        mData = new ArrayList<>();
    }

    public void setData(List<String> data){
        mData.clear();
        mData.addAll(data);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ItemVH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.view_item, viewGroup, false);
        return new ItemVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemVH itemVH, int i) {
        itemVH.tvTitle.setText(Utils.formatData(mData.get(i)));
        itemVH.tvTitle.setBackgroundColor(Color.parseColor(getRandomColor(i)));

    }

    private String getRandomColor(int position){
        return Constants.COLORS[position % 8].getValue();
    }



    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ItemVH extends RecyclerView.ViewHolder{
        private TextView tvTitle;
        public ItemVH(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
        }
    }
}
