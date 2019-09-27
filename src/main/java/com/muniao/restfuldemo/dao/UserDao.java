package com.muniao.restfuldemo.dao;

import com.muniao.restfuldemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long>
{
    List<User> findUserByNameContaining(@Param("name") String name);

    @RestResource(rel = "byName",path = "byName")
    List<User> findUserByNameStartingWith(@Param("name") String name);
}
