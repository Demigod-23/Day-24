package com.ank.set;

import java.util.*;  
public class hashset{  
public static void main(String args[]){   
HashSet<String> set=new HashSet<String>();  
set.add("A");  
set.add("C");  
set.add("B");  
set.add("A");  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  