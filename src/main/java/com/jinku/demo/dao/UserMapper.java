package com.jinku.demo.dao;

import com.jinku.demo.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    @Select("SELECT * FROM user_info WHERE phone = #{phone}")
    UserInfo findByPhone(@Param("phone") String phone);
}
