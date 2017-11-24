package mvp.imooc.com.designpattern.adapterPattern;

/**
 * @author:candy
 * @date:2017/11/23 08:49
 * @邮箱:1601796593@qq.com
 */
public class XmlBuild {
    public static String xmlBuild(PlayerCount playerCount)
    {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("<root>");
        stringBuilder.append("<serverName>").append(playerCount.serverName()).append("</serverName>");
        stringBuilder.append("<playCount>").append(playerCount.getPlayerCount()).append("</playCount>");
        stringBuilder.append("</root>");
        return  stringBuilder.toString();
    }
}
