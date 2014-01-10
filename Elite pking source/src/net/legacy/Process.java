package net.legacy;

import net.legacy.events.EventManager;
import net.legacy.utilities.Miscellaneous;

public class Process implements Runnable {
	public static final int cycleTime = 500;

	@Override
	public void run() {
		int waitFails = 0;
		long lastTicks = System.currentTimeMillis();
		long totalTimeSpentProcessing = 0;
		int cycle = 0;
		while (!Server.shutdownServer) {
			try {
				if (Server.updateServer)
					Server.calcTime();
				// could do game updating stuff in here...
				// maybe do all the major stuff here in a big loop and just do
				// the packet
				// sending/receiving in the client sub-threads. The actual packet
				// forming code
				// will reside within here and all created packets are then
				// relayed by the sub-threads.
				// This way we avoid all the sync'in issues
				// The rough outline could look like:
				Server.playerHandler.process(); // updates all player related
												// stuff
				Server.npcHandler.process();
				Server.itemHandler.process();
				Server.shopHandler.process();
				// misc.println("objectHandler(f) process...");
				// server.objectHandler.firemaking_process();
				// doNpcs() // all npc related stuff
				// doObjects()
				// doWhatever()

				// taking into account the time spend in the processing code for
				// more accurate timing
				long timeSpent = System.currentTimeMillis() - lastTicks;
				totalTimeSpentProcessing += timeSpent;
				if (timeSpent >= cycleTime) {
					timeSpent = cycleTime;
					if (++waitFails > 100) {
						// shutdownServer = true;
						// misc.println("[KERNEL]: machine is too slow to run
						// this server!");
					}
				}
				try {
					Thread.sleep(cycleTime - timeSpent);
				} catch (Exception _ex) {
				}
				lastTicks = System.currentTimeMillis();
				cycle++;
				if (cycle % 100 == 0) {
					float time = ((float) totalTimeSpentProcessing) / cycle;
					Miscellaneous.println_debug("[CPU-USAGE]: " + (time * 100 / cycleTime) + "%.");
					// processing time");
				}
				if (Server.ShutDown == true) {
					if (Server.ShutDownCounter >= 100) {
						Server.shutdownServer = true;
					}
					Server.ShutDownCounter++;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// shut down the server
		Server.playerHandler.destruct();
		Server.clientHandler.killServer();
		EventManager.getSingleton().shutdown();
		Server.clientHandler = null;
	}
}
