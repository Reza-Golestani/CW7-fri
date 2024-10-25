package entity;

import java.util.Arrays;

public class UserList {

        private User[] users;
        private int index;

        public UserList() {
            this.users = new User[10];
            this.index = 0;
        }

        public void add(User u) {
            users[index] = u;
            index++;

            if (index >= users.length)
                users = Arrays.copyOf(users, users.length * 2);
        }

        public void remove(User u) {
            Integer foundIndex = findByNationalCode(u.getNationalCode());
            if (foundIndex != null) {
                users[foundIndex] = null;
                for (int i = foundIndex; i < index - 1; i++) {
                    users[i] = users[i + 1];
                }
                index--;
                users[index] = null;
            }
        }

        public User get(int index) {
            return users[index];
        }

        public void set(User u, int j) {
            for (int i = index; i > j; i--)
                users[i] = users[i - 1];
            users[j] = u;
            index++;
        }

        public int size() {
            return index;
        }

        public void clear() {
            users = new User[10];
            index = 0;
        }

        public boolean isEmpty() {
            return index == 0;
        }

        private Integer findByNationalCode(String nationalCode) {
            for (int i = 0; i < users.length; i++)
                if (users[i].getNationalCode().equals(nationalCode))
                    return i;

            return null;
        }
    }

