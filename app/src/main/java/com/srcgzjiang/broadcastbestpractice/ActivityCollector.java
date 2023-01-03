package com.srcgzjiang.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollector {

    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static void finishAll(){
        //这个是全部删除
        for(Activity activity : activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }


}
