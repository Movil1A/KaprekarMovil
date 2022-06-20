package com.example.kaprekar;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Metodos{

    ArrayList<String> lista;
    int count=0;

    public Metodos() {

    }

    public String joinCharArray(char[] arr){
        String endStr = "";
        for (char c : arr) {
            endStr += c ;
        }
        return endStr;
    }

    public char[] reverseCharArray(char[] arr){
        char[] endArr = new char[arr.length];
        for (int i = endArr.length - 1; i >= 0; i--) {
            endArr[arr.length-i-1] =  arr[i];
        }
        return endArr;
    }

    public ArrayList<String> kaprekarMostrar(String num) {
        lista = new ArrayList<String>();
        count=0;
        if (!num.matches("^[0-9]{2,4}$")){
            return null;
        }
        if(num.length()==2){
            num = "00" + num;
        }
        if(num.length()==3){
            num = "0" + num;
        }
        char[] arr = num.toCharArray();
        boolean ok = true;
        byte cont = 0;
        for (int v = 0; v <= arr.length/2; v++) {
            cont = 0;
            for (int i = v; i < arr.length; i++) {
                if(arr[v] == arr[i]){
                    cont += 1;
                }
            }
            if (cont > 2){
                ok = false;
                break;
            }
        }
        if (!ok){
            return null;
        }

        short a, b;
        while (!num.equals("6174")){
            count++;
            Arrays.sort(arr);
            b = Short.parseShort(joinCharArray(reverseCharArray(arr)));
            a = Short.parseShort(joinCharArray(arr));
            num = Integer.toString(a >= b ? a - b : b - a);
            lista.add(String.format("%d - %d = %s Paso "+count+"\n",a >= b ? a: b,a < b ? a: b,num));
            arr = num.toCharArray();
        }
        return lista;
    }
    public int getCount(){return count;}
}
