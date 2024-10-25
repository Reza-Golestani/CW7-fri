package service;

import database.Database;
import entity.User;

import java.util.Objects;


public class UserService {



    public void login (String username, String password) {

//        for (User checkingUser : Database.users)
        for (int i = 0; i < Database.users.size(); i++) {

            if(Objects.equals(Database.users.get(i).getUserName(), username) && Objects.equals(Database.users.get(i).getPassword(), password))
                Database.loggedInUser = Database.users.get(i);

        }

    }

    public void logout() {
        Database.loggedInUser = null;

    }

}
