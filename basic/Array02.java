public class Array02{
	public static void main(String[] args){
		char chars[] =  new char[26];
		char c = 'a';
		for (int i=0;i<chars.length ; i++) {
			// chars[i]=c;
			// c++;
			
			chars[i]=(char)('a'+ i); //��Ҫǿת
		}
		System.out.println(chars[3]);
	}
}