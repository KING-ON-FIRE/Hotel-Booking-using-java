package project;

public class Verifier {

	public boolean verify(String s,int age,char g,int date,int month,int year , int n) {
		boolean r = true;
		//String temp =  s.replaceAll("[^0-9]", "");
		if(s.isBlank() || age<=0 || age>100 || (g!='m' && g!='f') || (month == 2 && date > 28) || year > 2022 || n<=0) {
			r = false;
		}
		return r;
	}
}
