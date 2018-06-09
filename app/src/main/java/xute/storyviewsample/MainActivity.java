package xute.storyviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import xute.storyview.StoryModel;
import xute.storyview.StoryView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StoryView storyView = findViewById(R.id.storyView);
        ArrayList<StoryModel> uris = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (i < 3) {
                uris.add(new StoryModel("https://images.pexels.com/photos/87840/daisy-pollen-flower-nature-87840.jpeg?cs=srgb&dl=plant-flower-macro-87840.jpg&fm=jpg", true));
            } else {
                uris.add(new StoryModel("http://content.gulte.com/content/2011/09/photos/actress/Kajal%20Agarwal/normal/Kajal%20Agarwal_270.jpg",false));
            }
        }
        storyView.setImageUris(uris);
    }
}
