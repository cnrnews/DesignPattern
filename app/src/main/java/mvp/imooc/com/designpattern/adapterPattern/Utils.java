package mvp.imooc.com.designpattern.adapterPattern;

/**
 * @author:candy
 * @date:2017/11/23 08:46
 * @邮箱:1601796593@qq.com
 */
public class Utils {

    public static int getOnlinePlayCount(int flag) {
        int plaCount;
        switch (flag) {
            case 1:
                plaCount = 12;
                break;
            case 2:
                plaCount = 13;
                break;
            case 3:
                plaCount = 14;
                break;
            default:
                plaCount = -1;
                break;
        }
        return plaCount;
    }
}
