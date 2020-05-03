package com.mrig.spring.springjdbc.passanger.dao.impl;

import com.mrig.spring.springjdbc.passanger.dao.PassangerDao;
import com.mrig.spring.springjdbc.passanger.dao.rowmapper.PasangerRowMapper;
import com.mrig.spring.springjdbc.passanger.dto.Passanger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("passangerDao")
public class PassangerDaoImpl implements PassangerDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Passanger passanger) {
        String sql= "insert into passanger values(?,?,?,?)";
        int res= jdbcTemplate.update(sql,passanger.getId(),passanger.getSource(),passanger.getDestination(),
                passanger.getType());
        return res;
    }

    @Override
    public int update(Passanger passanger) {
        String sql= "update passanger set id=? where source=? and destination=?";
        int res=jdbcTemplate.update(sql,passanger.getId(),passanger.getSource(),passanger.getDestination());
        return res;
    }

    @Override
    public int delete(int id) {
        String sql="delete from passanger where id=?";
        int res=jdbcTemplate.update(sql,id);
        return res;
    }

    @Override
    public Passanger get(int id) {
        String sql="select * from passanger where id=?";
        PasangerRowMapper pasangerRowMapper=new PasangerRowMapper();
        Passanger passanger= jdbcTemplate.queryForObject(sql,pasangerRowMapper,id);
        return passanger;
    }

    @Override
    public List<Passanger> getAll(String type) {
        String sql= "select * from passanger where type=?";
        PasangerRowMapper rowMapper=new PasangerRowMapper();
        List<Passanger> passangers=jdbcTemplate.query(sql,rowMapper,type);
        return passangers;
    }
}
