package textfont.com.textdemo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import textfont.com.textdemo.R;

public class TextFontAdapter extends RecyclerView.Adapter<TextFontAdapter.TextFontViewHolder>{

    private  Context context;
    private  ArrayList<String> textLists;
    private  LayoutInflater inflater;
    private ItemClickListener listener;

    public TextFontAdapter(Context context, ArrayList<String> textLists) {
        this.context = context;
        this.textLists =textLists;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getItemCount() {
        return textLists.size();
    }

    @NonNull
    @Override
    public TextFontViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TextFontViewHolder(inflater.inflate(R.layout.item_text_font, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TextFontViewHolder holder, final int position) {
        holder.tvTextFont.setText(textLists.get(position));
        holder.tvTextFont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listener != null){
                    listener.onItemClickListener(position);
                }
            }
        });
    }

    public interface ItemClickListener{
        void onItemClickListener(int position);
    }

    public void setOnItemClickListener(ItemClickListener listener){
        this.listener = listener;
    }

    static class TextFontViewHolder extends RecyclerView.ViewHolder{

        TextView tvTextFont;

        public TextFontViewHolder(View itemView) {
            super(itemView);
            tvTextFont = itemView.findViewById(R.id.tv_text_font);
        }
    }
}
