package com.lege.android.base.ui;

import android.app.Activity;
import androidx.annotation.Nullable;


import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Created by loctek on 2020/6/18.
 */
public class BaseActivityCollector implements IActivityCollector {
    private List<Activity> activities = new ArrayList<>();
    private static BaseActivityCollector collector = new BaseActivityCollector();

    public static BaseActivityCollector getInstance() {
        return collector;
    }

    public List<Activity> getActivities(){
        return activities;
    }

    public void addActivity(Activity activity){
        activities.add(activity);
    }
    public void removeActivity(Activity activity){
        activities.remove(activity);
    }
    @Override
    @Nullable
    public Activity getTop() {
        if(activities.isEmpty()){
            return null;
        }
        return activities.get(activities.size()-1);
    }

    @Override
    public boolean isActivityExist(Activity activity) {
        return activities.contains(activity);
    }

    @Override
    public Activity findActivityBySimpleName(String name) {
        Activity aty = null;
        for (int i = 0; i < activities.size(); i++) {
            aty = activities.get(i);
            if (name.equals(aty.getClass().getSimpleName())) {
                return aty;
            }
        }

        return null;
    }

    @Override
    public void finishActivityExcept(String name) {
        Activity aty = null;
        for (int i = 0; i < activities.size(); i++) {
            aty = activities.get(i);
            if (!name.equals(aty.getClass().getSimpleName())) {
                aty.finish();
            }
        }
    }

    @Override
    public void finishActivity(String name) {
        Activity aty = null;
        for (int i = 0; i < activities.size(); i++) {
            aty = activities.get(i);
            if (name.equals(aty.getClass().getSimpleName())) {
                aty.finish();
            }
        }
    }
}
