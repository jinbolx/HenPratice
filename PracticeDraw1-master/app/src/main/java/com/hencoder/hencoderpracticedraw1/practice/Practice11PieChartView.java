package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    private Paint paint=new Paint();
    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        paint.setAntiAlias(false);
        paint.setColor(Color.RED);
        RectF rectF=new RectF(300,100,700,500);
        canvas.drawArc(rectF,-180,120,true,paint);
        paint.setColor(Color.rgb(200,100,100));
        canvas.translate(10,10);
        canvas.drawArc(rectF,-60,60,true,paint);
        canvas.translate(5,5);
        paint.setColor(Color.rgb(150,150,0));
        canvas.drawArc(rectF,0,40,true,paint);
        paint.setColor(Color.rgb(225,0,255));
        canvas.translate(-5,5);
        canvas.drawArc(rectF,40,140,true,paint);
    }
}
