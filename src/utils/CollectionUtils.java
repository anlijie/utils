package utils;

import java.util.Collection;

/**
 * <p>
 * Collection工具类
 * </p>
 *
 * @author alj
 * @Date 2017-09-19
 */
public class CollectionUtils {

    /**
     * <p>
     * 校验集合是否为空
     * </p>
     *
     * @param coll
     * @return boolean
     */
    public static boolean isEmpty(Collection<?> coll) {
        return (coll == null || coll.isEmpty());
    }

    /**
     * <p>
     * 校验集合是否不为空
     * </p>
     *
     * @param coll
     * @return boolean
     */
    public static boolean isNotEmpty(Collection<?> coll) {
        return !isEmpty(coll);
    }

}
