package mvp.imooc.com.designpattern.strategyPattern;

/**
 * @author:candy
 * @date:2017/11/23 10:30
 * @邮箱:1601796593@qq.com
 */
public class Strategy2 implements Strategy {
    @Override
    public String getSql(String[] names) {
        StringBuilder sql = new StringBuilder("select * from user_info where ");
        boolean needOr = false;
        for (String user : names) {
            if (needOr) {
                sql.append(" or ");
            }
            sql.append("username = '");
            sql.append(user);
            sql.append("'");
            needOr = true;
        }
        return sql.toString();
    }
}
