package ch02;

import ch02.src.stacks.ArrayBoundedStack;
import ch02.src.stacks.StackInterface;

public class AliStack {
    public static void main(String[] args) {
        StackInterface<Integer> ali = new ArrayBoundedStack<Integer>();
        int item1 = 2;
        int item2 = 0;
        int item3 = 6;
        ali.push(item2);
        ali.push(item1);
        ali.push( item1+item3);
        item2 = ali.top( );
        ali.push(item3*item3);
        ali.push(item2);
        ali.push(3);
        item1 = ali.top( );
        ali.pop( );
        System.out.println(item1 + " " + item2 + " " + item3);
        while(!ali.isEmpty( ))
        {
            item1 = ali.top( ) ;
            ali.pop( ) ;
            System.out.println(item1) ;
        }

    }
}
