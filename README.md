JavaHotswapTest
===============

Testing code hotswapping with java and an ant extension ( http://code.google.com/p/hotswap ), without eclipse/any IDE.
This is supposed to be a barebones project just to demo it. 


There is a section on the build.xml file dedicated to make this work with tomcat but i didnt test it.

#Thanks to
Christopher Wellons blog post about hot code replacement( http://nullprogram.com/blog/2011/08/30/ ) and the example provided by him: 
https://github.com/skeeto/october-chess-engine/tree/hotswap-demo

#How to
Install ant if you dont have it.
Download hotswap.jar from http://code.google.com/p/hotswap.
Add hotswap.jar to /home/user/.ant/lib/ or ANT_HOME/lib or use -lib hotswap.jar when running ant (put the file in the same folder as the ant script).
run: ant run-hotswap #(in the same folder as the build.xml file)
Your application should be running now.
Make changes to the class and run:
ant hotswap
You should see the changes applied to the output of the program



