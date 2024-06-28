public class palendrom {


    public static void main(String[] args){
        String abc= "A man, a plan, a canal: Panama";
        boolean answer= isPaplendrom(abc);
        System.out.println(answer);

    }

    public static boolean isPaplendrom(String s){
        if(s.isEmpty()){
            return true;
        }
        int first=0;
        int last=s.length()-1;

        while(first<=last){
            char firstChar= s.charAt(first);
            char lastChar= s.charAt(last);
System.out.println("at: "+firstChar+" and "+lastChar);
            if(! Character.isLetterOrDigit(firstChar)){
                first++;
            }else if(! Character.isLetterOrDigit(lastChar)){
                last--;
            }else{
                if(Character.toLowerCase(firstChar)!=Character.toLowerCase(lastChar)){
                    System.out.println(firstChar);
                    System.out.println(lastChar);
                    return false;
                }
            }
            first++;
            last--;

        }


        return true;
    }
}
