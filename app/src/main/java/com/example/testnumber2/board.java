package com.example.testnumber2;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.GridLayout;
import android.widget.TextView;

public class board extends GridLayout {

    private int rows = 8;
    private int columns = 8;
    private int squareSize = 100;

    public board(Context context) {
        super(context);

        setRowCount(rows);
        setColumnCount(columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                TextView square = new TextView(context);
                square.setWidth(squareSize);
                square.setHeight(squareSize);
                square.setGravity(Gravity.CENTER);
                if ((i + j) % 2 == 0) {
                    square.setBackgroundColor(Color.WHITE);
                } else {
                    square.setBackgroundColor(Color.BLACK);
                }
                addView(square);
            }
        }
    }
}