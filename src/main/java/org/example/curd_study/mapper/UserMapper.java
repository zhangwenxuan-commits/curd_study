package org.example.curd_study.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.curd_study.entity.User;

@Mapper
public interface UserMapper {
    int insert(User user);
    User selectById(Long id);
    int update(User user);
    int deleteById(Long id);
}
