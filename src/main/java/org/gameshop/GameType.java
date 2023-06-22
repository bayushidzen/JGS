package org.gameshop;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class GameType {
    int id;
    String name;

    public GameType(int id,String name){
        this.id = id;
        this.name = name;
    }
}
