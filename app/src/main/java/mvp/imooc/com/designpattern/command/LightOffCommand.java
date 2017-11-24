package mvp.imooc.com.designpattern.command;

/**
 * @author:candy
 * @date:2017/11/24 09:07
 * @邮箱:1601796593@qq.com
 */
public class LightOffCommand implements Command {
    private Light mLight;
    public LightOffCommand(Light light) {
        mLight=light;
    }
    @Override
    public void execute() {
        mLight.off();
    }
}
