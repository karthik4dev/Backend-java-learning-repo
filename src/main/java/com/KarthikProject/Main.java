package com.KarthikProject;


import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> numberHolder = new ArrayList<Integer>();

        File file1 = new File("A.txt");
        File file2 =new File("B.txt");
        BufferedReader br = new BufferedReader(new FileReader(file1));
        String st;
        while ((st = br.readLine()) != null){
            try{
                numberHolder.add(Integer.parseInt(st));
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
        BufferedReader br2= new BufferedReader(new FileReader(file2));
        String i;
        while ((i = br2.readLine()) != null){
            try{
                numberHolder.add(Integer.parseInt(i));
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
        Collections.sort(numberHolder);
        for (Integer a:numberHolder) {
            System.out.println(a);
        }
    }
}