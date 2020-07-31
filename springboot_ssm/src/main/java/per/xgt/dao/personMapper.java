package per.xgt.dao;

import org.apache.ibatis.annotations.Mapper;
import per.xgt.entity.Person;

import java.util.List;

/**
 * @Author: Valentino
 * @QQ: 3289668817
 * @Email：gentao.xiong
 * @CreateTime: 2020-07-31 14:32:25
 * @Descirption:
 */
@Mapper
public interface personMapper {

    List<Person> findAllPerson();

}
