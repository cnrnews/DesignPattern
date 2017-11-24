package mvp.imooc.com.designpattern.adapterPattern.adapterPattern2;

import android.util.Log;

/**
 * @author:candy
 * @date:2017/11/24 08:42
 * @邮箱:1601796593@qq.com
 */
public class V5Adapter implements V5Power {
    private  V220Power mV220Power;
    public V5Adapter(V220Power v220Power) {
        mV220Power=v220Power;
    }

    @Override
    public int providerV5Power() {
        Log.i("TAG","适配电压");
        return mV220Power.providerV220Power();
    }
}
