package xute.storyview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import java.util.ArrayList;

public class StoryPlayer extends AppCompatActivity implements StoryPlayerProgressView.StoryPlayerListener {
    public static final String STORY_IMAGE_KEY = "storyImages";
    StoryPlayerProgressView storyPlayerProgressView;
    ImageView imageView;
    ArrayList<StoryModel> imagesUris;
    StoryPreference storyPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_player);
        storyPlayerProgressView = findViewById(R.id.progressBarView);
        storyPlayerProgressView.setSingleStoryDisplayTime(2000);
        imageView = findViewById(R.id.storyImage);
        storyPreference = new StoryPreference(this);
        Intent intent = getIntent();
        if (intent != null) {
            imagesUris = intent.getParcelableArrayListExtra(STORY_IMAGE_KEY);
            initStoryProgressView();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        storyPlayerProgressView.cancelAnimation();
    }

    private void initStoryProgressView() {
        if (imagesUris != null && imagesUris.size() > 0) {
            storyPlayerProgressView.setStoryPlayerListener(this);
            storyPlayerProgressView.setProgressBarsCount(imagesUris.size());
            setTouchListener();
        }
    }

    private void setTouchListener() {
        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    //pause
                    storyPlayerProgressView.pauseProgress();
                    return true;
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    //resume
                    storyPlayerProgressView.resumeProgress();
                    return true;
                }else {
                    return false;
                }
            }
        });
    }


    @Override
    public void onStartedPlaying(int index) {
        loadImage(index);
        storyPreference.setStoryVisited(imagesUris.get(index).imageUri);
    }

    @Override
    public void onFinishedPlaying() {
        finish();
    }

    private void loadImage(int index) {
        Glide.with(this)
                .load(imagesUris.get(index).imageUri)
                .transition(DrawableTransitionOptions.withCrossFade(800))
                .into(imageView);
    }
}
