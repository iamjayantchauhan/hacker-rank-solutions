package com.hackerrank.solutions.Others;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/*
* Hacker Rank solution for...
*
* https://www.hackerrank.com/challenges/ctci-comparator-sorting/problem?h_l=interview&playlist_slugs%5B%5D=virtusa
* */
class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {
        int nameCompare = a.name.compareTo(b.name);

        // Change a -> b or b -> a to change sorting order
        int scoreCompare = b.score - a.score;

        if (scoreCompare == 0) {
            return nameCompare == 0 ? scoreCompare : nameCompare;
        }
        return scoreCompare;
    }
}


class PlayerComparison {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
