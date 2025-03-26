public class Player {
	
	int playerid;
	String playername;
	String game;
	String country;
	// setter , getter for playerid
	public void setPlayerId(int p) {
		playerid = p;
	}
	public int getPlayerId() {
		return playerid;
	}
	
	// setter , getter for playername
	public void setPlayerName(String n) {
		playername = n;
	}
	public String getPlayerName() {
		return playername;
	}
	
	// setter , getter for game
	public void setGame(String g) {
		game = g;
	}
	public String getGame() {
		return game;
	}
	
	// setter , getter for country
	public void setCountry(String c) {
		country = c;
	}
	public String getCountry() {
			return country;
	}
	public static void main(String[] args) {
		Player p1 = new Player();
		p1.setPlayerId(63);
		p1.setPlayerName("Jasprit Bumrah");
		p1.setGame("Cricket");
		p1.setCountry("India");
		
		System.out.println(p1.getPlayerId());
		System.out.println(p1.getPlayerName());
		System.out.println(p1.getGame());
		System.out.println(p1.getCountry());
		
	}

}
