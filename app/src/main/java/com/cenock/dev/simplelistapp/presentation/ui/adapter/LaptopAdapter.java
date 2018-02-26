package com.cenock.dev.simplelistapp.presentation.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.cenock.dev.simplelistapp.R;
import com.cenock.dev.simplelistapp.databinding.ItemLaptopBinding;
import com.cenock.dev.simplelistapp.domain.model.Laptop;

import java.util.List;

import cleancore.dev.cenock.com.core.presentation.ui.adapter.BaseListAdapter;
import cleancore.dev.cenock.com.core.presentation.ui.adapter.holder.BaseViewHolder;

/**
 * Created by carlosenock on 2/25/18.
 */

public class LaptopAdapter extends BaseListAdapter<Laptop, LaptopAdapter.LaptopHolder> {

    @Override
    protected RecyclerView.ViewHolder createViewHolder(int viewType, View v) {
        return new LaptopHolder(v);
    }

    @Override
    protected int getLayoutIdByType(int viewType) {
        return R.layout.item_laptop;
    }

    class LaptopHolder extends BaseViewHolder<Laptop, ItemLaptopBinding> {
        LaptopHolder(View itemView) {
            super(itemView);
        }

        @Override
        public void bind(int position, Laptop item) {
            Glide.with(itemView.getContext())
                    .load(item.image)
                    .placeholder(R.drawable.ic_placeholder_image)
                    .error(R.drawable.ic_placeholder_image)
                    .priority(Priority.HIGH)
                    .into(binder.ivLaptop);
            binder.tvTitle.setText(item.title);
            binder.tvDescription.setText(item.description);
        }
    }

    public void initializeList(List<Laptop> laptops) {
        list.addAll(laptops);
    }
}
