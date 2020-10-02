package ch02.src.ch02.apps;

import ch02.src.ch02.figures.*;

public class UseFigs
{
   public static void main(String[] args)
   {
      Square myBox = new Square(5);
      System.out.println(myBox.perimeter());
      System.out.println(myBox.area());
   }
}