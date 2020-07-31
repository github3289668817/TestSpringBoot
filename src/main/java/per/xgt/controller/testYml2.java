package per.xgt.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Valentino
 * @QQ: 3289668817
 * @Email：gentao.xiong
 * @CreateTime: 2020-07-31 14:09:41
 * @Descirption:
 */
@Controller
@ConfigurationProperties(prefix = "person1")
public class testYml2 {

    private String name;
    private Integer id;
    private Integer age;

    @RequestMapping("/person1")
    @ResponseBody
    public String test1(){
        return "name: "+name+",id:"+id+",age:"+age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
