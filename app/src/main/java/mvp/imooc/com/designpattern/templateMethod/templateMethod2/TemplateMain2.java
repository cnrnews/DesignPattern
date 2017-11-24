package mvp.imooc.com.designpattern.templateMethod.templateMethod2;

/**
 * @author:candy
 * @date:2017/11/23 11:13
 * @邮箱:1601796593@qq.com
 */
public class TemplateMain2 {

    public static void execute()
    {
        new ITWorker("李洪亮").work();
        new HRWorker("ake").work();
        new QAWorker("kdoa").work();
        new PMWorker("dada").work();

    }
}
