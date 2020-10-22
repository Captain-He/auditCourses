package com.entity;

public class User {
    String userID ;
    String userName ;
    String userPwd ;
    String userMajor ;
    int userGrade ;
    String userClass ;
    int userType ;

    public User(String userID, String userName, String userPwd, String userMajor, int userGrade, String userClass, int userType) {
        this.userID = userID;
        this.userName = userName;
        this.userPwd = userPwd;
        this.userMajor = userMajor;
        this.userGrade = userGrade;
        this.userClass = userClass;
        this.userType = userType;
    }

    public User() {
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserMajor() {
        return userMajor;
    }

    public void setUserMajor(String userMajor) {
        this.userMajor = userMajor;
    }

    public int getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(int userGrade) {
        this.userGrade = userGrade;
    }

    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }
}
