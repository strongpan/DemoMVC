package demo.controller;

import demo.model.Book;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created at 221
 * 16-7-10 上午10:48.
 */
@Controller
@RequestMapping("book")
public class BookController extends BaseController {

    @Autowired
    private SqlSession sqlSession;

    @RequestMapping("create")
    private String create(Book book) {
        sqlSession.insert("book.create", book);
        return "redirect:/book/queryAll";
    }

    @RequestMapping("queryAll")
    private String queryAll() {
        List<Book> books = sqlSession.selectList("book.queryAll");
        session.setAttribute("books", books);
        return "redirect:/home.jsp";
    }

    @RequestMapping("queryOne/{id}")
    private String queryOne(@PathVariable int id) {
        Book book = sqlSession.selectOne("book.queryOne", id);
        session.setAttribute("book", book);
        return "redirect:/edit.jsp";
    }

    @RequestMapping("update")
    private String update(Book book) {
        sqlSession.update("book.update", book);
        return "redirect:/book/queryAll";
    }

    @RequestMapping("remove/{id}")
    private String delete(@PathVariable int id) {
        sqlSession.update("book.remove", id);
        return "redirect:/book/queryAll";
    }


}
