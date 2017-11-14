import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Object> list = getValue(2, 9);
		for (Object object : list) {
			System.out.println(object);
		}
	}
	
	public static List<Object> getValue(int type,int... leng){
		List<Object> list = new ArrayList();
		String a = "";//最长
		String b = "";//最短
		String c = " ";//空格
		String d = "";//空白
		String e = "!@#$%^&*()";//特殊字符数组
		String fStr = "abcd";//非格式数据-字符
		int fNum = 12345;//非格式数据-数字
		if(leng.length > 1){
			for (int i = 0; i <= leng[1]; i++) {
				a += "a";
			}
			for (int i = 0; i < leng[0] - 1; i++) {
				b += "b";
			}
		}
		if (leng.length == 1){
			for (int i = 0; i <= leng[0]; i++) {
				a += "a";
			}
			for (int i = 0; i < leng[0] - 1; i++) {
				b += "b";
			}
		}
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		if(type == 1){//字母
			list.add(fStr);
		}else{//数字
			list.add(fNum);
		}
		return list;
	}
	
}
