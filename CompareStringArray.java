package br.com.vinicius.portugal;

import java.util.Arrays;

public class CompareStringArray {

	public static void main (String args[]){
		
		String[] a1 = new String[4];
		a1[0] = "a";
		a1[1] = "b";
		a1[2] = "a";
		a1[3] = "c";
		
		String[] a2 = new String[4];
		a2[0] = "a";
		a2[1] = "a";
		a2[2] = "b";
		a2[3] = "c";
		
		boolean retorno = compareStringArrays(a1, a2);
		System.out.println(retorno);
	}
	
	public static boolean compareStringArrays(String[] a, String[] b) {
		
		if( !(null == a && null == b) && 
				(null == a || null == b))
			return false;
		else if ( null == a && null == b )
			return true;
		
	    if (a.length != b.length)
	        return false;

	    String[] aCopy = a.clone();
	    String[] bCopy = b.clone();

	    Arrays.sort(aCopy);
	    Arrays.sort(bCopy);
	    for (int i=0; i<aCopy.length; i++) {
	        if (!aCopy[i].equals(bCopy[i])  )
	            return false;
	    }
	    return true;
	}
}
