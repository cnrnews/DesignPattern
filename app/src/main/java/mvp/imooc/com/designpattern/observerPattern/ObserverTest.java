package mvp.imooc.com.designpattern.observerPattern;

/**
 * @author:candy
 * @date:2017/11/24 11:16
 * @邮箱:1601796593@qq.com
 */
public class ObserverTest {

    public static void execute()
    {

        //主题
        SubjectFor3D subjectFor3D=new SubjectFor3D();

        //客户
        Observer1 observer1=new Observer1(subjectFor3D);
        Observer2 observer2=new Observer2(subjectFor3D);

        subjectFor3D.setMsg("13094023joefjo");
        subjectFor3D.setMsg("23094023joefjo");
    }
}
