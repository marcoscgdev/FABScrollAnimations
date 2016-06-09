# FAB Scroll Animations  [![API](https://img.shields.io/badge/API-14%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=14) [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-FAB%20Scroll%20Animations-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/3367)

With this Android library, you can made this animations with your [Support Library Floating Action Button](http://developer.android.com/reference/android/support/design/widget/FloatingActionButton.html) when a RecyclerView is beeing scrolled:

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
* A NestedScrollView.
 
---

###Usage:

####Step: 1
Include the [fabscrollanimations.jar](https://github.com/marcoscgdev/FABScrollAnimations/blob/master/library/fabscrollanimations.jar?raw=true) file to your _libs_ folder.
####Step: 2
Ensure that your layout starts with a _CoordinatorLayout_.
####Step: 3
This library only works with _NestedScrollView based content_.
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
You have to emphasize the last line of code of the FloatingActionButton.
```xml
        app:layout_behavior="com.marcoscg.fabscrollanimations.Fade"
```
It tells to the FAB the animation that it have to do when user scrolls the content.

---

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

---

>See the [sample project](https://github.com/marcoscgdev/FABScrollAnimations/tree/master/sample) for clarify any queries you may have.
