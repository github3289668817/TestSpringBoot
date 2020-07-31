package per.xgt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Valentino
 * @QQ: 3289668817
 * @Email：gentao.xiong
 * @CreateTime: 2020-07-31 14:04:11
 * @Descirption:
 */
@Controller
public class testYml {
    @Value("${person1.name}")
    private String name;

    @RequestMapping("/test")
    @ResponseBody
    public String test1(){
        System.out.println(name);
        return "name: "+name;
    }

}
