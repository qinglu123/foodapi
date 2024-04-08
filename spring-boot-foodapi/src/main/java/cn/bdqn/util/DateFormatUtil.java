package cn.bdqn.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 格式化日期
 */
public class DateFormatUtil {
    public static String formatDateTime(Date date){
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddhhmmss");
        return format.format(date);
    }
    public static String formatDate(Date date){
        SimpleDateFormat format = new SimpleDateFormat("hhmmss");
        return format.format(date);
    }
}
