package com.sale.recyclerview11;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<ModelClass> userlist;
    public Adapter(Context context,List<ModelClass> userlist) {
        this.userlist = userlist;
    }

   public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView recText;

       public ViewHolder(@NonNull View itemView) {
           super(itemView);
           recText = itemView.findViewById(R.id.recText);
       }
   }
     @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.recText.setText(userlist.get(position).getRecText());
    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }
}
