package com.example.android.myclassroom;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.myclassroom.Activities.kelasdata;

import java.util.ArrayList;

public class AdapterDataKelas extends RecyclerView.Adapter<AdapterDataKelas.viewHolder>{

    ArrayList<kelasdata> mlist = new ArrayList<>();
    interface onclick{
        void onClick(kelasdata datakelas);
    }
    public AdapterDataKelas(ArrayList<kelasdata> mlist){
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.activity_row, viewGroup, false);
        return new viewHolder(view);
    }
    @Override
    public void onBindViewHolder(viewHolder viewholder, final int i){
        viewholder.txtnamamatakuliah.setText(mlist.get(i).getNamamatakuliah());
        viewholder.txtnamaruangan.setText(mlist.get(i).getNamaruangan());
        viewholder.txtnamamadosen.setText(mlist.get(i).getNamadosen());
        viewholder.txtjadwalkelas.setText(mlist.get(i).getNamajadwalkelas());
    }
    public  void addItem(kelasdata data){
        mlist.add(data);
        notifyDataSetChanged();
    }
    @Override
    public int getItemCount(){
        return (mlist != null) ? mlist.size() : 0;
    }
    public class viewHolder extends RecyclerView.ViewHolder{
        public TextView txtnamamadosen;
        public TextView txtjadwalkelas;
        private TextView txtnamamatakuliah,txtnamaruangan;
        public viewHolder(View itemView){
            super(itemView);
            txtnamamatakuliah = itemView.findViewById(R.id.namaMatakuliah);
            txtnamaruangan = itemView.findViewById(R.id.namaRuangan);
            txtjadwalkelas = itemView.findViewById(R.id.jadwalKelas);
            txtnamamadosen = itemView.findViewById(R.id.namaDosen);
        }
    }
}