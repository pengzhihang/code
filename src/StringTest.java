public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTest test=new StringTest();
		test.sort();
	}
	public void sort() {
				
		String a="687254321";
		char[] chrCharArray=a.toCharArray();
		int temp = 0;
//		for (int i = chrCharArray.length - 1; i > 0; --i)
//		{
//		    for (int j = 0; j < i; ++j)
//		    {
//		        if (chrCharArray[j + 1] < chrCharArray[j])
//		        {	
//		            temp = chrCharArray[j];
//		            chrCharArray[j] = chrCharArray[j + 1];	
//		            chrCharArray[j + 1] = (char) temp;	
//		            System.out.println(i);
//		            System.out.println(j);
//		        }
//		    }
//			
//		}
		
		for (int i=0;i<chrCharArray.length-1;i++) {
			
			if(chrCharArray[i]>chrCharArray[i+1]) {
				
				temp=chrCharArray[i];
				chrCharArray[i]=chrCharArray[i+1];
				chrCharArray[i+1]=(char) temp;
			}
		}
		System.out.println(chrCharArray);
	}
}
