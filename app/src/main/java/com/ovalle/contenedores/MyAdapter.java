package com.ovalle.contenedores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolderDatos> {
    ArrayList<String> data_list;

    public MyAdapter(ArrayList<String> data_list) {
        this.data_list = data_list;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_simple_items, null, false);
        return new ViewHolderDatos(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        holder.DataAsssign(data_list.get(position))
;    }

    @Override
    public int getItemCount() {
        return data_list.size();
    }

    public class ViewHolderDatos extends  RecyclerView.ViewHolder{
        TextView text;
        Button button;
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.textView);
            button = itemView.findViewById(R.id.button);
        }

        public void DataAsssign(String ciudad) {
            text.setText(ciudad);
            button.setText(ciudad);
        }
    }
}
