package domain.model;


public class Game {
    private String naam;
    private String developers;
    private int IGN;
    private int Pegi;


    public Game(String Naam, String Developer, int IGN , int Pegi){
        this.setNaam(Naam);
        this.setDevelopers(Developer);
        this.setIGN(IGN);
        this.setPegi(Pegi);
    }


    public static boolean isValidString(String input) {
        return (input != null) && !(input.trim().isEmpty());
    }


    private void setNaam(String naam) {
        if (naam == null || naam.trim() == ""){
            throw new IllegalArgumentException("Naam mag niet leeg zijn.");
        }
        this.naam = naam;
    }

    public void setDevelopers(String developers) {
        if (developers == null || developers.isEmpty()) {
            throw new IllegalArgumentException("Developer mag niet leeg zijn");
        }
        this.developers = developers;
    }

    public void setIGN(int IGN) {
        this.IGN = IGN;
        if(IGN < 0 ) {
            throw new IllegalArgumentException("IGN rating kan niet negatief zijn");
        }

        if(IGN > 10) {
            throw new IllegalArgumentException("IGN kan niet hoger zijn dan 10");
        }
    }

    public void setPegi(int pegi) {
        Pegi = pegi;
    }


    public String getNaam() {
        return naam;
    }

    public boolean equals(Object g) {
        if (g instanceof Game) {
                return this.getNaam().equals(((Game)g).getNaam());
        }
        return false;
    }

    public int getIGN() {
        return IGN;
    }

    public int getPegi() {
        return Pegi;
    }



    public String getDevelopers() {
        return developers;
    }


}
