package practise.yeh.com.practice.util;

import android.util.Log;

import practise.yeh.com.practice.BuildConfig;

/**
 * Created by bestv-developer on 16/9/4.
 *
 * @author bing
 * @time 16/9/4 下午4:56
 * @des ${flag for printf}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes
 */
public class LogUtil {

    public static void d(String tag, String msg) {
        if (!BuildConfig.DEBUG)
            Log.d(tag, msg);
    }

    public static void d(String tag, String msg, Throwable tr) {
        if (!BuildConfig.DEBUG)
            Log.d(tag, msg, tr);
    }

    public static void i(String tag, String msg) {
        if (!BuildConfig.DEBUG)
            Log.i(tag, msg);
    }

    public static void i(String tag, String msg, Throwable tr) {
        if (!BuildConfig.DEBUG)
            Log.i(tag, msg, tr);
    }

    public static void w(String tag, String msg) {
        if (!BuildConfig.DEBUG)
            Log.w(tag, msg);
    }

    public static void w(String tag, String msg, Throwable tr) {
        if (!BuildConfig.DEBUG)
            Log.w(tag, msg, tr);
    }

    public static void v(String tag, String msg) {
        if (!BuildConfig.DEBUG)
            Log.v(tag, msg);
    }

    public static void v(String tag, String msg, Throwable tr) {
        if (!BuildConfig.DEBUG)
            Log.v(tag, msg, tr);
    }

    public static void e(String tag, String msg) {
        if (!BuildConfig.DEBUG)
            Log.e(tag, msg);
    }

    public static void e(String tag, String msg, Throwable tr) {
        if (!BuildConfig.DEBUG)
            Log.e(tag, msg, tr);
    }
}
