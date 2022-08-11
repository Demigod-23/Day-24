package com.ank.set;

import java.util.*;  
public class linkedhashset{  
public static void main(String args[]){  
LinkedHashSet<String> set=new LinkedHashSet<String>();  
set.add("A");  
set.add("C");  
set.add("A");  
set.add("B");  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  