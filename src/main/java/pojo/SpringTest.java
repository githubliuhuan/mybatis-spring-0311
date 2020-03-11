package pojo;

import com.test.mybatis.dao.EmployeeMapper;
import com.test.mybatis.pojo.Employee;
import com.test.mybatis.pojo.EmployeeExample;
import dao.DeptDAO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by liuhuan on 2020/3/11 10:20
 */
public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        EmployeeMapper mapper = applicationContext.getBean(EmployeeMapper.class);
        EmployeeExample employeeExample = new EmployeeExample();
        EmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andNameLike("李%");
        criteria.andDeptIdEqualTo(2);
        List<Employee> list = mapper.selectByExample(employeeExample);
        System.out.println(list.get(0).getName());
        /*DeptDAO deptDAO = applicationContext.getBean(DeptDAO.class);
        List<Dept> deptList = deptDAO.getDeptList();
        System.out.println(deptList);*/
    }
}
