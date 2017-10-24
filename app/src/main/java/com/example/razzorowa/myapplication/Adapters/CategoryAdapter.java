package com.example.razzorowa.myapplication.Adapters;

import android.content.Context;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.razzorowa.myapplication.R;
import com.example.razzorowa.myapplication.model.Category;
import java.util.List;

/**
 * Created by RazzorOwa on 19/10/2017.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder>{
    private Context context;
    private List<Category> itens;

    public CategoryAdapter (Context context, List<Category> itens){
        this.context=context;
        this.itens=itens;
        Category adicionar = new Category("academia", R.drawable.ic_add_black_48px);
        this.itens.add(adicionar);
    }

    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CategoryAdapter.ViewHolder holder, final int position) {
        holder.btCategory.setBackgroundResource(itens.get(position).getImage_id());
        // Define click listener do elemento selecionado
        if(position!=itens.size()-1) {
            holder.btCategory.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "" + context.getResources().getResourceEntryName(itens.get(position).getImage_id()), Toast.LENGTH_SHORT).show();
                }
            });
        }else {
            holder.element.setAlpha(0.4f);
            holder.btCategory.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "" + context.getResources().getResourceEntryName(itens.get(position).getImage_id()), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return this.itens.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageButton btCategory;
        private LinearLayout element;
        public ViewHolder(View v) {
            super(v);
            btCategory = (ImageButton) v.findViewById(R.id.bt_category);
            element = (LinearLayout) v.findViewById(R.id.elemento_inflater);
        }

        public ImageButton getBtCategory() {
            return btCategory;
        }

        public void setBtCategory(ImageButton btCategory) {
            this.btCategory = btCategory;
        }

        public LinearLayout getElement() {
            return element;
        }

        public void setElement(LinearLayout element) {
            this.element = element;
        }
    }
}
