package copyArray;

public class ArrayCopy {

	/**
	 * public static void arraycopy(Object src,  
                             int srcPos,  
                             Object dest,  
                             int destPos,  
                             int length)  
	 * @param args
	 */
	public static void main(String[] args) {  
		  
        int[] a1={1,2,3,4,5,6};  
        int[] a2={11,12,13,14,15,16};  
          
        System.arraycopy(a1, 2, a2, 3, 2);  
        System.out.print("copy后结果：");  
        for(int i=0;i<a2.length;i++){  
            System.out.print(a2[i]+" ");      
        }  
   }  
}
