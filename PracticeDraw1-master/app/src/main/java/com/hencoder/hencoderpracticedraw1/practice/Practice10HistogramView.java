package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    private Paint paint=new Paint();
    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        canvas.drawColor(Color.rgb(100,100,100));
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(6);
        paint.setStyle(Paint.Style.STROKE);
        Path path=new Path();
        path.moveTo(100,50);
        path.rLineTo(0,600);
        path.rLineTo(800,0);
        canvas.drawPath(path,paint);
        Path path1=new Path();
        path1.moveTo(150,650);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.rgb(100,200,200));
        path1.rLineTo(0,-50);
        path1.rLineTo(100,0);
        path1.rLineTo(0,50);
        path1.rMoveTo(20,0);
        path1.rLineTo(0,-100);
        path1.rLineTo(100,0);
        path1.rLineTo(0,100);

        path1.rMoveTo(20,0);
        path1.rLineTo(0,-150);
        path1.rLineTo(100,0);
        path1.rLineTo(0,150);

        path1.rMoveTo(20,0);
        path1.rLineTo(0,-200);
        path1.rLineTo(100,0);
        path1.rLineTo(0,200);
        canvas.drawPath(path1,paint);
    }
}
