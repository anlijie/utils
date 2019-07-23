package utils;

/**
 * @ClassName: NotBlank
 * @Description: java类作用描述:处理烦人的空指针异常
 * @Author: alj
 * @CreateDate: 2018/8/13 14:46
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/13 14:46
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class NotBlank {

    // 这个是判断对象是否为空
    static boolean checkNotBlank (Object obj) {
        return null != obj && !"".equals(obj) ? true : false;
    }

}
