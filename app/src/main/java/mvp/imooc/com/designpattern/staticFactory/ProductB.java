package mvp.imooc.com.designpattern.staticFactory;

import android.util.Log;

/**
 * @author:candy
 * @date:2017/11/22 18:18
 * @邮箱:1601796593@qq.com
 */
public class ProductB extends Product {
    @Override
    void create() {
        Log.i("TAG","create B");
    }
}
