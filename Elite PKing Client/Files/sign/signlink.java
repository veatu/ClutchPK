package sign;

import java.applet.Applet;
import java.io.*;
import java.net.*;
import javax.sound.midi.*;
import javax.sound.sampled.*;

public final class signlink implements Runnable {

		enum Position {LEFT, RIGHT, NORMAL};
	public static final void startpriv(InetAddress inetaddress){
		threadliveid = (int)(Math.random() * 99999999D);
		if(active){
			try {
				Thread.sleep(500L);
			} catch(Exception _ex){ }
				active = false;
		}
		socketreq = 0;
		threadreq = null;
		dnsreq = null;
		savereq = null;
		urlreq = null;
		socketip = inetaddress;
		Thread thread = new Thread(new signlink());
		thread.setDaemon(true);
		thread.start();
		while(!active)
		try {
			Thread.sleep(50L);
		} catch(Exception _ex){ }
	}
	public void run(){
		active = true;
		String s = findcachedir();
		uid =  74558541;
		try {
			File file = new File(s + "main_file_cache.dat");
			if(file.exists() && file.length() > 0x3200000L) file.delete();
			cache_dat = new RandomAccessFile(s + "main_file_cache.dat", "rw");
			for(int j = 0; j < 5; j++)
			cache_idx[j] = new RandomAccessFile(s + "main_file_cache.idx" + j, "rw");
			//cache_idx[4] = new RandomAccessFile("C:\\filll\\aam.dat","rw");
		} catch(Exception exception){ exception.printStackTrace(); }
		for(int i = threadliveid; threadliveid == i;){
			if(socketreq != 0){
				try {
					socket = new Socket(socketip, socketreq);
				} catch(Exception _ex){ socket = null; }
					socketreq = 0;
			} else if(threadreq != null){
				Thread thread = new Thread(threadreq);
				thread.setDaemon(true);
				thread.start();
				thread.setPriority(threadreqpri);
				threadreq = null;
			} else if(dnsreq != null){
				try {
					dns = InetAddress.getByName(dnsreq).getHostName();
				} catch(Exception _ex) {
					dns = "unknown";
				}
				dnsreq = null;
			} else if(savereq != null){
				if(savebuf != null)
					try {
						FileOutputStream fileoutputstream = new FileOutputStream(s + savereq);
						fileoutputstream.write(savebuf, 0, savelen);
						fileoutputstream.close();
					} catch(Exception _ex){ }
				if(waveplay){
					String wave = s + savereq;
					waveplay = false;
					//System.out.println("WAVE "+wave);
					AudioInputStream audioInputStream = null;
					try {
						audioInputStream = AudioSystem.getAudioInputStream(new File(wave/*soundFile*/));
						} catch(UnsupportedAudioFileException e1){ e1.printStackTrace(); return;
						} catch(IOException e1){ e1.printStackTrace(); return; }
					AudioFormat format = audioInputStream.getFormat();
					SourceDataLine auline = null;
					DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
					try {
					auline = (SourceDataLine) AudioSystem.getLine(info);
					auline.open(format);
					} catch(LineUnavailableException e){ e.printStackTrace(); return;
					} catch(Exception e){ e.printStackTrace(); return; }
						if(auline.isControlSupported(FloatControl.Type.PAN)){
							FloatControl pan = (FloatControl) auline.getControl(FloatControl.Type.PAN);
							if(curPosition == Position.RIGHT) pan.setValue(1.0f);
							else if(curPosition == Position.LEFT) pan.setValue(-1.0f);
						}
						auline.start();
						int nBytesRead = 0;
						byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];
					try {
						while(nBytesRead != -1){
							nBytesRead = audioInputStream.read(abData, 0, abData.length);
							if(nBytesRead >= 0) auline.write(abData, 0, nBytesRead);
						}
					} catch(IOException e){
							e.printStackTrace(); return;
					} finally {
						auline.drain();
						auline.close();
					}
				}
				if(midiplay){
					midi = s + savereq;
					//midiplay = false;
					try {
						//System.out.println("Play MIDI " + midi);
						if(musicSr != null){
							musicSr.stop();
							musicSr.close();
						}
						musicSr = null;
						musicS = null;
						File music = new File(midi);
						if(music.exists()) {
							musicS = MidiSystem.getSequence(music);
						}
						// Create a sequencer for the sequence
						musicSr = MidiSystem.getSequencer();
						musicSr.open();
						musicSr.setSequence(musicS);
						musicSr.setLoopCount(musicSr.LOOP_CONTINUOUSLY);
						//musicSr.start();
					} catch(Exception ex){ ex.printStackTrace(); }
						midiplay = false;
				}
				savereq = null;
			} else if(urlreq != null){
				try {
					System.out.println("urlstream");
					urlstream = new DataInputStream((new URL(mainapp.getCodeBase(), urlreq)).openStream());
				} catch(Exception _ex){
					urlstream = null;
				}
				urlreq = null;
			}
			try {
				Thread.sleep(50L);
			} catch(Exception _ex){ }
		}
	}
	Sequence musicS = null;
	public static final String findcachedir(){
		do {
			String string;
	    try {
			String string_0_ = "cache";
			String string_1_ = "./";
			File file = new File(new StringBuilder().append(string_1_).append(string_0_).toString());
			if(!file.exists() && !file.mkdir()) break;
			string = new StringBuilder().append(string_1_).append(string_0_).append("/").toString();
		} catch(Exception exception){ break; }
			return string;
		}
		while(false);
		return null;
	}
    private static final int getuid(String s)
    {
      return 74558541;
    }
	
	public static synchronized Socket opensocket(int i)
		throws IOException {
			for(socketreq = i; socketreq != 0;)
			try {
				Thread.sleep(50L);
			} catch(Exception _ex){ }
			if(socket == null) 
			throw new IOException("could not open socket");
			else return socket;
		}

	public static synchronized DataInputStream openurl(String s)
		throws IOException {
			for(urlreq = s; urlreq != null;)
			try {
				Thread.sleep(50L);
			} catch(Exception _ex){ }
			if(urlstream == null)
			throw new IOException("could not open: " + s);
			else return urlstream;
		}
	
	public static synchronized void dnslookup(String s){
		dns = s;
		dnsreq = s;
	}
	public static synchronized void startthread(Runnable runnable, int i){
		threadreqpri = i;
		threadreq = runnable;
	}
	public static synchronized boolean wavesave(byte abyte0[], int i){
		if(i > 0x1e8480) return false;
		if(savereq != null){
			return false;
		} else {
			wavepos = (wavepos + 1) % 5;
			savelen = i;
			savebuf = abyte0;
			waveplay = true;
			savereq = "sound"+wavepos+".wav";
			return true;
		}
	}
	
	public static synchronized boolean wavereplay(){
		if(savereq != null){
			return false;
		} else {
			savebuf = null;
			waveplay = true;
			savereq = "sound"+wavepos+".wav";
			return true;
		}
	}

	public static synchronized void midisave(byte abyte0[], int i){
		if(i > 0x1e8480) return;
		if(savereq != null){
        } else {
			midipos = (midipos + 1) % 5;
			savelen = i;
			savebuf = abyte0;
			midiplay = true;
			savereq = "jingle" + midipos + ".mid";
		}
	}
	
	public static void reporterror(String s){
		System.out.println("Error: " + s);
	}
	
	private signlink(){
	}
	
	public static final int clientversion = 317;
	public static int uid;
	public static int storeid = 32;
	public static RandomAccessFile cache_dat = null;
	public static final RandomAccessFile[] cache_idx = new RandomAccessFile[5];
	public static boolean sunjava;
	public static  Applet mainapp = null;
	private static boolean active;
	private static int threadliveid;
	private static InetAddress socketip;
	private static int socketreq;
	private static Socket socket = null;
	private static int threadreqpri = 1;
	private static Runnable threadreq = null;
	private static String dnsreq = null;
	public static String dns = null;
	private static String urlreq = null;
	private static DataInputStream urlstream = null;
	private static int savelen;
	private static String savereq = null;
	private static byte[] savebuf = null;
	private static boolean midiplay;
	private static int midipos;
	public static String midi = null;
	public static int midivol;
	public static int midifade;
	private static boolean waveplay;
	private static int wavepos;
	public static int wavevol;
	public static boolean reporterror = true;
	public static String errorname = "";
	private final int EXTERNAL_BUFFER_SIZE = 524288; // 128Kb
	private Position curPosition;
	public static Sequencer musicSr = null;
	public static boolean music = true;
}