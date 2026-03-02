package com.capgemini.dao;

import com.capgemini.entity.User;
import com.capgemini.repository.UserRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO{
    public void insertBatch(List<User> users) throws SQLException {

        Connection conn = UserRepository.getConnection();

        String insertQuery = "INSERT INTO users(name, email) VALUES(?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(insertQuery);

        for(User u: users){
            pstmt.setString(1, u.getName());
            pstmt.setString(2, u.getEmail());
            pstmt.addBatch();
        }

        int[] result = pstmt.executeBatch();
        System.out.println("Inserted Rows "+ result.length);
        conn.close();
    }

    public void updateBatch(List<User> users) throws SQLException{
        Connection conn = UserRepository.getConnection();

        String updateQuery = "UPDATE users SET name=?, email=? where id=?";
        PreparedStatement pstmt = conn.prepareStatement(updateQuery);

        for(User u: users){
            pstmt.setString(1, u.getName());
            pstmt.setString(2, u.getEmail());
            pstmt.setInt(3, u.getId());
            pstmt.addBatch();
        }

        int[] result = pstmt.executeBatch();
        System.out.println("Updated Rows "+ result.length);
        conn.close();
    }

    public void deleteBatch(List<Integer> userIds) throws SQLException{

        Connection conn = UserRepository.getConnection();

        String deleteQuery = "DELETE FROM users WHERE id=?";

        PreparedStatement pstmt = conn.prepareStatement(deleteQuery);

        for(int id: userIds){
            pstmt.setInt(1, id);
            pstmt.addBatch();
        }

        int[] result = pstmt.executeBatch();
        System.out.println("Deleted Rows "+ result.length);
        conn.close();
    }

    @Override
    public List<User> getAllUsers() {

        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";

        try (Connection conn = UserRepository.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                User user = new User(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email")
                );
                users.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;
    }
}
