package com.xibei.personaldesign.itemDemo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import com.xibei.personaldesign.R;

public class ActivityView2 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_view_2);
    }



    //直线路径
    class LinePathView extends View{

        public LinePathView(Context context) {
            super(context);
        }

        public LinePathView(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        public LinePathView(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint paint=new Paint();
            paint.setColor(Color.RED);  //设置画笔颜色
            paint.setStyle(Paint.Style.STROKE);//填充样式改为描边
            paint.setStrokeWidth(5);//设置画笔宽度

            Path path = new Path();

            path.moveTo(10, 10); //设定起始点
            path.lineTo(10, 100);//第一条直线的终点，也是第二条直线的起点
            path.lineTo(300, 100);//画第二条直线
            path.lineTo(500, 100);//第三条直线
            path.close();//闭环

            canvas.drawPath(path, paint);

        }
    }






}
