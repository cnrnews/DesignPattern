package mvp.imooc.com.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mvp.imooc.com.designpattern.abstractFactory.AbstratFactoryTest;
import mvp.imooc.com.designpattern.adapterPattern.adapterPattern2.AdapterTest;
import mvp.imooc.com.designpattern.assemblagePattern.StatisticsMain;
import mvp.imooc.com.designpattern.command.CommandTest;
import mvp.imooc.com.designpattern.garnishPattern.GarinishTest;
import mvp.imooc.com.designpattern.observerPattern.ObserverTest;
import mvp.imooc.com.designpattern.strategyPattern.strategyPattern2.StrategyPattern2Test;
import mvp.imooc.com.designpattern.templateMethod.templateMethod2.TemplateMain2;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.btn_adapter_pattern)
    Button mBtnAdapterPattern;
    @BindView(R.id.btn_assemblage_pattern)
    Button mBtnAssemblagePattern;
    @BindView(R.id.btn_strategy_pattern)
    Button mBtnStrategyPattern;
    @BindView(R.id.btn_template_pattern)
    Button mBtnTemplatePattern;
    @BindView(R.id.command_btn)
    Button mBtnCommandPattern;
    @BindView(R.id.btn_abstract_factory)
    Button mBtnAbstractFactory;
    @BindView(R.id.btn_garnish)
    Button mBtnGarnish;
    @BindView(R.id.btn_observer)
    Button mBtnObserver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_adapter_pattern, R.id.btn_assemblage_pattern, R.id.btn_strategy_pattern, R.id.btn_template_pattern,
            R.id.command_btn, R.id.btn_abstract_factory, R.id.btn_garnish, R.id.btn_observer})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            //适配器模式
            case R.id.btn_adapter_pattern:
//                AdapterMain.execute();
                AdapterTest.execute();
                break;
            //组合模式
            case R.id.btn_assemblage_pattern:
                StatisticsMain.execute();
                break;
            //策略模式
            case R.id.btn_strategy_pattern:
//                StrategyMain.execute();
                StrategyPattern2Test.execute();
                break;
            //模板
            case R.id.btn_template_pattern:
//                TemplateMain.execute();
                TemplateMain2.execute();
                break;
            //命令模式
            case R.id.command_btn:
                CommandTest.execute();
                break;
            //抽象工厂模式
            case R.id.btn_abstract_factory:
                AbstratFactoryTest.execute();
                break;
            //装饰着模式
            case R.id.btn_garnish:
                GarinishTest.execute();
                break;
            //观察者模式
            case R.id.btn_observer:
                ObserverTest.execute();
                break;
            default:
                break;
        }
    }
}
