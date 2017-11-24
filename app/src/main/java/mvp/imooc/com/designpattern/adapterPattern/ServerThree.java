package mvp.imooc.com.designpattern.adapterPattern;

/**
 * @author:candy
 * @date:2017/11/22 18:56
 * @邮箱:1601796593@qq.com
 */
public class ServerThree implements PlayerCount {

    @Override
    public String serverName() {
        return "三服";
    }
    @Override
    public int getPlayerCount() {
        return Utils.getOnlinePlayCount(3);
    }
}
