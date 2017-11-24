package mvp.imooc.com.designpattern.assemblagePattern;

import android.util.Log;

/**
 * 组合模式
 * 将对象组合成树形结构以表示“部分-整体”的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
 * @author:candy
 * @date:2017/11/23 10:13
 * @邮箱:1601796593@qq.com
 */
public class StatisticsMain {

    public static void execute()
    {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder
                .append("小说:")
                .append("阅读:").append(new NovalStatistics().getBrowerCount()).append("/n")
                .append("销售:").append(new NovalStatistics().getSaleCount()).append("/n");
        Log.i("TAG",stringBuilder.toString());


        stringBuilder.delete(0,stringBuilder.toString().length());


        stringBuilder
                .append("科技:")
                .append("阅读:").append(new TechinicalStatistics().getBrowerCount()).append("/n")
                .append("销售:").append(new TechinicalStatistics().getSaleCount()).append("/n");
        Log.i("TAG",stringBuilder.toString());

        stringBuilder.delete(0,stringBuilder.toString().length());


        stringBuilder
                .append("所有:")
                .append("阅读:").append(new AllStatistics().getBrowerCount()).append("/n")
                .append("销售:").append(new AllStatistics().getSaleCount()).append("/n");
        Log.i("TAG",stringBuilder.toString());


    }
}
