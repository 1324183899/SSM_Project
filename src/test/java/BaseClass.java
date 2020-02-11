import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Vitamin L(贾渊博)
 * @date 2020/2/10 21:21
 * 预测未来最好的方法就是去创造未来
 */
//基类，配置spring和junit整合，junit启动时加载springIOC容器
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/application.xml"})
//注意:此类的功能是加载spring和mybatis配置文件,请不要对此类进行操作。
//所有测试类均需继承该类才可进行单元测试
public class BaseClass {
}
