package com.example.whatsappc;



import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import static com.example.whatsappc.R.drawable.dashed_border;


public class CallsAdapter extends RecyclerView.Adapter<CallsAdapter.CallViewHolder> {

    private  String[] Title;
    private   int[] callStatus;
    private  String[] txtCallTime;
    private  int[] Photo;

    public CallsAdapter(String[] Title, int[] callStatus, String[] txtCallTime,int[] Photo){
        this.Title = Title;
        this.callStatus= callStatus;
        this.txtCallTime = txtCallTime;
        this.Photo = Photo;
    }

    @NonNull
    @Override
    public CallViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.calls_list_layout,parent,false);
        return new CallViewHolder(view);
    }
    @Override
    public void onBindViewHolder(CallViewHolder holder, int position) {

        String title = Title[position];
        int callstatus = callStatus[position];
        String txtcalltime = txtCallTime[position];
        int photo = Photo[position];
        holder.txtTitle.setText(title);
        holder.callStatus.setImageResource(callstatus);
        holder.txtCallTime.setText(txtcalltime);
        holder.imageItem.setImageResource(photo);
    }
    @Override
    public int getItemCount() {
        return Title.length;
    }

    public static class CallViewHolder extends RecyclerView.ViewHolder{
        ImageView imageItem;
        TextView txtTitle;
        ImageView callStatus;
        TextView txtCallTime;

     public CallViewHolder(@NonNull View itemView) {
         super(itemView);
         imageItem = itemView.findViewById(R.id.Profile_image);
         txtTitle = itemView.findViewById(R.id.txtTitle);
         callStatus = itemView.findViewById(R.id.callStatus);
         txtCallTime = itemView.findViewById(R.id.txtCallTime);

     }
 }


}
