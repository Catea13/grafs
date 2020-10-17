package com.company;

import java.util.ArrayList;

public class Person {

        String name;



        ArrayList<String> friendList = new ArrayList<String>();
        public Person(String name) {
            this.name = name;
            // Add self in the list of friends
            friendList.add(this.name);
        }
        public void printFriendList() {
            System.out.println(friendList);
        }
        public void addFriends(com.company.Person... newFriends) {
            for (com.company.Person friend : newFriends) {
                addFriend(friend);
            }
        }
        private void addFriend(com.company.Person newFriend) {
            // Don't add new friend if they are already friends
            if (friendList.contains(newFriend.name)) {
                return;
            }
            // Add each friend in the friend list
            friendList.add(newFriend.name);
            newFriend.addFriend(this);
        }
    }


