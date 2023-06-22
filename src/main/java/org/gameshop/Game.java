package org.gameshop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Game {
    int id;
    GameType gameType;
    String name;

    public Game(int id, String name, GameType gameType) {
        this.id = id;
        this.name = name;
        this.gameType = gameType;
    }
    public String toString() {
        return "Приз [Артикул = " + id + ", Название = " + name + ", Категория = " + gameType.name + "]";
    }

}
