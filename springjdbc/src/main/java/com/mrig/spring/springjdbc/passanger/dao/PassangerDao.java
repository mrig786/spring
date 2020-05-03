package com.mrig.spring.springjdbc.passanger.dao;

import com.mrig.spring.springjdbc.passanger.dto.Passanger;

import java.util.List;

public interface PassangerDao {

    int insert(Passanger passanger);
    int update(Passanger passanger);
    int delete(int id);
    Passanger get(int id);
    List<Passanger> getAll(String type);
}
