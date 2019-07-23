package utils;

/**
 * @ClassName: MapUtils
 * @Description: java类作用描述
 * @Author: alj
 * @CreateDate: 2018/8/16 17:32
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/16 17:32
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

import java.util.Map;
public class MapUtils {

    /**
     * 判断Map是否为空
     *
     * @param map
     * @return
     */
    public static boolean isEmpty(Map<?, ?> map) {
        return (map == null || map.isEmpty());
    }

    /**
     * 判断Map是否不为空
     *
     * @param map
     * @return
     */
    public static boolean isNotEmpty(Map<?, ?> map) {
        return !isEmpty(map);
    }

}

