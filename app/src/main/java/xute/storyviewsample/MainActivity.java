package xute.storyviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import xute.storyview.StoryModel;
import xute.storyview.StoryPlayerProgressView;
import xute.storyview.StoryView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StoryView storyView = findViewById(R.id.storyView);
        ArrayList<StoryModel> uris = new ArrayList<>();
        uris.add(new StoryModel("https://images.pexels.com/photos/87840/daisy-pollen-flower-nature-87840.jpeg?cs=srgb&dl=plant-flower-macro-87840.jpg&fm=jpg"));
        uris.add(new StoryModel("https://bornrealist.com/wp-content/uploads/2017/11/Here-Are-Top-10-Cute-Animals-That-Might-Actually-Kill-You.jpg"));
        uris.add(new StoryModel("https://www.planwallpaper.com/static/images/animals-4.jpg"));
        uris.add(new StoryModel("https://static.boredpanda.com/blog/wp-content/uuuploads/albino-animals/albino-animals-3.jpg"));
        storyView.setImageUris(uris);
    }
}
