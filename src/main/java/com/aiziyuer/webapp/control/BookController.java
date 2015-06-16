package com.aiziyuer.webapp.control;

import com.aiziyuer.webapp.book.Book;
import com.aiziyuer.webapp.book.BookService;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

/**
 * 测试
 */
@Results(@Result(name = "success"
        , type = "redirectAction"
        , params = {"actionName", "book"}))
public class BookController extends BaseController<Book>{

    // 封装 id 请求参数的属性
    private int id;

    // 定义业务逻辑组件
    private BookService bookService = new BookService();

    // 获取 id 请求参数的方法
    @Override
    public void setId(int id) {
        this.id = id;
        // 取得方法时顺带初始化 model 对象
        if (id > 0) {
            data= bookService.get(id);
        }
    }

    @Override
    public int getId() {
        return this.id;
    }

    // 处理不带 id 参数的 GET 请求
    // 进入首页
    @Override
    public HttpHeaders index() {
        dataList = bookService.getAll();
        return new DefaultHttpHeaders("index")
                .disableCaching();
    }

    // 处理不带 id 参数的 GET 请求
    // 进入添加新图书。
    @Override
    public String editNew() {
        // 创建一个新图书
        data = new Book();
        return "editNew";
    }

    // 处理不带 id 参数的 POST 请求
    // 保存新图书
    @Override
    public HttpHeaders create() {
        // 保存图书
        bookService.saveOrUpdate(data);
        addActionMessage("添加图书成功");
        return new DefaultHttpHeaders("success")
                .setLocationId(data.getId());
    }

    // 处理带 id 参数的 GET 请求
    // 显示指定图书
    @Override
    public HttpHeaders show() {
        return new DefaultHttpHeaders("show");
    }

    // 处理带 id 参数、且指定操作 edit 资源的 GET 请求
    // 进入编辑页面 (book-edit.jsp)
    @Override
    public String edit() {
        return "edit";
    }

    // 处理带 id 参数的 PUT 请求
    // 修改图书
    @Override
    public String update() {
        bookService.saveOrUpdate(data);
        addActionMessage("图书编辑成功！");
        return "success";
    }

    // 处理带 id 参数，且指定操作 deleteConfirm 资源的方法
    // 进入删除页面 (book-deleteConfirm.jsp)
    public String deleteConfirm() {
        return "deleteConfirm";
    }

    // 处理带 id 参数的 DELETE 请求
    // 删除图书
    @Override
    public String destroy() {
        bookService.remove(id);
        addActionMessage("成功删除 ID 为" + id + "的图书！");
        return "success";
    }

}
