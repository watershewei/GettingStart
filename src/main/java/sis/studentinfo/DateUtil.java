package sis.studentinfo;

import java.util.*;

/**
 * Created by shewei on 17/9/20.
 */
public class DateUtil {

    public  static  Date createDate(int year, int month, int day){
        return new Date(year - 1900, month - 1, day);
    }
}
