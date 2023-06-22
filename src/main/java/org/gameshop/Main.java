package org.gameshop;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GameType type1 = new GameType(1,"Куклы");
        GameType type2 = new GameType(2,"Конструкторы");
        GameType type3 = new GameType(3,"Машинки");
        GameType type4 = new GameType(4,"Расскраски");
        GameType type5 = new GameType(5,"Интерактивные игры");
        GameType type6 = new GameType(6,"Роботы");

        Game game1 = new Game(1, "Кукла Маша", type1);
        Game game2 = new Game(2, "Машинка", type3);
        Game game3 = new Game(3, "Робот", type6);
        Game game4 = new Game(4, "Матрёшка", type2);

        List<Game> games = new ArrayList<Game>();
        games.add(game1);
        games.add(game2);
        games.add(game3);
        games.add(game4);

        GameShop gameShop = new GameShop(games);
        gameShop.saveGameForWinnerList(games);
        gameShop.saveGameForWinnerList(games);
        gameShop.saveGameForWinnerList(games);
        gameShop.saveGameForWinnerList(games);



    }
}