class isUnique{
    /*
     * w/ Data Structures
     */
    public boolean uniqueChar1(String s){
        if (s.length() > 255){ //256 ASCII Characters
            return false; 
        } else {
            int[] uniqueChar = new int [256];
            for (int i = 0; i< s.length(); i++){
                if(uniqueChar[s.charAt(i)] == 1){
                    return false;
                }
                uniqueChar[s.charAt(i)] = 1;
            }
            return true;
        }
    }

    /*
     * w/o Data Structures
     */
    public boolean uniqueChar2(String s){
        if (s.length() > 256){
            return false;
        }else{
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                for(int j=0; j<s.length(); j++){
                    if(i == j){

                    } else{
                        if(c == s.charAt(j)){
                            return false;
                        }
                    }
                }    
            }
            return true;
        }
    }
}