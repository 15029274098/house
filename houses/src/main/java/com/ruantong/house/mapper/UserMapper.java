package com.ruantong.house.mapper;

import com.ruantong.house.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

	 List<User>  selectUsers();
	
}
