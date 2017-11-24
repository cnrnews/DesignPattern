package mvp.imooc.com.designpattern.adapterPattern;

/**
 * @author:candy
 * @date:2017/11/22 18:56
 * @邮箱:1601796593@qq.com
 */
public class ServerOne implements PlayerCount {

    ServerFirst mServerFirst;

    public ServerOne() {
        mServerFirst=new ServerFirst();
    }

    @Override
    public String serverName() {
        return "一服";
    }
    @Override
    public int getPlayerCount() {
        return mServerFirst.getOnlinePlayCount();
    }
}
