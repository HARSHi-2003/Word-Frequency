import java.util.*;
public class program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        HashMap<String,Integer>map=new HashMap<>();
        String[] words=sentence.split(" ");
        for(String word : words){
            Integer integer=map.get(word);
            if(integer==null)
            map.put(word,1);
            else{
                map.put(word,integer + 1);
            }
        }
        System.out.println(map);
}
}