package am.picsart.lesson4.first_task.services;

import am.picsart.lesson4.first_task.model.Football;
import am.picsart.lesson4.first_task.model.Referee;
import am.picsart.lesson4.first_task.model.Team;

import java.util.List;
import java.util.Scanner;

public class MenuService {

    private final static Scanner S;

    static {
        S = new Scanner(System.in);
    }
    public static void getTitle() {
        System.out.println("welcome to football game");
        boolean isActive = true;
        while (isActive) {
            System.out.println("1. new game");
            System.out.println("2. show history");
            System.out.println("3. reset history");
            System.out.println("4. exit");
            int number = S.nextInt();
            switch (number) {
                case 1:
                    FileService.clearActionList();
                    startGame();
                    break;
                case 2:
                    showHistory();
                    break;
                case 3:
                    resetHistory();
                    break;
                case 4:
                    isActive = false;
                    System.out.println("good bye");
                    break;
                default:
                    System.out.println("Invalid button please choose again");
            }
        }
    }

    private static void resetHistory() {
        FileService.saveHistory("", false);
    }

    private static void showHistory() {
        FileService.showHistory();
    }

    private static void startGame() {
        System.out.println("...... Teams list ......");
        List<String> names = TeamFactory.getTeamsName();
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, names.get(i));
        }
        System.out.println("Please choose first team");
        int firstTeamIndex = S.nextInt();
        System.out.println("Please choose second team");
        int secondTeamIndex = S.nextInt();
        if (isValidNumberOfTeam(firstTeamIndex, secondTeamIndex)) {
            Team team1 = TeamFactory.getTeam(firstTeamIndex - 1);
            Team team2 = TeamFactory.getTeam(secondTeamIndex - 1);
            Referee referee = RefereeService.getRefereeEstrada();
            Football football = new Football(team1, team2, referee);
            FootballService footballService = new FootballService(football);
            footballService.play();
            String resultInfo = String.format("%s vs %s : %s : winner : %s", team1.getName(), team2.getName(), FootballService.getScore(football), FootballService.getWinner(football));
            processGameResult(resultInfo, football);
        } else {
            System.out.println("teams are same or incorrect team number, please choose team again");
            startGame();
        }
    }

    private static boolean isValidNumberOfTeam(int firstTeamIndex, int secondTeamIndex) {
        int size = TeamFactory.getTeamsCount();
        if (firstTeamIndex == secondTeamIndex) return false;
        if (firstTeamIndex > size || secondTeamIndex > size) return false;
        return firstTeamIndex >= 1 && secondTeamIndex >= 1;
    }

    private static void processGameResult(String resultInfo, Football football) {
        boolean isActive = true;
        System.out.println("........ process football result ..........");
        while (isActive) {
            System.out.println("1. show action");
            System.out.println("2. show result");
            System.out.println("3. show winner");
            System.out.println("4. save result");
            System.out.println("5. menu ");
            int number = S.nextInt();
            switch (number) {
                case 1:
                    showAction();
                    break;
                case 2:
                    showGameResult(football);
                    break;
                case 3:
                    showWinner(football);
                    break;
                case 4:
                    saveHistory(resultInfo);
                    break;
                case 5:
                    isActive = false;
                    break;
                default:
                    System.out.println("Invalid button please choose again");
            }
        }
    }

    private static void showGameResult(Football football) {
        System.out.println(FootballService.getScore(football));
    }

    private static void showWinner(Football football) {
        System.out.println(FootballService.getWinner(football));
    }

    private static void saveHistory(String resultInfo) {
        FileService.saveHistory(resultInfo, true);
    }

    private static void showAction() {
        FileService.showAction();
    }
}
