package com.studio.actions.util;

import android.content.Context;
import android.view.View;

import com.studio.actions.DataContext;

public class DataContextUtils {

    public static DataContext getDataContext(View view) {
        Context context = view.getContext();
        if (context instanceof DataContext) {
            return (DataContext) context;
        }

        return new DataContext(context);
    }
}
