package demo.controller;

import demo.model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created at 221
 * 16-7-9 上午11:18.
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController {

    @Autowired
    private SqlSession sqlSession;

    @RequestMapping("create")
    private String create(User user) {
        sqlSession.insert("user.create", user);
        return "redirect:/index.jsp";
    }

    @RequestMapping("login")
    private String login(User user) {
        List<User> users = sqlSession.selectList("user.login", user);
        if (users.size() > 0) {
            session.setAttribute("user", users.get(0));
            return "redirect:/home.jsp";
        } else {
            request.setAttribute("message", "invalid username or password.");
            return "index";
        }
    }

    @RequestMapping("logout")
    private String logout() {
        session.invalidate();
        return "redirect:/index.jsp";
    }
}
