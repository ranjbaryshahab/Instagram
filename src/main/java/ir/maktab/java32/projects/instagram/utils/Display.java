package ir.maktab.java32.projects.instagram.utils;

public class Display {

    public static void defaultMenu() {
        System.out.println("""
                1)Sign In
                2)Sign Up
                """);
    }


    public static void myMenu() {
        System.out.println("""
                1)My Profile
                2)My Post
                3)Search Account
                4)Follow
                5)UnFollow
                6)Logout
                """);
    }

    public static void myProfileMenu() {
        System.out.println("""
                1)My Followers
                2)My Followings
                3)Update Account
                4)Delete Account
                5)Back
                """);
    }

    public static void myPostMenu() {
        System.out.println("""
                1)Show My Post
                2)Create New Post
                3)Update Post
                4)Delete Post
                5)Search Most Liked Post
                6)Back
                """);
    }

    public static void postMenu() {
        System.out.println("""
                1)Like Post
                1)Comment To Post
                2)Back
                """);
    }
}
