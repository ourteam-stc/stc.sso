package com.persist.sso.dao;

import com.persist.sso.bean.RelMenuRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelMenuRoleRepository extends JpaRepository<RelMenuRole,Long> {
    RelMenuRole findByRoleNo(String RoleNo);
}
