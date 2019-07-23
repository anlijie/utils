package utils;

/**
 * @ClassName: StringUtils
 * @Description: java类作用描述
 * @Author: alj
 * @CreateDate: 2018/8/16 17:06
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/16 17:06
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class StringUtils {

    private StringUtils() {
    }

    /**
     * <p>
     * 判断字符串是否为空
     * </p>
     *
     * @param cs 需要判断字符串
     * @return 判断结果
     */
    public static boolean isEmpty(final CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * <p>
     * 判断字符串是否不为空
     * </p>
     *
     * @param cs 需要判断字符串
     * @return 判断结果
     */
    public static boolean isNotEmpty(final CharSequence cs) {
        return !isEmpty(cs);
    }


}

