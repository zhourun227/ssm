package mian.com.ssm7.chp6.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest,
                                      HttpServletResponse httpServletResponse) throws Exception {
        //创建ModelAndView对象
        ModelAndView mav=new ModelAndView();
        //向模型对象中添加数据
        mav.addObject("msg","这是我第一个spring mvc程序");
        mav.setViewName("/WEB-INF/jsp/first.jsp");
        return mav;
    }
}
