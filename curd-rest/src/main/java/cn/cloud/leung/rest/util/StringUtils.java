package cn.cloud.leung.rest.util;

/**
 * Created by liang.q on 2017/7/5.
 */
public class StringUtils {
    private StringUtils() {
    }

    public static boolean isEmpty(String str) {
        return null == str || "".equals(str.trim());
    }

    public static String splitRight(String str) {
        return split(str, "\\.", 1);
    }

    public static String split(String str, String regex, int index) {
        String[] strs = str.split(regex);
        return strs.length > index ? strs[1] : str;
    }

}
