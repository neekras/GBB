import org.jibble.pircbot.*;
import java.io.*;

public class GBBMain {
    
    public static void main(String[] args) throws Exception {
        
        // Now start our bot up.
        System.out.print("Starting bot...");
        GBB9000 bot = new GBB9000();
        System.out.print("Done! \n");

        // Enable debugging output.
        bot.setVerbose(false);
        
        // Connect to the IRC server.
        System.out.print("Connecting to Server...");
        bot.connect("irc.twitch.tv", 6667, "oauth:XXXXXXXXXXX"); //change oauth to the one for your twitch channel
        System.out.print("Done! \n");

        // Join the #pircbot channel.
        System.out.print("Joining Channel...");
        bot.joinChannel("#username");  //change to your twitch username
        System.out.print("Done! \n");

    }
    
}
