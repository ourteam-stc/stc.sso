package com.persist.sso.dao;

import com.persist.sso.bean.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findRoleByRoleNo(String RoleNo);

}
