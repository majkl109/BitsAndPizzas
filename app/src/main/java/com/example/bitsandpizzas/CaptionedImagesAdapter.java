package com.example.bitsandpizzas;


import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {

    private String[] captions;
    private int[] imageIds;
    private Listener listener;

    interface Listener{
        void onClick(int position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;

        public ViewHolder(CardView v){
            super(v);
            cardView = v;
        }
    }
}
