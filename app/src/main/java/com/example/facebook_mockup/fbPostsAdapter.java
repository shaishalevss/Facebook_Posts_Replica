package com.example.facebook_mockup;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class fbPostsAdapter extends ArrayAdapter {

    private List<facebookPost> fbPosts;
    private Context activity;
    private int layoutId;


    public fbPostsAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.fbPosts = objects;
        this.activity = context;
        this.layoutId = resource;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(this.activity);
        convertView = inflater.inflate(this.layoutId, parent,false);


        Boolean[] isClicked = new Boolean[7];
        TextView usernameTextView = convertView.findViewById(R.id.username);
        TextView dateTextView = convertView.findViewById(R.id.date);
        TextView likeRatioTextView = convertView.findViewById(R.id.likeRatio);
        TextView statusTextView = convertView.findViewById(R.id.statusText);
        ImageView profileTextView = convertView.findViewById(R.id.profile_picture);
        ImageView mainImageTextView = convertView.findViewById(R.id.mainImage);
        Button likeBtn = convertView.findViewById(R.id.likeBtn);



        facebookPost currentPost = this.fbPosts.get(position);
        usernameTextView.setText(currentPost.getUsername());
        dateTextView.setText(currentPost.getDate());
        likeRatioTextView.setText(currentPost.getLikeRatio());
        statusTextView.setText(currentPost.getStatusText());
        profileTextView.setBackgroundResource(currentPost.getProfilePicture());
        mainImageTextView.setBackgroundResource(currentPost.getMainImage());




        likeBtn.setOnClickListener(v -> {
            if(likeBtn.getCurrentTextColor() == 0xFF706F6F) {
                likeBtn.setTextColor(Color.BLUE);
                isClicked[position] = true;
            } else {
                likeBtn.setTextColor(0xFF706F6F);
                isClicked[position] = false;
            }
        });


        return convertView;
    }
}
