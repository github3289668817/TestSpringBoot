package per.xgt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import per.xgt.dao.personMapper;
import per.xgt.entity.Person;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Valentino
 * @QQ: 3289668817
 * @Email：gentao.xiong
 * @CreateTime: 2020-07-31 14:42:13
 * @Descirption:
 */
@Controller
public class testController {

    @Resource
    private personMapper personMapper;

    @RequestMapping("/test")
    @ResponseBody
    public List<Person> test(){

        List<Person> persons = personMapper.findAllPerson();
        return persons;

    }

}
