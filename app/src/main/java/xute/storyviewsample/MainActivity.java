package xute.storyviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import xute.storyview.StoryModel;
import xute.storyview.StoryView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StoryView storyView = findViewById(R.id.storyView);
        storyView.setActivityContext(this);
        storyView.resetStoryVisits();
        ArrayList<StoryModel> uris = new ArrayList<>();
        uris.add(new StoryModel("https://picsum.photos/200/300", "Ankit Kumar", "12:00 PM"));
        uris.add(new StoryModel("https://cdn.pixabay.com/photo/2015/04/19/08/32/marguerite-729510__340.jpg", "Panda Man", "01:00 AM"));
        uris.add(new StoryModel("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRCv_Gx6Fde6mja_lLmll0fzrxRvcKLHGrPxnqMrQLWKqXi9IYy&usqp=CAU", "Steve", "Yesterday"));
        uris.add(new StoryModel("https://english.mathrubhumi.com/polopoly_fs/1.3885588!/image/image.jpg_gen/derivatives/landscape_607/image.jpg", "Grambon", "10:15 PM"));
        storyView.setImageUris(uris);
    }
}
