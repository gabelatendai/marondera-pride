package com.digitaltechnology.publichub.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.digitaltechnology.publichub.Item.MyPost;
import com.digitaltechnology.publichub.R;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ProductViewHolder> {


    private Context mCtx;
    private List<MyPost> myPostsList;

    public PostAdapter(Context mCtx, List<MyPost> productList) {
        this.mCtx = mCtx;
        this.myPostsList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.mypost_list, null);
        return new ProductViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        MyPost product = myPostsList.get(position);
        holder.textViewSub.setText(product.getSubject());
        holder.msg.setText(product.getMessage());
        holder.email.setText(String.valueOf(product.getEmail()));
        holder.phone.setText(String.valueOf(product.getPhone()));
    }

    @Override
    public int getItemCount() {
        return myPostsList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewSub, msg, phone, email;
        //ImageView imageView;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewSub = itemView.findViewById(R.id.subject);
            msg = itemView.findViewById(R.id.msg);
            phone = itemView.findViewById(R.id.phone);
            email = itemView.findViewById(R.id.email);
          //  imageView = itemView.findViewById(R.id.imageView);
        }
    }
}