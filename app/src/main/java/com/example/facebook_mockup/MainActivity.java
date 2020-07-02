package com.example.facebook_mockup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mainFbArea;
    private ConstraintLayout comments;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFbArea = findViewById(R.id.mainFbArea);         //get the activity_main list view
        List<facebookPost> fbPosts = new ArrayList<>();     //create a array list of the facebookPost


        //creates 7 facebook posts
        fbPosts.add(new facebookPost(R.drawable.kobe,"Kobe Bryant", "23/08/2020", "In my Honor", R.drawable.kobeimg, "24 Likes 8 Comments"));
        fbPosts.add(new facebookPost(R.drawable.tony,"Tony Robbins", "09/07/2020", "Happy Birthday to Shai!", "48 Likes 6 Comments"));
        fbPosts.add(new facebookPost(R.drawable.ksi,"KSI", "25/08/2020", "I won that fight...", R.drawable.ksiimg, "20K Likes 8K Comments"));
        fbPosts.add(new facebookPost(R.drawable.hacker,"Hacker", "??/??/????", "Gotcha!",  "∞ Likes ∞ Comments"));
        fbPosts.add(new facebookPost(R.drawable.luffy,"Monkey D. Luffy", "05/05/1485", "Where's My MEAT?!", R.drawable.luffyimg, "0 Likes 1 Comments"));
        fbPosts.add(new facebookPost(R.drawable.winnie,"Winnie The Pooh", "01/01/2000", "Honey I'm Home", "5 Likes 7 Comments"));
        fbPosts.add(new facebookPost(R.drawable.harry,"Harry Potter", "01/01/3000", "I DO MAGIC", R.drawable.harryimg, "250K Likes 5K Comments"));

        fbPostsAdapter fbAdapter = new fbPostsAdapter(this, R.layout.fb_layout, fbPosts);                     //create the adapter for out facebook posts
        mainFbArea.setAdapter(fbAdapter);                                                                             //setting the adapter to out main page

    }

    //Go to the comments screen
    public void goToComments(View view){
        Intent intent = new Intent(this, commentPage.class);
        startActivity(intent);
    }

}
