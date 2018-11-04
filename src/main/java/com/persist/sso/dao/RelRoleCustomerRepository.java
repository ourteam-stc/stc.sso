package com.persist.sso.dao;

import com.persist.sso.bean.RelRoleCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelRoleCustomerRepository extends JpaRepository<RelRoleCustomerRepository,Long> {
    RelRoleCustomer findByRoleNo(String roleNo);
    RelRoleCustomer findByReleNo(String releNo);
}
