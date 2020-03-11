package dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import pojo.Dept;

import java.util.List;

/**
 * Created by liuhuan on 2020/3/11 10:26
 */
public class DeptDaoImpl extends SqlSessionDaoSupport implements DeptDAO {
    public List<Dept> getDeptList() {
        System.out.println("DeptDaoImpl.getDeptList");
        return super.getSqlSession().selectList("dao.DeptDAO.getDeptList");
    }
}
