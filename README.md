# DSA_Coding

# Currently working on it will come back with a bang bang ..... ! Don't forget to star  A lot of content is going to be here 
### Character Shortcuts


### String Shortcuts
<!-- s is consider as String -->
char ch[] = s.toCharArray(); 
- <b>Char Array to String</b>  
Adding all char array character to a single string
String.valueOf(chararr);


### String Builder
- <b>Reversing a string</b> 
StringBuilder s = new StringBuilder("String");
s.reverse()


### Array Shortcuts
- <strong> Converting Arrays to list </strong>
You can only convert wrapper class to list
Integer arr[] = {blah....};
list\<Object> al = Arrays.asList(arr);

- <b>Array fill</b>  
Filling array with same number  
Array.fill(arr,-1); 
- <b>Array Equal</b> 
Return boolean comparing arrays  
Arrays.equals(arr1,arr2); 
- <b>Array Sort</b> 
Sorting array  
Arrays.sort(arr);  
- <b>Array BinarySearch</b>
Searching a number using binarySearch  
Arrays.binarySearch(arr,10);


### HashMap
- <b>Enhanced Get Element</b>
Used in insertion of frequency    
hm.getOrDefault(arr[i],0)+1 ;   
hm.put(arr[i],hm.getOrDefault(arr[i],0)+1)   
- <b>Iterator</b>  
HashMap<Integer,String> languages;  
for (Entry<Integer,String> entry : languages.entrySet()) {  
      System.out.print(entry.getKey());  
      System.out.print(entry.getValue());    
    }    
### PriorityQueue
- <b>MIN Heap</b>  
`PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->a-b);`
- <b>MAX Heap</b>  
`PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);`

### Comparator 
 <!-- Mainly used in sorting object inside data  -->

### Easy Syntax
- <b>If statement return a value</b>  
(a>b) ? true : false ;

- <b>String T to T</b>  
Double.parseDouble("1.223")
Integer.parseInt("123")
Float.parseFloat("23.23")

- <b>Decimal after point till x</b>    
double d1 = 1.23232  
DecimalFormat df = new DecimalFormat()  
d1 = df.format(d1)  
