package com.example.testnumber2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.graphics.Color;


public class GameActivity extends AppCompatActivity {
    private static final String TAG = "GameActivity";
    private FrameLayout frame;
    private PaintView paintView;

    private Button btnfilled;
    private Button btnUnfilled;
    private boolean FilledOrNot;
    private Button btnWidth;
    private boolean thickorthin = false;
    private Button btnAreaRemove;




    // text view variable to set the color for GFG text
    private TextView gfgTextView;

    // two buttons to open color picker dialog and one to
    // set the color for GFG text
    private Button mSetColorButton, mPickColorButton;

    // view box to preview the selected color
    private View mColorPreview;

    // this is the default color of the preview box
    private int mDefaultColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        frame = findViewById(R.id.frm);
        paintView = new PaintView(this);
        frame.addView(paintView);



    public void addLine(View view) {
        PaintView.addSquare();
    }

    public void changeColor(View view)
    {
        String color = view.getTag().toString();
        paintView.setColor(color);
    }

    public void clear(View view) {
        paintView.undo();
    }
}
