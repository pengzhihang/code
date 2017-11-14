
public class TestM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="56513243254";
		char[] chrCharArray=a.toCharArray();
		int c=0;
		for(int i=0;i<chrCharArray.length;i++) {
			
			for(int y=i+1;y<chrCharArray.length-1;y++) {
				
				if(chrCharArray[y]<chrCharArray[y+1]) {
					
					c=chrCharArray[y+1];
					chrCharArray[y]=chrCharArray[y+1];
					chrCharArray[y+1]=(char) c;
				}
				
			}
		}
		System.out.println(chrCharArray);
	}

}
