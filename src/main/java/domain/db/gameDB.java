package domain.db;

 import domain.model.Game;

 import java.util.ArrayList;

public class gameDB {
     ArrayList<Game> games = new ArrayList<Game>();


        Game GTAV = new Game("GTA V","Rockstar Games", 10, 18 );
        Game FIFA = new Game("FIFA 22", "EA Sports", 7, 3);
        Game Overwatch = new Game( "Overwatch", "Blizzard", 7, 16);
        Game Fortnite = new Game("Fortnite","Epic Games", 8, 3);


    public gameDB(){
        games.add(GTAV);
        games.add(FIFA);
        games.add(Overwatch);
        games.add(Fortnite);
    }

    public  void voegToe(Game game) {
        games.add(game);
    }

    public ArrayList<Game> getAlleGames() {
        return games;
    }

    public String HoogsteIGN(){
        double Hoogsterating = 0;
        String hoog = "";
        for (Game a: games) {
            if(a.getIGN() > Hoogsterating){
                Hoogsterating = a.getIGN();
                hoog = a.getNaam();
            }
        }
        return hoog;
    }


    public String LaagsteIGN(){
        String LaagIGN = "";
        int laag = 11;
        for (Game l: games){
            if (l.getIGN() < laag) {
                LaagIGN = l.getNaam();
                laag = l.getIGN();
            }
        }
        return LaagIGN;
    }

    public void add(Game g) {games.add(g);}

    }


