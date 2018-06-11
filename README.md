# StoryView [![](https://jitpack.io/v/bxute/StoryView.svg)](https://jitpack.io/#bxute/StoryView)

A library for social stories.

How it looks like:

**Story View**


<img src="https://user-images.githubusercontent.com/10809719/41230599-03e56ed0-6d9e-11e8-9763-a38a88957ad3.png" width="320px" height="640px"/>

**Story Player**


<img src="https://user-images.githubusercontent.com/10809719/41230598-03a4a2b0-6d9e-11e8-8ba6-c5f1760523f1.png" width="320px" height="640px"/>

### Features:
 - It marks the visited stories

![visit_show](https://user-images.githubusercontent.com/10809719/41231419-a66d6c32-6da0-11e8-8c49-6f0cc5693cb3.gif)

 - It pauses when we keep our finger on screen and resumes when fingers are released.
 
![pause_show](https://user-images.githubusercontent.com/10809719/41231418-a63aae32-6da0-11e8-852d-365d44ce9dc5.gif)
### How to use this library

 1. Add it in your root build.gradle at the end of repositories:
 ```java
allprojects {
	repositories {
	maven { url 'https://jitpack.io' }
	}
}
```

 2. Add the dependency
 ```java
dependencies {
    mplementation 'com.github.bxute:StoryView:v1.0'
}

``` 

 3. Add xml to your layout
 ```xml
<xute.storyview.StoryView
         android:id="@+id/storyView"
         android:layout_width="wrap_content"
         android:layout_height="wrap_content"
         android:layout_centerInParent="true"
         app:spaceBetweenImageAndIndicator="1dp"
         app:storyImageRadius="8dp"
         app:storyItemIndicatorWidth="1dp" />
 ```
 
 4. Set story info
 ```java
StoryView storyView = findViewById(R.id.storyView);
        storyView.resetStoryVisits();
        ArrayList<StoryModel> uris = new ArrayList<>();
        uris.add(new StoryModel("https://www.planwallpaper.com/static/images/animals-4.jpg","Steve","Yesterday"));
        uris.add(new StoryModel("https://static.boredpanda.com/blog/wp-content/uuuploads/albino-animals/albino-animals-3.jpg","Grambon","10:15 PM"));
        storyView.setImageUris(uris);
```

That`s it 😀

### Customizations
You can customize the experience of `StoryView` using below given set of attributes:
```xml
        <attr name="storyImageRadius" format="dimension"/>
        <attr name="storyItemIndicatorWidth" format="dimension"/>
        <attr name="spaceBetweenImageAndIndicator" format="dimension"/>
        <attr name="pendingIndicatorColor" format="color"/>
        <attr name="visitedIndicatorColor" format="color"/>
```

When you need to put a set of new stories use 
```java
 storyView.resetStoryVisits();
```
this to reset the visits.

### Contributions

Any contributions are welcome. You can send PR or open issues.

### License
MIT License

Copyright (c) 2018 bxute

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.


