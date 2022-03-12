package com.example.ServicioRESTTesisAutV2.service;

import com.example.ServicioRESTTesisAutV2.Dto.UserDto;
import com.example.ServicioRESTTesisAutV2.model.Role;
import com.example.ServicioRESTTesisAutV2.model.User;
import com.example.ServicioRESTTesisAutV2.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements IRolService{

    @Autowired
    RolRepository rolRepository;

    @Override
    public List<Role> ListAllRoles() {
        return rolRepository.findAll();
    }

    @Override
    public void saveRole(Role role) {
        rolRepository.save(role);
    }

    @Override
    public Role findRoleByid(int id) {
        return rolRepository.findById(id).get();
    }

    @Override
    public void deleteRole(int id) {
rolRepository.deleteById(id);
    }
}
