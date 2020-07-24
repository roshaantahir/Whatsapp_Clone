package com.example.whatsappc;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class StatusAdapter extends RecyclerView.Adapter<StatusAdapter.StatusViewHolder> {

    private  String[] Title;
    private  String[] Status;
    private  int[] Photo;

    public StatusAdapter(String[] Title, String[] Status, int[] Photo){
        this.Title = Title;
        this.Status= Status;
        this.Photo = Photo;
    }

    @NonNull
    @Override
    public StatusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.status_list_layout,parent,false);
        return new StatusViewHolder(view);
    }



    @Override
    public void onBindViewHolder(StatusViewHolder holder, int position) {

        String title = Title[position];
        String status = Status[position];
        int photo = Photo[position];
        holder.txtTitle.setText(title);
        holder.txtStatus.setText(status);
        holder.imageItem.setImageResource(photo);



    }

    @Override
    public int getItemCount() {
        return Title.length;
    }

    public static class StatusViewHolder extends RecyclerView.ViewHolder{
        ImageView imageItem;
        TextView txtTitle;
        TextView txtStatus;

     public StatusViewHolder(@NonNull View itemView) {
         super(itemView);
         imageItem = itemView.findViewById(R.id.Profile_image);
         txtTitle = itemView.findViewById(R.id.txtTitle);
         txtStatus = itemView.findViewById(R.id.txtStatusStatus);

     }
 }


}
