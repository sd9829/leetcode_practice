import java.util.HashMap;

public class wordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));

    }

    public static boolean wordPattern(String pattern, String s){
        //convert s to a list
        String[] lst = s.split(" ");
        if(lst.length != pattern.length())    return false;

        //now we have to add every val in pattern as ley to a hashmap to correspond to same
        //word. if the char to word match goes false, we return false
        HashMap<Character, String> hashMap = new HashMap<Character, String >(); 
        for(int i=0; i<pattern.length(); i++){
            //take each char one by one
            char ch = pattern.charAt(i);
            //now we will check if the hashmap already contains our key ch
            boolean containsKey = hashMap.containsKey(ch);
            if(hashMap.containsValue(lst[i]) && !containsKey){
                return false;
            }
            //if key is tehre but value does not match
            if(containsKey && !hashMap.get(ch).equals(lst[i])){
                return false;
            }
            //if both cases are true put value in map
            else{
                //put the value of the key in the hashmap
                hashMap.put(ch, lst[i]);
            }


        }
        return true;
    }
}
