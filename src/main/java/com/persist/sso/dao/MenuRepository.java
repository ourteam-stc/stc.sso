package com.persist.sso.dao;

import com.persist.sso.bean.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Long> {
    Menu findByMenuNo(String menuNo);
}
