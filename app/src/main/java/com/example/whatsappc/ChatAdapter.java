package com.example.whatsappc;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;




public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder> {

    private  String[] Title;
    private  String[] Time;
    private  String[] Status;
    private  int[] Photo;

    public  ChatAdapter(String[] Title,String[] Status,String[] Time,int[] Photo){
        this.Title = Title;
        this.Time = Time;
        this.Status= Status;
        this.Photo = Photo;
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.chat_list_layout,parent,false);
        return new ChatViewHolder(view);
    }



    @Override
    public void onBindViewHolder(ChatViewHolder holder, int position) {

        String title = Title[position];
        String time = Time[position];
        String status = Status[position];
        int photo = Photo[position];
        holder.txtTitle.setText(title);
        holder.txtTime.setText(time);
        holder.txtStatus.setText(status);
        holder.imageItem.setImageResource(photo);



    }

    @Override
    public int getItemCount() {
        return Title.length;
    }

    public static class ChatViewHolder extends RecyclerView.ViewHolder{
        ImageView imageItem;
        TextView txtTitle;
        TextView txtTime;
        TextView txtStatus;
     public ChatViewHolder(@NonNull View itemView) {
         super(itemView);
         imageItem = itemView.findViewById(R.id.Profile_image);
         txtTitle = itemView.findViewById(R.id.txtTitle);
         txtTime = itemView.findViewById(R.id.txtTime);
         txtStatus = itemView.findViewById(R.id.txtStatus);


     }
 }


}
