import { GameResult, Player, Throw, Outcome } from './game';
import { Observable, of } from 'rxjs';
import { GameGateway, PlayPracticeGameRequest, PlayPracticeGameResponse, PlayGameRequest } from './game.gateway';

export class StubGameGateway implements GameGateway {

  playPracticeGameCalledWith: PlayPracticeGameRequest;
  playGameCalledWith: PlayGameRequest;
  stubOutcome: Outcome;

  playPracticeGame(request: PlayPracticeGameRequest): Observable<PlayPracticeGameResponse> {
    this.playPracticeGameCalledWith = request;

    return of(new PlayPracticeGameResponse(Outcome.P1Wins));
  }

  playGame(request: PlayGameRequest): Observable<GameResult> {
    this.playGameCalledWith = request;
    
    return of(new GameResult(request.player1, request.player2, request.player1Throw, request.player2Throw, this.stubOutcome));
  }

  getPlayers(): Observable<Player[]>{
    const tempArray: Player[] = [];
    tempArray.push(new Player("Player 1",1 ));
    tempArray.push(new Player("Player 2",2 ));
    tempArray.push(new Player("Player 3",3 ));
    return of(tempArray);
  }
}
