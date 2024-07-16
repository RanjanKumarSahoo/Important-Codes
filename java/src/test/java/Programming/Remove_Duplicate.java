package Programming;

public class Remove_Duplicate { 
    public static void main(String[] args) { 
        // Sample list with duplicate elements 
       /* List<Integer> listWithDuplicates = new ArrayList<>(); 
        listWithDuplicates.add(1); 
        listWithDuplicates.add(2); 
        listWithDuplicates.add(3); 
        listWithDuplicates.add(2); 
        listWithDuplicates.add(4); 
        listWithDuplicates.add(3); 
 
        // Using LinkedHashSet to remove duplicates 
        LinkedHashSet<Integer> setWithoutDuplicates = new LinkedHashSet<>(listWithDuplicates); 
 
        // Creating a new list without duplicates 
        List<Integer> listWithoutDuplicates = new ArrayList<>(setWithoutDuplicates); 
 
        // Displaying the results 
        System.out.println("List with duplicates: " + listWithDuplicates); 
        System.out.println("List without duplicates: " + listWithoutDuplicates);*/ 
         
        int [] arr=new int[] {1,2,3,2,4,5,4,7}; 
        //char [] arr=new char[] {'m','a','d','a','m'}; 
        /*for(int i=0;i<arr.length;i++) 
         System.out.print(arr[i]);*/ 
         
        for(int i=0;i<arr.length;i++) 
        { 
         for (int j=i+1;j<arr.length;j++) 
         { 
          if(arr[i]==arr[j])  
           arr[i]=-1; 
         } 
        } 
        for(int i=0;i<arr.length;i++) 
         if (arr[i]!=-1) 
          System.out.print(arr[i]); 
    }}
