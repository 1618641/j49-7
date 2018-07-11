package org.java.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 马果 on 2018/7/5.
 */
@Controller
public class FirstController {

    @RequestMapping("/load")
    public String load(HttpServletRequest req){
        req.setAttribute("msg","andy....");
        return "/ok";
    }
}
