package ir.maktab.java32.projects.instagram.app;

import ir.maktab.java32.projects.instagram.features.accountmanagement.commands.*;
import ir.maktab.java32.projects.instagram.features.shared.service.AuthenticationService;
import ir.maktab.java32.projects.instagram.utils.Display;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner defaultMenu = new Scanner(System.in);
        Scanner myProfileMenu = new Scanner(System.in);
        Scanner postMenu = new Scanner(System.in);

        AccountManagement accountManagement = new AccountManagement();
        Command createCommand = new CreateCommand(accountManagement);
        Command findByUsernameCommand = new FindByUsernameCommand(accountManagement);
        Command updateCommand = new UpdateCommand(accountManagement);
        Command deleteCommand = new DeleteCommand(accountManagement);
        Command followCommand = new FollowCommand(accountManagement);
        Command unFollowCommand = new UnFollowCommand(accountManagement);
        Command loginCommand = new LoginCommand(accountManagement);
        Command logoutCommand = new LogoutCommand(accountManagement);
        Command myFollowersCommand = new LogoutCommand(accountManagement);
        Command myFollowingsCommand = new LogoutCommand(accountManagement);
        Command myPostsCommand = new LogoutCommand(accountManagement);

        AccountManagementMenuOptions accountMenu = new AccountManagementMenuOptions(
                createCommand, findByUsernameCommand, updateCommand, deleteCommand, followCommand, unFollowCommand, loginCommand, logoutCommand,
                myFollowersCommand, myFollowingsCommand, myPostsCommand
        );
        String command;

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
                            case "5" -> System.out.println();
                        }
                    }
                    case "2" -> {
                        Display.myPostMenu();
                        command = postMenu.nextLine();
                        switch (command) {
                            case "1" -> Display.myPostMenu();
                            case "2" -> Display.myPostMenu();
                            case "3" -> Display.myPostMenu();
                            case "4" -> Display.myPostMenu();
                            case "5" -> Display.myPostMenu();
                            case "6" -> Display.myPostMenu();
                        }
                    }
                    case "3" -> accountMenu.inputFindById();
                    case "4" -> accountMenu.inputFollow();
                    case "5" -> accountMenu.inputUnFollow();
                    case "6" -> accountMenu.inputLogout();
                }
            }
        }
    }
}
