# SpinningButtonLibrary
A spinning button animation library

# For gradle import
#  Step 1. Add the JitPack repository to your build file. Add it in your root build.gradle at the end of repositories:

    allprojects 
    {
        repositories 
        {
             ...
             maven { url 'https://jitpack.io' }
        }
    }

#  Step 2. Add the dependency to app level build.gradle
    dependencies 
    {
        implementation 'com.github.jahangirng:SpinningButtonLibrary:v1.0'
    }

# To use the button in your project, add this in your xml file.
    <FrameLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

    <com.gc.spinningbutton.SpinningButton
        android:id="@+id/sButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:text="Click Me"
        app:spinningDirection="right"/>
    </FrameLayout>
    
# Animation values
    app:spinningDirection="left"
    or
    app:spinningDirection="right"

# Animation property can be also called programatically
    SpinningButton sButton;

    sButton = findViewById(R.id.sButton);
    sButton.setSpinDirection(0);     //0 for right 
    or 
    sButton.setSpinDirection(1);     ////1 for left



    
