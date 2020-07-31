package per.xgt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import per.xgt.dao.personMapper;
import per.xgt.entity.Person;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Valentino
 * @QQ: 3289668817
 * @Email：gentao.xiong
 * @CreateTime: 2020-07-31 14:51:46
 * @Descirption:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootSsmApplication.class)
public class ssmtest {

    @Resource
    private personMapper personMapper;

    @Test
    public void test(){
        List<Person> persons = personMapper.findAllPerson();
        for (Person person : persons) {
            System.out.println(person);
        }
    }


}
