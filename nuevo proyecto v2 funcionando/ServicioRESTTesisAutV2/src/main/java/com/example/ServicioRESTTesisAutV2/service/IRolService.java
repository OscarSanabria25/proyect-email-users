package com.example.ServicioRESTTesisAutV2.service;

import com.example.ServicioRESTTesisAutV2.Dto.UserDto;
import com.example.ServicioRESTTesisAutV2.model.Role;
import com.example.ServicioRESTTesisAutV2.model.User;

import java.util.List;

public interface IRolService {
    public List<Role> ListAllRoles();
    public  void saveRole(Role role);
    public  Role findRoleByid(int id);
    public  void deleteRole(int id);
}
