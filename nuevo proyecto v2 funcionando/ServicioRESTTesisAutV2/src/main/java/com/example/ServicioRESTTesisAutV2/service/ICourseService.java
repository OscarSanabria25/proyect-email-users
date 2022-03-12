package com.example.ServicioRESTTesisAutV2.service;

import com.example.ServicioRESTTesisAutV2.Dto.UserDto;
import com.example.ServicioRESTTesisAutV2.model.User;

import java.util.List;

public interface ICourseService {
    public List<User> ListAllUsers();
    public  User saveUser(UserDto userDto);
    public  User findUserByid(int id);
    public  void deleteuser(int id);
}
