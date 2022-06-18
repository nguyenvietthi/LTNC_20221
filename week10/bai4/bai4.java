package bai4;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;


public class bai4 {
    
    public static void main(String[] args) {
            File file = new File("D:/Capture");
            Queue<File> listFile = new LinkedList<>();
            listChild(file,listFile);
            
            long size = 0;
            while(listFile.size() > 0){
                size += listFile.remove().length(); 
            }

            System.out.format("Path: %s, size: %s (byte)", file.getPath(), size);
        
    }
    
    private static void listChild(File file, Queue<File> listFile) {
        if (file.isDirectory()) {
            File[] children = file.listFiles();
            for (File child : children) {
                listChild(child, listFile);
            }
        } else {
            listFile.offer(file);
        }
 
    }
}
