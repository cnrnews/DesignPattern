package mvp.imooc.com.designpattern.assemblagePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 小说
 * @author:candy
 * @date:2017/11/23 10:02
 * @邮箱:1601796593@qq.com
 */
public class NovalStatistics implements Statistics {
    @Override
    public int getBrowerCount() {
        int browerCount=0;
        List<String>novals=getAllNovals();
        for (String noval : novals) {
            browerCount+=getBrowerCount(noval);
        }
        return browerCount;
    }
    @Override
    public int getSaleCount() {
        int saleCount=0;
        List<String>novals=getAllNovals();
        for (String noval : novals) {
            saleCount+=getSaleCount(noval);
        }
        return saleCount;
    }
    public List<String>getAllNovals()
    {
        List<String>novals=new ArrayList<>();
        novals.add("小说1");
        novals.add("小说2");
        return novals;
    }

    public int getBrowerCount(String novalName){
        return 12;
    }
    public int getSaleCount(String novalName){
        return 32;
    }
}
