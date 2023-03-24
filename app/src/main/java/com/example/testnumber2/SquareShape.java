package com.example.testnumber2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;


public class SquareShape extends AreaShape {

    private int xEnd;
    private int yEnd;

    public SquareShape(int x, int y, String color,boolean style) {
        super(x, y, color, style);
        xEnd = x;
        yEnd = y;
    }

    @Override
    public void updatePoint(int xe, int ye) {
        xEnd = xe;
        yEnd = ye;
    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
        super.draw(canvas,paint);
        canvas.drawRect(x,y,xEnd,yEnd,paint);
    }
}
