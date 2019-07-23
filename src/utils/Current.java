package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: Current
 * @Description: java类作用描述
 * @Author: alj
 * @CreateDate: 2018/8/14 20:42
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/14 20:42
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Current {

    // 这个是获取当时的时间
    public static String getCurrentTimeStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//dd/MM/yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        return strDate;
    }


}
