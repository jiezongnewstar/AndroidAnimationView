** ### 动画（animation、animator）-- 自定义控件(Ondraw,OnMesure,Onlayout) -- 以及实战（最后策划）[Ps莫在意代码习惯是否好坏，因为时间有限，主要是分享给大家具体怎么操作]**
<hr>

**接下来还会推出kotlin版本，请关注的我repos**

 <h4><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/release/app-release.apk?raw=true" >点我下载示例APK</a></h4>
 <h3>源码目录索引</h3>
        <p><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/src/main/java/com/xibei/personaldesign/itemDemo/ActivityAnimation1.java">
         动画 1 : scale、rotate、translate、alpha、set</a></p>
        <p><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/src/main/java/com/xibei/personaldesign/itemDemo/ActivityAnimation2.java">
        动画 2 : 动画一 + interpolater 效果</a></p>
        <p><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/src/main/java/com/xibei/personaldesign/itemDemo/ActivityAnimation3.java">
        动画 3 : 代码实现动画效果</a></p>
        <p><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/src/main/java/com/xibei/personaldesign/itemDemo/ActivityAnimation4.java">
        动画 4 ：View Anmation 和 Value Animator的对比</a></p>
        <p><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/src/main/java/com/xibei/personaldesign/itemDemo/ActivityAnimation5.java">
        动画 5 ：Value Animator 插值器</a></p>
        <p><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/src/main/java/com/xibei/personaldesign/itemDemo/ActivityAnimation6.java">
        动画 6 ：Value Animator Evaluator</a></p>
        <p><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/src/main/java/com/xibei/personaldesign/itemDemo/ActivityAnimation7.java">
        动画 7 ：Value Animator ofObject</a></p>
        <p><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/src/main/java/com/xibei/personaldesign/itemDemo/ActivityAnimation8.java">
        动画 8 ：Object Animator</a></p>
        <p><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/src/main/java/com/xibei/personaldesign/itemDemo/ActivityAnimation9.java">
        动画 9 ：Object Animator 自定义set方法</a></p>
        <p><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/src/main/java/com/xibei/personaldesign/itemDemo/ActivityAnimation10.java">
        动画 10 ：PropertyValuesHolder ofint、object和float方法</a></p>
        <p><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/src/main/java/com/xibei/personaldesign/itemDemo/ActivityAnimation11.java">
        动画 11 ：PropertyValuesHolder KeyFrame方法</a></p>
        <p><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/src/main/java/com/xibei/personaldesign/itemDemo/ActivityAnimation12.java">
        动画 12 ：联合动画</a></p>
        <p><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/src/main/java/com/xibei/personaldesign/itemDemo/ActivityAnimation13.java">
        动画 13 ：联合动画示例</a></p>
        <p><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/src/main/java/com/xibei/personaldesign/itemDemo/ActivityAnimation14.java">
        动画 14 ：代码实现layout、gridlayoutanimation</a></p>
        <p><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/src/main/java/com/xibei/personaldesign/itemDemo/ActivityAnimation15.java">
        动画 15 ：animateLayoutChanges 与 LayoutTransition</a></p>
        <p><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/src/main/java/com/xibei/personaldesign/itemDemo/ActivityAnimation16.java">
        动画 16 ：listView item 进入退出动画</a></p>
        <p><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/src/main/java/com/xibei/personaldesign/itemDemo/ActivityView1.java">
        ondraw 1：概述及基本几何图形绘制</a></p>
        <p><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/src/main/java/com/xibei/personaldesign/itemDemo/ActivityView2.java">
        ondraw 2：路径</a></p>
        <p><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/src/main/java/com/xibei/personaldesign/itemDemo/ActivityView3.java">
        ondraw 3：文字</a></p>
        <p><a href = "https://github.com/jiezongnewstar/AndroidAnimationView/blob/master/app/src/main/java/com/xibei/personaldesign/itemDemo/ActivityView4.java">
                ondraw 3：区域（Range）</a></p>


<p align="center">
    <img src="https://github.com/jiezongnewstar/AnimationViewandWedgit/blob/master/app/src/main/res/screen1.gif">
    <p align="center">
        <em>图片示例1</em>
    </p>
</p>

<p align="center">
    <img src="https://github.com/jiezongnewstar/AnimationViewandWedgit/blob/master/app/src/main/res/screen2.gif">
    <p align="center">
        <em>图片示例2</em>
    </p>
</p>

<p align="center">
    <img src="https://github.com/jiezongnewstar/AnimationViewandWedgit/blob/master/app/src/main/res/screen3.gif">
    <p align="center">
        <em>图片示例3</em>
    </p>
</p>

<p align="center">
    <img src="https://github.com/jiezongnewstar/AnimationViewandWedgit/blob/master/app/src/main/res/screen4.gif">
    <p align="center">
        <em>图片示例4</em>
    </p>
</p>

<p align="center">
    <img src="https://github.com/jiezongnewstar/AnimationViewandWedgit/blob/master/app/src/main/res/screen5.gif">
    <p align="center">
        <em>图片示例5</em>
    </p>
</p>

<p align="center">
    <img src="https://github.com/jiezongnewstar/AnimationViewandWedgit/blob/master/app/src/main/res/screen6.gif">
    <p align="center">
        <em>图片示例6</em>
    </p>
</p>

<p align="center">
    <img src="https://github.com/jiezongnewstar/AnimationViewandWedgit/blob/master/app/src/main/res/screen7.gif">
    <p align="center">
        <em>图片示例7</em>
    </p>
</p>

<p align="center">
    <img src="https://github.com/jiezongnewstar/AnimationViewandWedgit/blob/master/app/src/main/res/screen8.gif">
    <p align="center">
        <em>图片示例8</em>
    </p>
</p>

<p align="center">
    <img src="https://github.com/jiezongnewstar/AnimationViewandWedgit/blob/master/app/src/main/res/screen7.gif">
    <p align="center">
        <em>图片示例9</em>
    </p>
</p>

android 动画、自定义控件，学习记录demo</br>

这里涵盖了笔记，实例</br>

跟着启舰学习
