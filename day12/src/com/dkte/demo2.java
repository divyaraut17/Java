package com.dkte;

public class demo2 {

	public static void main(String[] args) {
		/*String str="divya";
	    String other="";
	    for(int i=str.length()-1;i>=0;i--) {
	    	other+=str.charAt(i);
	    }
    	System.out.println("Reverse string:"+other); 
*/
		//using String Buffer
		String str = "divya";
        StringBuffer sb = new StringBuffer(str);
        String reversed = sb.reverse().toString();
        System.out.println("Reverse string: " + reversed);
	}

}
