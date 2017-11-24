package mvp.imooc.com.designpattern.strategyPattern;

import android.util.Log;

/**
 * @author:candy
 * @date:2017/11/23 10:32
 * @邮箱:1601796593@qq.com
 */
public class QueryUtils {

    public static void querySql(String[]names,Strategy strategy){
        Log.i("TAG",strategy.getSql(names));
    }
}
