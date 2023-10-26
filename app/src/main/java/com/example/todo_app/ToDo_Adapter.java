package com.example.todo_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todo_app.Data.DataClass;
import com.example.todo_app.Data.DataStorage;

import java.util.ArrayList;

public class ToDo_Adapter extends RecyclerView.Adapter<ToDo_Adapter.viewHolder> {

    ArrayList<DataClass> data;
    Context  context;

    public ToDo_Adapter(Context context){
        this.context = context;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context content = null;
        View itemView = LayoutInflater.from(content).inflate(R.layout.activity_splash , parent , false);
        return new viewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        ArrayList<DataClass> data = DataStorage.getData();
        holder.textView.setText(data.get(position).text);
        holder.checkBox.setChecked(data.get(position).isDone);
        holder.imageButton.setOnClickListener(
                v ->{
                    DataStorage.deldata(data.get(position).id);
                }
        );

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageButton imageButton;
        CheckBox checkBox;
        TextView textView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageButton = itemView.findViewById(R.id.imageButton);
            checkBox = itemView.findViewById(R.id.checkBox);
            textView = itemView.findViewById(R.id.tasks_new);
        }
    }
}