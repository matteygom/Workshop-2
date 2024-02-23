package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class MainDAO {
    public static void main(String[] args) {

        User user1 = new User();


        user1.setUserName("Michał");
        user1.setEmail("michel546@gmail.com");
        user1.setPassword("passalltime2");
        user1.setId(2);

        UserDao userDao1 = new UserDao();

        User[] tablica = userDao1.findAll();

        for (User user : tablica){

            System.out.println(user);
        }


//        UserDao userDao1 = new UserDao();
//
//        user1 = userDao1.read(1);
//
//        System.out.println(user1);
    }


}