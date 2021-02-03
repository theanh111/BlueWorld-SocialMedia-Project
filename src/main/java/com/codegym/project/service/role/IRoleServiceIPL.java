package com.codegym.project.service.role;

import com.codegym.project.model.role.Role;
import com.codegym.project.repository.role.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IRoleServiceIPL implements IRoleService {
    @Autowired
    private IRoleRepository iRoleRepository;

    @Override
    public Role findRoleByName(String roleName) {
        return iRoleRepository.findRoleByRoleName(roleName);
    }

    @Override
    public Iterable<Role> findAll() {
        return iRoleRepository.findAll();
    }

    @Override
    public Role save(Role role) {
        return iRoleRepository.save(role);
    }

    @Override
    public Optional<Role> findById(Long id) {
        return findById(id);
    }

    @Override
    public void remove(Long id) {
        iRoleRepository.deleteById(id);
    }
}
