//Jitranuch Sinthawat 5631220821
//Anunya Sukitjanuparp 5631366821

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hi, my name, is Pac.";
		String a="";
		for(int i=0;i<s.length();i++){
			String temp = ""+s.charAt(i);

				if(s.toLowerCase().charAt(i)=='a') a+="";
				else if(s.charAt(i)==',') a+="";
				else if(i==0) a+=""+temp.toUpperCase();
				else if(s.charAt(i-1)==' ') a+=""+temp.toUpperCase();
				else a+=""+temp.toLowerCase();
	
		}
		
		System.out.println(a);

	}

}
