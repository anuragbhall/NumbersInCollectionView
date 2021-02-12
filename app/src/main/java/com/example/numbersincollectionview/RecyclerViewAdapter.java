package com.example.numbersincollectionview;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.hardware.display.DisplayManagerCompat;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    Numbers[] numbers;

    public class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView v){
            super(v);
            this.cardView = v.findViewById(R.id.card_view);
        }
    }

    public RecyclerViewAdapter(Numbers[] numbers){
        this.numbers=numbers;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_item,parent,false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        String numberToBeOnTextView = Integer.toString(numbers[position].getNumber());
        CardView cardView = holder.cardView;
        TextView textView = cardView.findViewById(R.id.text);
        if(numberToBeOnTextView == "100"){
            textView.setWidth(100);
            textView.setHeight(100);
            textView.setText(numberToBeOnTextView);
        }else{
        textView.setText(numberToBeOnTextView);
    }
    }

    @Override
    public int getItemCount() {
        return numbers.length;
    }
}


