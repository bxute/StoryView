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
        uris.add(new StoryModel("https://images.pexels.com/photos/87840/daisy-pollen-flower-nature-87840.jpeg?cs=srgb&dl=plant-flower-macro-87840.jpg&fm=jpg", true));
        uris.add(new StoryModel("http://content.gulte.com/content/2011/09/photos/actress/Kajal%20Agarwal/normal/Kajal%20Agarwal_270.jpg", false));
        uris.add(new StoryModel("https://images.pexels.com/photos/257360/pexels-photo-257360.jpeg?auto=compress&cs=tinysrgb&h=350", true));
        uris.add(new StoryModel("https://media.istockphoto.com/photos/sunrise-on-yosemite-valley-picture-id505872990?k=6&m=505872990&s=612x612&w=0&h=XcdHhkC9PF9-saYT6n_GQD-0Hf8dbI_Q4wfYlZZGpNk=", true));
        storyView.setImageUris(uris);
    }
}
