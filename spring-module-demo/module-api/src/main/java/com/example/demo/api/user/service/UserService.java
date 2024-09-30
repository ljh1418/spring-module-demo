package com.example.demo.api.user.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import com.example.demo.api.user.vo.UserVO;
import com.example.demo.mapper.dto.UserDTO;
import com.example.demo.mapper.mapper.UserMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;
    private final ModelMapper modelMapper;

    public List<UserVO> findAll() {
        List<UserDTO> list = userMapper.findAll();
        log.info(list.toString());
        //모델맵으로 결과를 dto To Vo로 컨버전
        return modelMapper.map(list, new TypeToken<List<UserVO>>(){}.getType());
    }
}
