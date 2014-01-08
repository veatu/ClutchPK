import java.io.PrintStream;

public class Main
{

    public Main()
    {
    }

    public static void main(String args[])
    {
        if(args.length > 0)
        {
            if(args[0].equals("update"))
            {
                System.out.println("update");
                (new Main()).update();
            } else
            if(args[0].equals("run"))
            {
                (new Main()).run(true);
            } else
            if(args[0].equals("noupdate"))
            {
                System.out.println("noupdate");
                (new Main()).run(false);
            }
        } else
        {
            System.out.println("Commands: ");
            System.out.println("\tupdate - force an update");
            System.out.println("\trun - run the bot, checking for updates");
            System.out.println("\tnoupdate - run the bot, without looking for updates");
        }
    }

    public void update()
    {
        VersionGetter versiongetter = new VersionGetter("./Files/updater/Version.xml");
        VersionGetter versiongetter1 = new VersionGetter("http://www.xlinescape.net84.net/updater/Version.xml");
        String s = versiongetter.getVersion();
        String s1 = versiongetter1.getVersion();
        Updater updater = new Updater(s, s1);
        System.out.print("Updating the bot, please wait...");
        updater.update("./Files/updater/Version.xml", "http://www.xlinescape.net84.net/updater/Version.xml");
        updater.update("client.zip", "http://www.xlinescape.net84.net/updater/client.zip");
        updater.update("Main.class", "http://www.xlinescape.net84.net/updater/Main.class");
        System.out.println("Finished.");
    }

    public void run(boolean flag)
    {
        if(flag)
        {
            System.out.println("Checking for updates...");
            System.out.println("Please DO NOT close this window!!");
            VersionGetter versiongetter = new VersionGetter("./Files/updater/Version.xml");
            VersionGetter versiongetter1 = new VersionGetter("http://www.xlinescape.net84.net/updater/Version.xml");
            String s = versiongetter.getVersion();
            String s1 = versiongetter1.getVersion();
            Updater updater = new Updater(s, s1);
            if(updater.needUpdate())
            {
                System.out.println("Update required!");
                System.out.println("Downloading Updates! Please wait...");
                System.out.print("Updating client files...  ");
                updater.update("client.zip", "http://www.xlinescape.net84.net/updater/client.zip");
                System.out.println("Done!");
                System.out.print("Updating Updater...  ");
                updater.update("./Files/updater/Main.class", "http://www.xlinescape.net84.net/updater/Main.class");
                System.out.println("Done!");
                System.out.print("Updating Version...  ");
                updater.update("./Files/updater/Version.xml", "http://www.xlinescape.net84.net/updater/Version.xml");
                System.out.println("Done!");
                System.out.println("Finished");
		System.out.println("Please extact the client.zip in the main client folder");
            } else
            {
                System.out.println("No updated was required.");
                System.out.println("You can now close this window.");
            }
        }
    }
}
