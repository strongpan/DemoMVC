package demo.controller;

import demo.model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created at 221
 * 16-7-9 上午11:18.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private SqlSession sqlSession;

    @RequestMapping("create")
    private String create(User user) {
        sqlSession.insert("user.create", user);
        return "/index.jsp";
    }
}
