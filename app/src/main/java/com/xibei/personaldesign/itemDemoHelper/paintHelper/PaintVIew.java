package com.xibei.personaldesign.itemDemoHelper.paintHelper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LightingColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

import com.xibei.personaldesign.R;

/**
 * Created by Xibei on 2019/6/5.
 * Github: https://github.com/jiezongnewstar
 * Email: ibossjia@gmail.com
 * Deeclaration: Paint 常用API
 */
public class PaintVIew extends View {

    private Paint mPaint;

    private Shader mShader;

    private Bitmap mBitmap;


    public PaintVIew(Context context) {
        this(context, null);
    }

    public PaintVIew(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PaintVIew(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 10;

        mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.girl, options);

        mPaint = new Paint();                           //初始化
//        mPaint.setAntiAlias(true);                      //抗锯齿
//        mPaint.setColor(Color.RED);                     //画笔颜色
//        mPaint.setAlpha(233);                           //设置透明度，0 ~255
        mPaint.setStrokeWidth(200);                      //画笔粗细
//        mPaint.setARGB(233,233,233,233);    //画笔颜色，范围0~255
//        mPaint.setStyle(Paint.Style.STROKE);            //描边效果
//        mPaint.setStrokeCap(Paint.Cap.ROUND);           //端点处圆角效果
//        mPaint.setStrokeJoin(Paint.Join.MITER);         //两条线拐角风格
//        mPaint.setShader(new SweepGradient(1,1,Color.YELLOW,Color.BLACK));//设置环形渲染器
//        mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));     //设置图层混合模式
//        mPaint.setColorFilter(new LightingColorFilter(0x00ffff,0x000000)); //设置颜色过滤器
//        mPaint.setTextScaleX(2);                        //设置文本缩放倍数
//        mPaint.setTextSize(14);                         //设置字体大小
//        mPaint.setTextAlign(Paint.Align.LEFT);          //设置字体对齐方式
//        mPaint.setUnderlineText(true);                  //设置文字下划线
//
//        String str = "android 工程师";
//        Rect rect = new Rect();
//        mPaint.getTextBounds(str,0,str.length(),rect);  //测量文本大小，将文本大小信息存放在rect中
//        mPaint.measureText(str);                        //获取文本宽高
//        mPaint.getFontMetrics();                        //获取字体度量对象


    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        canvas.drawColor(Color.BLUE);

        //线性渲染
//        mShader = new LinearGradient(getWidth()/2,getHeight()/2,
//                500,500,new int[]{Color.RED,Color.BLUE},
//                null,Shader.TileMode.CLAMP);


        //环形渲染
//        mShader = new RadialGradient(250,250,250,new int[]{Color.GREEN,Color.YELLOW,Color.RED},null,Shader.TileMode.CLAMP);
//        mPaint.setShader(mShader);
//        canvas.drawCircle(250,250,250,mPaint);


        //扫描渲染
//        mShader = new SweepGradient(250,250,Color.RED,Color.GREEN);
//        mPaint.setShader(mShader);
//        canvas.drawCircle(250,250,250,mPaint);

//        mShader = new SweepGradient(250,250,new int[]{Color.RED,Color.GREEN},new float[]{0f,0.5f});
//        mPaint.setShader(mShader);
//        canvas.drawCircle(250,250,250,mPaint);


        //组合渲染
//        BitmapShader bitmapShader = new BitmapShader(mBitmap,Shader.TileMode.REPEAT,Shader.TileMode.REPEAT);
//
//        LinearGradient linearGradient = new LinearGradient(0,0,1000,1600,
//                new int[]{Color.GREEN,Color.BLUE},null,Shader.TileMode.CLAMP);
//
//        mShader = new ComposeShader(bitmapShader,linearGradient, PorterDuff.Mode.MULTIPLY);
//        mPaint.setShader(mShader);
//        canvas.drawCircle(250,250,250,mPaint);
//
//
//        mPaint.setShader(mShader);
//        canvas.drawLine(getWidth() / 2, getHeight() / 2, 500, 500, mPaint);

        //颜色滤镜
//        ColorFilter lighting = new LightingColorFilter(0xff00ff,0x000000);
//        mPaint.setColorFilter(lighting);
//        canvas.drawBitmap(mBitmap,0,0,mPaint);



//        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Color.BLUE,PorterDuff.Mode.LIGHTEN);
//        mPaint.setColorFilter(porterDuffColorFilter);
//        canvas.drawBitmap(mBitmap,0,0,mPaint);


        float[] colorMatrix = {
                1,0,0,0,0,  //red
                0,1,0,0,0,  //green
                0,0,1,0,0,  //blue
                0,0,0,1,0,  //alpha
        };

//
        ColorMatrix cm = new ColorMatrix();
        cm.setScale(1,1,1,1);
            //饱和度  0,无色彩 1默认效果  >1饱和度加强
        cm.setSaturation(1);

        //颜色角度  axis  0 ,1 2, 对应红绿蓝
        cm.setRotate(1,200);

        ColorMatrixColorFilter mColorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
        mPaint.setColorFilter(mColorMatrixColorFilter);
        canvas.drawBitmap(mBitmap,0,0,mPaint);

    }


}
