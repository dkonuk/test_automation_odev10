package org.example;
import org.example.User;

public class CreateUser {
    public static void main(String[] args) {
         User<String> user1 = new User<>();
    user1.setuserName("admin");
    user1.setpassword("12345");
    user1.settoken("ABCDEFGH");
    System.out.println("User Name for user1 is " + user1.getuserName()  +
                        " \nUser Password for user1 is "+ user1.getpassword() +
                        " \nUser Token for user1 is "+ user1.gettoken()
                        );

    User<Integer> user2 = new User<>();
    user2.setuserName(0001);
    user2.setpassword(12345);
    user2.settoken(12345);
    System.out.println("\nUser Name for user2 is " + user2.getuserName()  +
            " \nUser Password for user2 is "+ user2.getpassword() +
            " \nUser Token for user2 is "+ user2.gettoken()
    );
    }





    }


