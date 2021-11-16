package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void mirrors(){
        int[] array = {1,2,3,7,8,3,2,1};

        int mirror = 0;
        int newMirror = 0;

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[i] == array[array.length-1-j] &&  j < i){
                    for (int k = 0; k < array.length-1; k++) {
                        if(array[i+k] == array[array.length-1-j-i] && i+k != array.length-1-j-i){
                            newMirror += 1;
                        }
                    }
                    if(mirror < newMirror){
                        mirror = newMirror;
                    }
                }
            }
        }
        System.out.println(mirror);

    }

    public static void main(String[] args) {
        mirrors();
    }
}