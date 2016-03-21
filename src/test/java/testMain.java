
/**
 * Created by wangshunchu on 15/12/18.
 */

import com.alibaba.fastjson.JSON;
import com.bluewise.entitys.EmployeesEntity;
import com.bluewise.entitys.Systemdef;
import com.bluewise.services.BaIcd10Service;
import com.bluewise.services.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.bluewise.services.SystemdefService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import com.sun.javafx.tools.packager.Log;

/**
 * Created by xiang.li on 2015/2/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"file:web/WEB-INF/applicationContext.xml" , "file:WebRoot/WEB-INF/spring-servlet.xml" })
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class testMain {

    private static String UUID = "1";
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Resource
    private EmployeeService employeeService;

    @Resource
    private BaIcd10Service baIcd10Service;

    private static Logger logger = LoggerFactory.getLogger(testMain.class);
    @Resource
    private SystemdefService systemdefService;

    @Test
    public  void TestServices1()
    {
        for(Systemdef def :systemdefService.findAll())
        {
            System.out.println(def.getName());
        }
    }
    @Test
    public void testJdbc()
    {
        System.out.println("let's begin");
        System.out.println("let's begin again");
        jdbcTemplate.query("select * from sys_user", new RowCallbackHandler() {
            public void processRow(ResultSet resultSet) throws SQLException {
                System.out.println(resultSet.getString("name"));
            }
        });
        System.out.println("test end");
        //jdbcTemplate.batchUpdate()
    }


    @Test	// 查询所有
    public void testFindAllUser() {
        for(EmployeesEntity e : employeeService.findAll())
        {
            System.out.println(e.getFirstName());
            e.setFirstName(e.getFirstName()+"X");
            employeeService.save(e);
        }
//        System.out.println("下一个");
//        for(EmployeesEntity e :employeeService.findByFirstName("Steven"))
//        {
//            System.out.println(e.getFirstName());
//        }
//        System.out.println("下一个");
//        for(EmployeesEntity e :employeeService.findByFirstNameLike("%AA%"))
//        {
//            System.out.println(e.getFirstName());
//        }
//        System.out.println("下一个");
//        for(EmployeesEntity e :employeeService.findByFirstNameLike(new PageRequest(0,3)) ."A");
//        {
//            System.out.println(e.getFirstName());
//        }
    }

    /**
     * 对jpa与jdbcTemplate的事务与复杂的一些操作进行测试,看能否进行正确的操作?
     */
    @Test
    @Transactional
    public void TestJpa()
    {
        System.out.println("下一个");

        System.out.println(JSON.toJSON(employeeService.findByFirstNameLike("%AA%")));
        System.out.println("下一个");
        //测试Json对象的功能
        String s = JSON.toJSONString(employeeService.findAll(new PageRequest(0,10)));
        System.out.println(s);
//        JSON.toJavaObject(s,EmployeesEntity.getClass());

//        //   jdbcTemplate.batchUpdate()
////        PageRequest pageRequest = new PageRequest(360650,10,new Sort(Sort.Direction.DESC,"mc"));
//        PageRequest pageRequest = new PageRequest(360650,10);
//        Page<BaIcd10Entity> list = baIcd10Service.findAll(pageRequest);
//        System.out.println(JSON.toJSON(list));
//        System.out.println("查询结果：共"+list.getTotalElements()+"条数据，每页显示"+list.getSize()+"条，共"+list.getTotalPages()+"页，当前第"+(list.getNumber()+1)+"页！");
//        // 打印结果集的内容
//        System.out.println(list.getContent());


    }


//    /**
//     * 测试联合查询
//     */
//    @Test
//    public void test2() {
//        List<SysUser> users = userService.s .queryUserList();
//        logger.info(JSON.toJSONString(users));
//    }
}