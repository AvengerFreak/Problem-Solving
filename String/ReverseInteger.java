package String;
class ReverseInteger {

// solution to leetcode problem
    public int reverse(int x) {
        
        StringBuilder strb = new StringBuilder();
        strb.append(String.valueOf(x));
        
        if(x < 0){
           strb.deleteCharAt(0);
            
            try{
                return Integer.parseInt(strb.reverse().toString()) *-1;
            }
            
            catch(Exception e){
                return 0;
            }
            
        }
        
        try{
                return Integer.parseInt(strb.reverse().toString());
            }
            
            catch(Exception e){
                return 0;
            }
    }
}
