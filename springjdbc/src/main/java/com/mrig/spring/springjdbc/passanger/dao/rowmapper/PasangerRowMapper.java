package com.mrig.spring.springjdbc.passanger.dao.rowmapper;

import com.mrig.spring.springjdbc.passanger.dto.Passanger;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PasangerRowMapper implements RowMapper<Passanger> {
    @Override
    public Passanger mapRow(ResultSet resultSet, int i) throws SQLException {
        Passanger passanger=new Passanger();
        passanger.setId(resultSet.getInt(1));
        passanger.setSource(resultSet.getString(2));
        passanger.setDestination(resultSet.getString(3));
        passanger.setType(resultSet.getString(4));
        return passanger;
    }
}
