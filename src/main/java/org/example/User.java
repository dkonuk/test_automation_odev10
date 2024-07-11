package org.example;

public class User<T> {
    private T userName;
    private T password;
    private T token;

    public void setuserName(T userName) {
        this.userName = userName;
    }
    public void setpassword(T password) {
        this.password = password;
    }
    public void settoken(T token) {
        this.token = token;
    }
    public T getuserName() {
        return userName;
    }
    public T getpassword() {
        return password;
    }
    public T gettoken() {
        return token;
    }


}


