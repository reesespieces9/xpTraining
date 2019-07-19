package com.rps.core;

public class PlayerStat {

    private Player player;
    private int gamesWon;
    private int gamesLost;
    private int gamesTied;

    public PlayerStat(Player player, int gamesWon, int gamesLost, int gamesTied) {
        this.player = player;
        this.gamesWon = gamesWon;
        this.gamesLost = gamesLost;
        this.gamesTied = gamesTied;
    }

    public PlayerStat( GameStat gameStat ) {
        this.player = gameStat.getPlayer();
        switch ( gameStat.getResult() ){
            case TIE: gamesTied = 1;
                    break;
            case WON: gamesWon = 1;
                    break;
            case LOSS: gamesLost =1;
                    break;
        }
    }

    public Double winPercentage(){
        return (gamesWon + (gamesTied * .5)) / getGamesPlayed() * 100;
    }

    public PlayerStat merge( PlayerStat ps ){
        gamesWon += ps.gamesWon;
        gamesTied += ps.gamesTied;
        gamesLost += ps.gamesLost;
        return this;
    }

    public int getGamesPlayed(){
        return gamesWon + gamesLost + gamesTied;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public int getGamesTied() {
        return gamesTied;
    }

    public void setGamesTied(int gamesTied) {
        this.gamesTied = gamesTied;
    }
}