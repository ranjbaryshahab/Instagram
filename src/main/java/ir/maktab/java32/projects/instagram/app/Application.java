package ir.maktab.java32.projects.instagram.app;

import ir.maktab.java32.projects.instagram.features.accountmanagement.commands.*;
import ir.maktab.java32.projects.instagram.features.postmanagement.commands.*;
import ir.maktab.java32.projects.instagram.features.shared.commands.Command;
import ir.maktab.java32.projects.instagram.features.shared.service.AuthenticationService;
import ir.maktab.java32.projects.instagram.utils.Display;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner defaultMenu = new Scanner(System.in);
        Scanner myProfileMenu = new Scanner(System.in);
        Scanner postMenu = new Scanner(System.in);
        Scanner postsMenu = new Scanner(System.in);

        AccountManagement accountManagement = new AccountManagement();
        Command createCommand = new CreateAccountCommand(accountManagement);
        Command findByUsernameCommand = new FindByUsernameCommand(accountManagement);
        Command updateCommand = new UpdateAccountCommand(accountManagement);
        Command deleteCommand = new DeleteAccountCommand(accountManagement);
        Command followCommand = new FollowCommand(accountManagement);
        Command unFollowCommand = new UnFollowCommand(accountManagement);
        Command loginCommand = new LoginCommand(accountManagement);
        Command logoutCommand = new LogoutCommand(accountManagement);
        Command myFollowersCommand = new MyFollowersCommand(accountManagement);
        Command myFollowingsCommand = new MyFollowingsCommand(accountManagement);
        Command myPostsCommand = new MyPostsCommand(accountManagement);
        Command showAllPostsCommand = new ShowAllPostsCommand(accountManagement);

        AccountManagementMenuOptions accountMenu = new AccountManagementMenuOptions(
                createCommand, findByUsernameCommand, updateCommand, deleteCommand, followCommand, unFollowCommand, loginCommand, logoutCommand,
                myFollowersCommand, myFollowingsCommand, myPostsCommand,showAllPostsCommand
        );
        String command;

        PostManagement postManagement = new PostManagement();
        Command createPostCommand = new CreatePostCommand(postManagement);
        Command deletePostCommand = new DeletePostCommand(postManagement);
        Command updatePostCommand = new EditPostCommand(postManagement);
        Command likePostCommand = new LikePostCommand(postManagement);
        Command addCommentCommand = new AddCommentCommand(postManagement);
        Command getMostLikePost = new GetMostLikePostCommand(postManagement);

        PostManagementMenuOption postManagementMenuOption =
                new PostManagementMenuOption(addCommentCommand, createPostCommand,
                        updatePostCommand, deletePostCommand, likePostCommand, getMostLikePost);
        while (true) {
            if (AuthenticationService.getInstance().getLoginUser() == null) {
                Display.defaultMenu();
                command = defaultMenu.nextLine();
                switch (command) {
                    case "1" -> accountMenu.inputLogin();
                    case "2" -> accountMenu.inputCreate();
                }
            } else {
                Display.myMenu();
                command = defaultMenu.nextLine();
                switch (command) {
                    case "1" -> {
                        System.out.println(AuthenticationService.getInstance().getLoginUser());
                        Display.myProfileMenu();
                        command = myProfileMenu.nextLine();
                        switch (command) {
                            case "1" -> accountMenu.inputMyFollowers();
                            case "2" -> accountMenu.inputMyFollowings();
                            case "3" -> accountMenu.inputUpdate();
                            case "4" -> accountMenu.inputDelete();
                        }
                    }
                    case "2"->{
                        accountMenu.inputShowAllPosts();
                        Display.postMenu();
                        command = postsMenu.nextLine();
                        switch (command){
                            case "1"->postManagementMenuOption.inputLikePost();
                            case "2"->postManagementMenuOption.inputAddComment();
                        }
                    }
                    case "3" -> {
                        Display.myPostMenu();
                        command = postMenu.nextLine();
                        switch (command) {
                            case "1" -> accountMenu.inputMyPosts();
                            case "2" -> postManagementMenuOption.inputCreate();
                            case "3" -> postManagementMenuOption.inputUpdate();
                            case "4" -> postManagementMenuOption.inputDelete();
                            case "5" -> postManagementMenuOption.inputGetMostPost();
                        }
                    }
                    case "4" -> accountMenu.inputFindById();
                    case "5" -> accountMenu.inputFollow();
                    case "6" -> accountMenu.inputUnFollow();
                    case "7" -> accountMenu.inputLogout();
                }
            }
        }
    }
}
