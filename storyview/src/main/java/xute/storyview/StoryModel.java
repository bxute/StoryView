package xute.storyview;

import android.os.Parcel;
import android.os.Parcelable;

public class StoryModel implements Parcelable {
    public String imageUri;
    public boolean isVisited;

    public StoryModel(String imageUri, boolean isVisited) {
        this.imageUri = imageUri;
        this.isVisited = isVisited;
    }

    protected StoryModel(Parcel in) {
        imageUri = in.readString();
        isVisited = in.readByte() != 0x00;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(imageUri);
        dest.writeByte((byte) (isVisited ? 0x01 : 0x00));
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
