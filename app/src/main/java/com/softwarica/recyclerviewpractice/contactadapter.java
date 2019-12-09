package com.softwarica.recyclerviewpractice;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class contactAdapter extends RecyclerView.Adapter<contactAdapter.ContactsViewHolder>{

    Context mContext;
    List<contracts>contractsList;

    public contactAdapter(Context mContext, List<contracts> contractsList) {
        this.mContext = mContext;
        this.contractsList = contractsList;

    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_contracts,parent,false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        contracts contracts=contractsList.get(position);
        holder.imgProfile.setImageResource(contracts.getImageId());
        holder.tvName.setText(contracts.getName());
        holder.tvMessage.setText(contracts.getMessage());
        holder.tvTime.setText(contracts.getTime());

    }

    @Override
    public int getItemCount() {
        return contractsList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imgProfile;
        TextView tvName,tvMessage,tvTime;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile=itemView.findViewById(R.id.ronaldo);
            tvName=itemView.findViewById(R.id.tvName);
            tvMessage=itemView.findViewById(R.id.tvMessage);
            tvTime=itemView.findViewById(R.id.tvTime);
        }
    }
}
