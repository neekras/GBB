GBB
===

A simple bot using the Pircbot Java IRC framework, which listens for commands in a twitch.tv chat and emulates keypresses based on the command. For use with a gameboy emulator.

This code is ugly, I wanted to create something that works the same as twitch.tv/twitchplayspokemon and this the first thing i came up with.

==========================================================================
Required:

Pircbot Framework - www.jibble.org/pircbot.php

A twitch account - http://www.twitch.tv/

==========================================================================

Compiling/Running:

Assuming pircbot.jar is in the same directory as your java files:

javac -classpath pircbot.jar;. *.java

and

java -classpath pircbot.jar;. GBBMain

While the program is running the emulator has to be in focus. 
