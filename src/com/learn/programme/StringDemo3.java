package com.learn.programme;

public class StringDemo3 {

	public static void main(String[] args) {
		String str="MLDN JAVA高端技术培训20130214";
		String str1="mldn java高端技术培训20130214";
		String str2="mldn java高端技术培训20130214";
		String str3=new String("mldn java高端技术培训20130214");
		System.out.println(str.compareTo(str1));
		System.out.println(str.equals(str1));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
        System.out.println(str.replace("0", ""));
	}

}
