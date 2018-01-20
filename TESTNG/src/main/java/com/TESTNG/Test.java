package com.TESTNG;

import java.io.IOException;

//Java code illustrating ProcessBuilder command(List<String> command)
import java.lang.*;
import java.io.*;
import java.util.*;
class Test
{
 public static void main(String[] arg) throws IOException
 {
     // creating list of process
     List<String> list = new ArrayList<String>();
     list.add("notepad.exe");
     list.add("xyz.txt");

     // create the process
     ProcessBuilder build = new ProcessBuilder(list);
      build.start();
     // checking the command in list
     System.out.println("command: " + build.command());
      
 }
}
