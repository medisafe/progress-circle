# progress-circle
progress circle view

<img src="https://cloud.githubusercontent.com/assets/19874536/16151127/f225cf26-34a3-11e6-8f75-9d89624f4552.png" width="150 height="150"/>

##Usage

####XML
```xml
<com.tgd.libraries.views.progresscircle.ProgressCircle
        android:id="@+id/circle_progress"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:padding="32dp"
        app:progressColor="@color/colorPrimary"
        app:textColor="@color/colorPrimary"
        app:outlineWidth="16dp"
        app:ProgressWidth="10dp"/>
```

####Code
```
mCircleProgress = (ProgressCircle) findViewById(R.id.circle_progress);
mCircleProgress.setProgress(90);
```


####Attributes

```xml
<declare-styleable name="ProgressCircle">
        <attr name="textColor" />
        <attr name="progressColor" />
        <attr name="ProgressWidth" />
        <attr name="outlineColor" />
        <attr name="outlineWidth" />
        <attr name="maxProgressValue" />
        <attr name="maxAnimationDuration" />
        <attr name="minAnimationDuration" />
    </declare-styleable>
```
    

