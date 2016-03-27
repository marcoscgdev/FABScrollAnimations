package com.marcoscg.fabscrollanimationsexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Marcos on 27/03/2016.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder> {
    private Context mContext;
    private String[] mStrings;

    public RVAdapter(Context context, String[] strings){
        this.mContext = context;
        this.mStrings = strings;
    }

    @Override
    public RVAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.list_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(RVAdapter.ViewHolder viewHolder, int i) {
        viewHolder.textView.setText(mStrings[i]);
    }

    @Override
    public int getItemCount() {
        return mStrings.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public final TextView textView;

        public ViewHolder(View view){
            super(view);
            textView = (TextView) view;
        }
    }
}
