package mvp.imooc.com.designpattern.strategyPattern;

/**
 * @author:candy
 * @date:2017/11/23 10:30
 * @邮箱:1601796593@qq.com
 */
public class Strategy1 implements Strategy {
    @Override
    public String getSql(String[] names) {
        StringBuilder sql = new StringBuilder("select * from user_info where ");
        for (String user : names) {
            sql.append("username = '");
            sql.append(user);
            sql.append("' or ");
        }
        sql.delete(sql.length() - " or ".length(), sql.length());
        return sql.toString();
    }
}
