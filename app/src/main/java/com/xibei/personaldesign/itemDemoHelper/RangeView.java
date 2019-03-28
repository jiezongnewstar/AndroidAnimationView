package com.xibei.personaldesign.itemDemoHelper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.util.AttributeSet;
import android.view.View;

public class RangeView extends View {

    private String caseString = "default"; //配合按钮

    public RangeView(Context context) {
        super(context);
    }

    public RangeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RangeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }


    public void  setString(String string){
        this.caseString = string;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //初始化画笔
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(2);

        Region rgn = new Region(10,10,100,100);


        //------------- 合并交叉-----------//

        //构造两个矩形
        Rect rect2 = new Rect(300,100,600,200);
        Rect rect3 = new Rect(400,0,500,300);

        //构造一个画笔，画出矩形轮廓
        Paint paint1 = new Paint();
        paint1.setColor(Color.RED);
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setStrokeWidth(2);

        canvas.drawRect(rect2, paint1);
        canvas.drawRect(rect3, paint1);
        //构造两个Region
        Region region1 = new Region(rect2);
        Region region2= new Region(rect3);

        Paint paint_fill = new Paint();
        paint_fill.setColor(Color.GREEN);
        paint_fill.setStyle(Paint.Style.FILL);
        drawRegion(canvas, region2, paint_fill);


        switch (caseString){

            case "default":
                rgn = new Region(10,10,100,100);
                drawRegion(canvas, rgn, paint);
                break;
            case "setEmpty":
                rgn.setEmpty();
                drawRegion(canvas, rgn, paint);
                break;
            case "setRegion":
                rgn.set(new Region(20,20,200,200));
                drawRegion(canvas, rgn, paint);
                break;
            case "setRect":
                rgn.set(new Rect(30,30,300,300));
                drawRegion(canvas, rgn, paint);
                break;
            case "setLftb":
                rgn.set(40,40,400,400);
                drawRegion(canvas, rgn, paint);
                break;
            case "setPathRegion":
                //构造一个椭圆路径
                Path ovalPath = new Path();
                RectF rect =  new RectF(50, 50, 200, 500);
                ovalPath.addOval(rect, Path.Direction.CCW);
                rgn.setPath(ovalPath,new  Region(50, 50, 200, 200));
                drawRegion(canvas, rgn, paint);
                break;
            case "regionIterator":
                paint.setStyle(Paint.Style.STROKE);
                Path ovalPath1 = new Path();
                RectF rect4 =  new RectF(50, 50, 200, 500);
                ovalPath1.addOval(rect4, Path.Direction.CCW);
                rgn.setPath(ovalPath1,new  Region(50, 50, 200, 500));
                drawRegion(canvas, rgn, paint);
                break;
            case "DIFFERENCE":
                region1.op(region2, Region.Op.DIFFERENCE);
                drawRegion(canvas, region1, paint_fill);
                break;
            case "INTERSECT":
                region1.op(region2, Region.Op.INTERSECT);
                drawRegion(canvas, region1, paint_fill);
                break;
            case "UNION":
                region1.op(region2, Region.Op.UNION);
                drawRegion(canvas, region1, paint_fill);
                break;
            case "XOR":
                region1.op(region2, Region.Op.XOR);
                drawRegion(canvas, region1, paint_fill);
                break;
            case "REVERSE_DIFFERENCE":
                region1.op(region2, Region.Op.REVERSE_DIFFERENCE);
                drawRegion(canvas, region1, paint_fill);
                break;
            case "REPLACE":
                region1.op(region2, Region.Op.REPLACE);
                drawRegion(canvas, region1, paint_fill);
                break;


        }




    }

    private void drawRegion(Canvas canvas,Region rgn,Paint paint) {
        RegionIterator iter = new RegionIterator(rgn);
        Rect r = new Rect();

        while (iter.next(r)) {
            canvas.drawRect(r, paint);
        }
    }


}
