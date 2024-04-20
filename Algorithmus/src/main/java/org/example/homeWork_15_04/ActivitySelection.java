package org.example.homeWork_15_04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {
    public void selectActivity(List<Activity> list) {
        list.sort(Comparator.comparingInt(Activity::getFinish)
                .thenComparing((Activity a, Activity b) -> b.getSum() - a.getSum()));
        List<Activity> result = new ArrayList<>();
        int lastFinish = 0;

        for (Activity activity : list) {
            if (activity.start >= lastFinish) {
                result.add(activity);
                lastFinish = activity.finish;
            }
        }
        print(result);
    }

    private void print(List<Activity> list) {
        for (Activity activity : list) {
            System.out.println(activity.name + " " + activity.start + "->" + activity.finish + " (" + activity.sum + ")");
        }
    }
}
