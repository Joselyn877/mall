package com.jojo.mapper;

import com.jojo.util.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from man where id = #{id}")
    List<User> selectById(Integer id);

}
