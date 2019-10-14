package com.rps.core;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public abstract class GameResultRepositoryTest {

    GameResultRepository gameResultRepository;
    PlayerRepository playerRepository;

    protected abstract GameResultRepository getGameResultRepository();
    protected abstract PlayerRepository getPlayerRepository();

    @Before
    public void setup() {
        gameResultRepository = getGameResultRepository();
        playerRepository = getPlayerRepository();
    }

    @Test
    public void canGetResults(){
        Player player1 = PlayerFactory.buildPlayer();
        playerRepository.save( player1 );
        Player player2 = PlayerFactory.buildPlayer();
        playerRepository.save( player2 );
        GameResult gameResult = new GameResult(player1, player2, Outcome.P1_WINS, Throw.ROCK, Throw.PAPER, 1 );
        gameResultRepository.save( gameResult );
        List<GameResult> gameResults = gameResultRepository.findAll();
        Assert.assertEquals( 1, gameResults.size() );
        Assert.assertEquals( true, gameResult.equals( gameResults.get(0) ) );
    }

    @Test
    public void canGetResultsById(){
        Player player1 = PlayerFactory.buildPlayer();
        playerRepository.save( player1 );
        Player player2 = PlayerFactory.buildPlayer();
        playerRepository.save( player2 );
        GameResult gameResult = new GameResult(player1, player2, Outcome.P1_WINS, Throw.PAPER, Throw.ROCK, 1 );
        gameResultRepository.save( gameResult );
        gameResult = new GameResult(player1, player2, Outcome.P2_WINS, Throw.PAPER, Throw.SCISSORS, 2 );
        gameResultRepository.save( gameResult );
        GameResult gameResultById = gameResultRepository.findById(2);
        Assert.assertEquals(gameResultById.getOutcome(), Outcome.P2_WINS );
        Assert.assertEquals( true, gameResult.equals( gameResultById ));
        gameResultById = gameResultRepository.findById(1);
        Assert.assertEquals(gameResultById.getOutcome(), Outcome.P1_WINS );
    }

}
