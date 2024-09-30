package com.example.demo.mapper.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.mapper.dto.UserDTO;


@Mapper
public interface UserMapper {
	List<UserDTO> findAll();
}
