package com.example.android.myclassroom;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.myclassroom.Activities.modelData;


import java.util.ArrayList;

public class AdapterData extends RecyclerView.Adapter<AdapterData.viewHolder>{

    ArrayList<modelData> mlist = new ArrayList<modelData>();
    //this is a comment test
    interface onclick{
        void onClick(modelData dataModel);
    }
    public AdapterData(ArrayList<modelData> mlist){
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.activity_row,viewGroup,false);
        return new viewHolder(view);
    }
    @Override
    public void onBindViewHolder(viewHolder viewholder,final int i){
        viewholder.txtnamapraktikum.setText(mlist.get(i).getNamapraktikum());
        viewholder.txtjadwalpraktikum.setText(mlist.get(i).getNamajadwalpraktikum());
    }
    public  void addItem(modelData data){
        mlist.add(data);
        notifyDataSetChanged();
    }
    @Override
    public int getItemCount(){
        return (mlist != null) ? mlist.size() : 0;
    }
    public class viewHolder extends RecyclerView.ViewHolder{
        private TextView txtnamapraktikum,txtjadwalpraktikum;
        public viewHolder(View itemView){
            super(itemView);
            txtnamapraktikum = itemView.findViewById(R.id.namaPraktikum);
            txtjadwalpraktikum = itemView.findViewById(R.id.jadwalPraktikum);
        }
    }
}
