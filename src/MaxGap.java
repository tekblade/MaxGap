import java.util.*;
import java.lang.*;

//Only one think should be added - Get the max value from the list gaps  
//It specifies max Gap
//Algorithm was my idea not used Web examples

public class MaxGap {
	static Scanner sc=new Scanner(System.in);  
	public static void solution(int N) throws MyException {
    if((N>2147483647) || (N<1)) {
    	System.out.println("Out of Range");
        throw new MyException();
        }
    
	findMaxGap(algorithm(N));
	}
    public static List<Integer> algorithm(int N){
        List<Integer> number=new ArrayList<Integer>();
        Integer bit;
        Integer quotient;
        while(N>0){ //Recursion
            bit=N % 2;    
            quotient=N/2;
            number.add(bit);
            N=quotient;
        }
        Collections.reverse(number);
        System.out.println(number);
        return number;
    }
    public static int findMaxGap(List<Integer> list) {
    	ListIterator<Integer> it=null;
    	List<Integer> gaps=new ArrayList<Integer>(); //list specifies all the Gap in binary number
    	Integer checkGap=0; //finded gap
        Integer theGap=2;
    	it=list.listIterator();
        while(it.hasNext()) {
        	if((theGap=it.next()).equals(1)) {
        		gaps.add(checkGap);
        		checkGap=0;
        	}
        	if(it.hasNext() && theGap.equals(0)) 
        		checkGap++;
            
        }
        System.out.println(gaps);
        return 1;
    }
    public static void main(String[] args) throws MyException {
    	System.out.println("give the number from the range 1 till 2147483647");
    	Integer number=sc.nextInt();
    	solution(number);
    }
}

