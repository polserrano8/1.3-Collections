package org.example.Model;

public class GameStructure {
    private CountriesGame game = new CountriesGame();
    public GameStructure(){};

    public void startGame(String path){
        game.fileDescifer(path);
        game.aleatoryCountryGenerator();
        game.predictCountry();
        game.writeResults();
    }
}
