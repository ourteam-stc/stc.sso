package com.persist.sso.dao;

import com.persist.sso.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findUserByUsername(String username);
    User findUserByUserNo(String userNo);
}
