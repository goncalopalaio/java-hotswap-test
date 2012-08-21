JavaHotswapTest
===============

Testing code hotswapping with java and an ant extension ( http://code.google.com/p/hotswap ), without eclipse/any IDE.
This is supposed to be a barebones project just to demo it. 


There is a section on the build.xml file dedicated to make this work with tomcat but i didnt test it.

#Thanks to
Christopher Wellons blog post about hot code replacement( http://nullprogram.com/blog/2011/08/30/ ) and the example provided by him: 
https://github.com/skeeto/october-chess-engine/tree/hotswap-demo

#How to
1. Install ant if you dont have it.
2. Download hotswap.jar from http://code.google.com/p/hotswap.
3. Add hotswap.jar to /home/user/.ant/lib/ or ANT_HOME/lib or use -lib hotswap.jar when running ant (put the file in the same folder as the ant script).
4. run: ant run-hotswap #(in the same folder as the build.xml file)
5. Your application should be running now.
6. Make changes to the class and run:
7. ant hotswap
8. You should see the changes applied to the output of the program



