package mvp.imooc.com.designpattern.assemblagePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 电脑
 * @author:candy
 * @date:2017/11/23 10:02
 * @邮箱:1601796593@qq.com
 */
public class ComputerStatistics implements Statistics {
    @Override
    public int getBrowerCount() {
        int browerCount=0;
        List<String>novals= getAllComputerBoooks();
        for (String noval : novals) {
            browerCount+=getBrowerCount(noval);
        }
        return browerCount;
    }
    @Override
    public int getSaleCount() {
        int saleCount=0;
        List<String>novals= getAllComputerBoooks();
        for (String noval : novals) {
            saleCount+=getSaleCount(noval);
        }
        return saleCount;
    }
    public List<String> getAllComputerBoooks()
    {
        List<String>novals=new ArrayList<>();
        novals.add("电脑1");
        novals.add("电脑2");
        return novals;
    }

    public int getBrowerCount(String novalName){
        return 32;
    }
    public int getSaleCount(String novalName){
        return 42;
    }
}
