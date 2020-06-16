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
    public final Integer DEFAULT_TEXT_COLOR = 0xFF706F6F;

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

        //attaching all the variables to their matching id's in-order to user them later
        TextView usernameTextView = convertView.findViewById(R.id.username);
        TextView dateTextView = convertView.findViewById(R.id.date);
        TextView likeRatioTextView = convertView.findViewById(R.id.likeRatio);
        TextView statusTextView = convertView.findViewById(R.id.statusText);
        ImageView profileTextView = convertView.findViewById(R.id.profile_picture);
        ImageView mainImageTextView = convertView.findViewById(R.id.mainImage);
        Button likeBtn = convertView.findViewById(R.id.likeBtn);

        facebookPost currentPost = this.fbPosts.get(position);                                      //setting the current post, so every time we'll post/update the post we're currently looking at

        //Using the get methods we setted up in the "facebookPost" class, and setting the right data to the current post.
        usernameTextView.setText(currentPost.getUsername());
        dateTextView.setText(currentPost.getDate());
        likeRatioTextView.setText(currentPost.getLikeRatio());
        statusTextView.setText(currentPost.getStatusText());
        profileTextView.setBackgroundResource(currentPost.getProfilePicture());
        mainImageTextView.setBackgroundResource(currentPost.getMainImage());



        //lambda onclicklistener. every time we'll click on the like button it'll change the text color of the like button to blue, and if it already pressed it'll change it back to the original color.
        likeBtn.setOnClickListener(v -> {
            if(likeBtn.getCurrentTextColor() == DEFAULT_TEXT_COLOR) {
                likeBtn.setTextColor(Color.BLUE);
            } else {
                likeBtn.setTextColor(DEFAULT_TEXT_COLOR);
            }
        });

        return convertView;
    }
}
