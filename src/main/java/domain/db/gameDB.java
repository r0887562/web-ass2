package domain.db;

 import domain.model.Game;

 import java.util.ArrayList;

public class gameDB {
     ArrayList<Game> games = new ArrayList<Game>();


        Game GTAV = new Game("GTA V","Rockstar Games", 10, 18 );
        Game FIFA = new Game("FIFA 22", "EA Sports", 7, 3);
       Game Overwatch = new Game( "Overwatch", "Blizzard", 7, 16);


    public gameDB(){
        games.add(GTAV);
        games.add(FIFA);
        games.add(Overwatch);
    }

    public  void voegToe(Game game) {
        games.add(game);
    }

    public ArrayList<Game> getAlleGames() {
        return games;
    }

    public int getAantal(){
        return getAlleGames().size();
    }



        public Game getHoogsteIGN() {
        if (games.size() == 0)
            return null;
        Game HoogsteIGN = games.get(0);
        for (Game game : games) {
            if (game.getIGN() > HoogsteIGN.getIGN())
                HoogsteIGN = game;
        }
        return HoogsteIGN;
    }

    public void add(Game g) {games.add(g);}

    }


