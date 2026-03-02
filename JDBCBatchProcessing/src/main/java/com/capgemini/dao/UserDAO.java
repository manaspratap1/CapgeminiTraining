package com.capgemini.dao;

import com.capgemini.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {

    public void insertBatch(List<User> users) throws SQLException;

    public void updateBatch(List<User> users) throws SQLException;

    public void deleteBatch(List<Integer> userIds) throws SQLException;

    public List<User> getAllUsers() throws SQLException;
}
