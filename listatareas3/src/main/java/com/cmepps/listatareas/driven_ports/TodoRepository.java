package com.cmepps.listatareas.driven_ports;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cmepps.listatareas.entity.Todo;

public interface TodoRepository extends JpaRepository < Todo, Long > {
    List < Todo > findByUserName(String user);
}