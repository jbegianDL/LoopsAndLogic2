package com.company;

public class Main {

    public static void main(String[] args) {
	int a = 0;
	int b = 0;
	int c = 0;
	int result = 1000;

	for(a = 1; a < 1000; a++){
		for(b = a; b < 1000; b++){
			for(c = b; c < 1000; c++){
				if((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)){
					if((a + b + c) == result){
						System.out.println(a + " " + b + " " + c);
					}
				}
			}
		}
    }


    }

}

