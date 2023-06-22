package org.gameshop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class GameShop {
    private List<Game> games;

    public GameShop(List<Game> games) {
        this.games = games;
    }

    public Game getGameIDForGift(List<Game> games) {
        int number = games.size();
        Game prize = games.get((int) (Math.random() * number));;
        return prize;
    }

    public void saveGameForWinnerList(List<Game> games) {
        Game prize = getGameIDForGift(games);
        String text = prize.toString();
        try(FileWriter writer = new FileWriter("games.md", true))
        {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        games.remove(prize);
    }
}
