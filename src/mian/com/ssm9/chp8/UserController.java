package mian.com.ssm9.chp8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @RequestMapping(value = "/selectUser")
    public String selectUser(HttpServletRequest request){
        String id=request.getParameter("id");
        System.out.println("id="+id);
        return "success";
    }
}
