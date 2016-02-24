package com.train.collection.comparison.natives;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
* @Description: 比较 jdk 1.7 和  jdk1.8 java集合框架执行效率
* @author 张福泉 zhang_91026@163.com 
* 
* 
*/
public class JavaCollectionComparisonOnJdk {
	
	/**
	 * 为了避免实验的准确,将vm堆的大小设置为不可扩展(
	 * 通过vm启动参数-Xms,-Xmx 设置为一样即可避免堆自动扩展)
	 * @param -Xms80m -Xmx80m (定义)
	 */
	public static void comparisonWithList() {
		System.gc();
	    Runtime r = Runtime.getRuntime(); 
		long total = r.totalMemory(); // byte
	    long m1 = r.freeMemory();
	    System.out.println("before:[totalM="+total+",freeM="+m1+",userdM=" + (total - m1)+"]");
		long begTime = System.currentTimeMillis(); 
		List<String> list = new ArrayList();
		for(int i=0;i<1000000;i++){
			list.add(i+"");
		}
		long total1 = r.totalMemory(); 
        long m2 = r.freeMemory();
        System.out.println("after:[totalM="+total1+",freeM="+m2+",userdM=" + (total1 - m2)+"]");
        System.out.println("loop used memory = "+(m1-m2));
		long endTime = System.currentTimeMillis(); 
		System.out.println("used time = "+ (endTime-begTime));
	}
	
	/**
	 * @param -Xms80m -Xmx80m (定义)
	 */
	public static void comparisonWithMap() {
		
		System.gc();
		
	    Runtime r = Runtime.getRuntime(); 
	    
		long total = r.totalMemory(); // byte
		
	    long m1 = r.freeMemory();
	    
	    System.out.println("before:[totalM="+total+",freeM="+m1+",userdM=" + (total - m1)+"]");
	        
		long begTime = System.currentTimeMillis(); 
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		for(int i=0;i<1000000;i++){
			map.put(i, i+"");
		}
		
		long total1 = r.totalMemory(); 
		
       long m2 = r.freeMemory();
       
       System.out.println("after:[totalM="+total1+",freeM="+m2+",userdM=" + (total1 - m2)+"]");
		
       System.out.println("loop used memory = "+(m1-m2));
       
		long endTime = System.currentTimeMillis(); 
		
		System.out.println("used time = "+ (endTime-begTime));
		
	}
	
	
	public static void main(String[] args) {
		comparisonWithList();
	}
	
}
