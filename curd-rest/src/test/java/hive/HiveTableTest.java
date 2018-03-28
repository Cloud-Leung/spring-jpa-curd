package hive;

import cn.cloud.leung.rest.Application;
import cn.cloud.leung.rest.model.HiveTable;
import cn.cloud.leung.rest.model.TableStrucDto;
import cn.cloud.leung.rest.service.HiveTableService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liang.q on 2018/3/28.
 */
@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@WebAppConfiguration // 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
//@Ignore
public class HiveTableTest {

    @Resource
    private HiveTableService hiveTableService ;

    @Test
    public void testFindOne(){
        HiveTable table = hiveTableService.findOne("2c9180825f6cca3c015f6cca3eb50012");
        System.out.println(table.toString());
    }

    @Test
    public void testFindDto(){
        List<TableStrucDto> table = hiveTableService.queryDto("2c9180825f6cca3c015f6cca3eb50012");
        System.out.println(table.toString());
    }

}
