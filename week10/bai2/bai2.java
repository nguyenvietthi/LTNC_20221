package bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.SpringLayout;

public class bai2 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(); 
        for(int i = 1; i <=5000000; i++){
            array.add(i);
        }
        
        ListIterator<Integer> listIterator = array.listIterator();
        while(listIterator.hasNext()){
            System.out.format("value: %d, time: %b\n  ", listIterator.next(), System.currentTimeMillis());
        }
    }
}
