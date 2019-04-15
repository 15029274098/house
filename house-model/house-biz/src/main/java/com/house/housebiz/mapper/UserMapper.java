package com.house.housebiz.mapper;


import com.house.housecommon.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {

	public  List<User> selectUsers();
	
}
