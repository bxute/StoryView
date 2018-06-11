package xute.storyview;

import android.os.Parcel;
import android.os.Parcelable;

public class StoryModel implements Parcelable {
    public String imageUri;

    public StoryModel(String imageUri) {
        this.imageUri = imageUri;
    }

    protected StoryModel(Parcel in) {
        imageUri = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(imageUri);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<StoryModel> CREATOR = new Parcelable.Creator<StoryModel>() {
        @Override
        public StoryModel createFromParcel(Parcel in) {
            return new StoryModel(in);
        }

        @Override
        public StoryModel[] newArray(int size) {
            return new StoryModel[size];
        }
    };
}
