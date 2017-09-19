package leetcode10;

import java.util.ArrayList;
import java.util.List;

// List,  list.add, String.valueOf(number),  list.get,  list.size()

public class NO412fizzBuzz {

	public List<String> fizzBuzz(int n) {
        
        List<String> holder = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%5==0 && i%3==0){
                holder.add("FizzBuzz");
            }
            else if(i%3==0){
                holder.add("Fizz");
            }
            else if(i%5==0){
                holder.add("Buzz");
            }
            else{ 
                holder.add(String.valueOf(i));
            }
        }
////////////////////////////////////////////
for(int k=0;k<holder.size();k++){
System.out.println(holder.get(k));
}
////////////////////////////////////////////
        return holder;
    }
	
	public static void main(String[] args) {
		NO412fizzBuzz tester=new NO412fizzBuzz();
		tester.fizzBuzz(20);
	}

	

}
