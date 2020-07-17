public class Question_4 {

   
    static final int intial = 0; 
    static final int output = 1; 
    
    public static void main(String args[]) 
    { 
        String str = " besides skills, responsibility is equally important"; 
        System.out.println("Number of words counted : " + countNumberofWords(str)); 
    }    
    static int countNumberofWords(String str) 
    { 
        int state = output; 
        int numberOfWords = 0;  
        int j = 0; 
          
       
        while (j < str.length()) 
        { 
             
            if (str.charAt(j) == ' ' || str.charAt(j) == '\n' 
                    || str.charAt(j) == '\t') 
                state = output; 
                  
       
            
            else if (state == output) 
            { 
                state = intial; 
                ++numberOfWords; 
            } 
            ++j; 
        } 
        return numberOfWords; 
    }       
} 

    

