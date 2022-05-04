package bg.mg.cowsandbulls;

public interface GameService {
	
	GameInfo startGame();
	
	GameInfo makeTry(String id, int[] guess);
	
	GameInfo getGame(String gameId);
}
