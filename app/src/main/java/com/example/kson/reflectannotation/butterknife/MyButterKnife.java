package com.example.kson.reflectannotation.butterknife;

import android.app.Activity;
import android.view.View;

import com.example.kson.reflectannotation.MainActivity;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/08/30
 * Description:
 */
public class MyButterKnife {

    /**
     * 初始化绑定控件逻辑
     * @param activity
     */
    public static void bind(Activity activity){
        setContentView(activity);

        bindView(activity);


    }

    /**
     * 绑定根布局
     * @param activity
     */
    private static void setContentView(Activity activity) {
        Class<? extends Activity> c = activity.getClass();
        try {
            Method method = c.getMethod("setContentView", int.class);
            ContentView contentView = c.getAnnotation(ContentView.class);
            if (contentView!=null){
                method.invoke(activity,contentView.value());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 绑定的view的逻辑,使用反射机制（对类的属性进行查询和修改，对类的方法进行调用）
     * @param activity
     */
    private static void bindView(Activity activity) {

        Class<? extends Activity> c = activity.getClass();
//        Class<MainActivity>

        Field[] fields = c.getDeclaredFields();
        if (fields!=null&&fields.length>0){
            for (Field field : fields) {
                field.setAccessible(true);//让属性，方法，构造函数等等可见，public，允许访问

                try {
                    MyBindView myBindView = field.getAnnotation(MyBindView.class);
                    if (myBindView!=null){
                        View view = activity.findViewById(myBindView.value());
                        field.set(activity,view);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
        }


    }


}
