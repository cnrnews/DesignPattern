package mvp.imooc.com.designpattern.command;

/**
 * @author:candy
 * @date:2017/11/24 09:07
 * @邮箱:1601796593@qq.com
 */
public class LightOnCommand implements Command {
    private Light mLight;
    public LightOnCommand(Light light) {
        mLight=light;
    }
    @Override
    public void execute() {
        mLight.on();
    }
}
