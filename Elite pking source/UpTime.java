//makes uptime on quest tab ~Evan
public class UpTime implements Runnable {

    	private Thread timeThread;
    	private boolean isRunning = true;

    	public UpTime() {
        	timeThread = new Thread(this);
        	timeThread.start();
    	}

	public int time;
	public void run() {
    		while (isRunning) {
			time++;
            		for (Player p : server.playerHandler.players) {
                		client c = (client) p;
                		if (p == null) {
                    			continue;
                		}
                    		c.sendQuest("@or1@Uptime: @gre@" + time + " @or1@mins", 663);
			}

			try {
				Thread.sleep(60000);
			} catch (Exception e) {}
		}
    	}
}