# FAB Scroll Animations

With this Android library, you can made this animations to your Floating Action Button when a RecyclerView is beeing scrolled:

| DEFAULT | FADE | FLOAT |
|----------|:-------------:|------:|
| ![](http://i.imgur.com/qps7rJU.gif) | ![](http://i.imgur.com/eBi91N9.gif) | ![](http://i.imgur.com/jyKygPS.gif) |

---

###Demo:

**Video demo:** <a href=#><img src=http://www.marketingtango.com/wp-content/uploads/2014/02/YouTube-icon-full_color.png width=50 /></a>

You can download the **sample apk** [here](https://github.com/marcoscgdev/fabscrollanimations/blob/master/sample/sample.apk?raw=true).

---

###Requirements:

* The Android Support Library v7 AppCompat.
* The Android Support Design Library Floating Action Button.
* A CoordinatorLayout as the master layout.
* A RecyclerView with the scroll content.

>(See the sample project for clarify any queries you may have.)
 
---

###Usage:

####Step: 1
Include the [fabscrollanimations.jar](https://github.com/marcoscgdev/FABScrollAnimations/blob/master/library/fabscrollanimations.jar?raw=true) file to your libs folder.
####Step: 2
Ensure that your layout starts with a CoordinatorLayout.
####Step: 3
This library only works with a RecyclerView, so if you have a ListView, you'll need to migrate it ([this tutorial](http://andraskindler.com/blog/2014/migrating-to-recyclerview-from-listview) can be useful for it).
####Step: 4
An example layout structure can be:
```xml
<android.support.design.widget.CoordinatorLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <android.support.v7.widget.RecyclerView
        android:id="@+id/recyclerview"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
        
    <android.support.design.widget.FloatingActionButton
        android:id="@+id/fab"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="16dp"
        android:src="@drawable/plus"
        app:rippleColor="#4DFFFFFF"
        app:borderWidth="0dp"
        app:elevation="6dp"
        app:layout_anchor="@+id/recyclerview"
        app:layout_anchorGravity="bottom|end"
        app:layout_behavior="com.marcoscg.fabscrollanimations.Fade"/>

</android.support.design.widget.CoordinatorLayout>
```
You have to emphasize the last 3 lines of code of the FloatingActionButton.
```xml
        app:layout_anchor="@+id/recyclerview"
        app:layout_anchorGravity="bottom|end"
        app:layout_behavior="com.marcoscg.fabscrollanimations.Fade"
```
The first one anchor the FAB with the RecyclerView dimensions.

The second one controls the FAB gravity.

The third one tells to the FAB the animation that it have to do when the RecyclerView is beeing scrolled.

There are currently three animations:

* **DEFAULT:**

  Use this layout_behavior:
```xml
        app:layout_behavior="com.marcoscg.fabscrollanimations.Default"
```

* **FADE:**

  Use this layout_behavior:
```xml
        app:layout_behavior="com.marcoscg.fabscrollanimations.Fade"
```

* **FLOAT:**

  Use this layout_behavior:
```xml
        app:layout_behavior="com.marcoscg.fabscrollanimations.Float"
```
