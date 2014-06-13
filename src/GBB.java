/* GBB.java
 * Author: Nick Hampshire, using pircbot framework
 * Website: nhampshire.com
 * Description:
 * Reads messages in the channel, emulates key press if message matches a command.
 */

import org.jibble.pircbot.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class GBB extends PircBot {
    
    public GBB() {
        this.setName("BotName"); //twitch username
        setFinger("GameBoyBot by nhampshire");
        setMessageDelay(0);
        setVersion("GBB V0.01");
        setLogin("GBB);

    } //end GBB9000



    
    public void onMessage(String channel, String sender,
                       String login, String hostname, String message) {

        int delay = 100;
        if (message.equalsIgnoreCase("a")) {
            try{
                Robot robo = new Robot();
                robo.keyPress(KeyEvent.VK_A);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                robo.keyRelease(KeyEvent.VK_A);

                System.out.format("%20s%10s", sender, message + "\n");

            } catch(Exception e) {
                throw new RuntimeException("Failed to create java.awt.Robot for Robo instance", e);
            }
        }
        

        if (message.equalsIgnoreCase("b")) {
          //  sendMessage(channel, "pressed b");
            try{
                Robot robo = new Robot();
                robo.keyPress(KeyEvent.VK_B);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                robo.keyRelease(KeyEvent.VK_B);

                System.out.format("%20s%10s", sender, message + "\n");

            } catch(Exception e) {
                throw new RuntimeException("Failed to create java.awt.Robot for Robo instance", e);
            }
        }
        if (message.equalsIgnoreCase("select")) {
            //sendMessage(channel, "pressed select");
            try{
                Robot robo = new Robot();
                robo.keyPress(KeyEvent.VK_Z);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                robo.keyRelease(KeyEvent.VK_Z);

                System.out.format("%20s%10s", sender, message + "\n");
            } catch(Exception e) {
                throw new RuntimeException("Failed to create java.awt.Robot for Robo instance", e);
            }
        }
        if (message.equalsIgnoreCase("start")) {
            //sendMessage(channel, "pressed start");
            try{
                Robot robo = new Robot();
                robo.keyPress(KeyEvent.VK_X);
                 try {
                    Thread.sleep(delay);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                robo.keyRelease(KeyEvent.VK_X);

                System.out.format("%20s%10s", sender, message + "\n");
            } catch(Exception e) {
                throw new RuntimeException("Failed to create java.awt.Robot for Robo instance", e);
            }
        }



        if (message.equalsIgnoreCase("u")) {
            //sendMessage(channel, "pressed up");
            try{
                Robot robo = new Robot();
                robo.keyPress(KeyEvent.VK_UP);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                robo.keyRelease(KeyEvent.VK_UP);

                System.out.format("%20s%10s", sender, "up" + "\n");

            } catch(Exception e) {
                throw new RuntimeException("Failed to create java.awt.Robot for Robo instance", e);
            }
        }
        if (message.equalsIgnoreCase("d")) {
            //sendMessage(channel, "pressed down");
            try{
                Robot robo = new Robot();
                robo.keyPress(KeyEvent.VK_DOWN);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                robo.keyRelease(KeyEvent.VK_DOWN);

                System.out.format("%20s%10s", sender, "down" + "\n");

            } catch(Exception e) {
                throw new RuntimeException("Failed to create java.awt.Robot for Robo instance", e);
            }
        }
        if (message.equalsIgnoreCase("l")) {
           // sendMessage(channel, "pressed left");
            try{
                Robot robo = new Robot();
                robo.keyPress(KeyEvent.VK_LEFT);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                robo.keyRelease(KeyEvent.VK_LEFT);

                System.out.format("%20s%10s", sender, "left" + "\n");

            } catch(Exception e) {
                throw new RuntimeException("Failed to create java.awt.Robot for Robo instance", e);
            }
        }
        if (message.equalsIgnoreCase("r")) {
           // sendMessage(channel, "pressed right");
            try{
                Robot robo = new Robot();
                robo.keyPress(KeyEvent.VK_RIGHT);
                try {
                    Thread.sleep(delay);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                robo.keyRelease(KeyEvent.VK_RIGHT);

                System.out.format("%20s%10s", sender, "  " + "right" + "\n");

            } catch(Exception e) {
                throw new RuntimeException("Failed to create java.awt.Robot for Robo instance", e);
            }
        }

    } //end onMessage
    
  }

