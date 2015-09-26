package com.techlink.helpers;

import android.app.Activity;

/**
 * Created by Viswanathan Palani (techlink solutions - www.tlinksolutions.com) on 26/09/2015.
 */
public class CommonHelper {

    public static final String Space  = " ";
    public static String getStringResourceByName(String aString, String packageName, String resoruceName, Activity activity) {
        try{

            String stringFormat = aString + "_display" ;
            int resId = activity.getResources().getIdentifier(stringFormat, resoruceName, packageName);
            return activity.getString(resId);

        }catch(Exception e){
            return "Resource Not Available";
        }
    }
}
