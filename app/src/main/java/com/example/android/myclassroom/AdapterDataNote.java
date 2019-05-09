package com.example.android.myclassroom;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.myclassroom.Activities.datanote;

import java.util.ArrayList;

public class AdapterDataNote extends RecyclerView.Adapter<AdapterDataNote.viewHolder>{

    ArrayList<datanote> mlist = new ArrayList<datanote>();
    interface onclick{
        void onClick(datanote notedata);
    }
    public AdapterDataNote(ArrayList<datanote> mlist){
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
        viewholder.txtMatakuliah.setText(mlist.get(i).getMatakuliah());
        viewholder.txtDeskripsi.setText(mlist.get(i).getDeskripsi());
        viewholder.txtPengumpulan.setText(mlist.get(i).getPengumpulan());
    }
    public  void addItem(datanote data){
        mlist.add(data);
        notifyDataSetChanged();
    }
    @Override
    public int getItemCount(){
        return (mlist != null) ? mlist.size() : 0;
    }
    public class viewHolder extends RecyclerView.ViewHolder{
        private TextView txtMatakuliah, txtDeskripsi, txtPengumpulan;
        public viewHolder(View itemView){
            super(itemView);
            txtMatakuliah = itemView.findViewById(R.id.Matakuliah);
            txtDeskripsi = itemView.findViewById(R.id.Deskripsi);
            txtPengumpulan = itemView.findViewById(R.id.Pengumpulan);

        }
    }
}


