//Using replace built in method:

public class RemovingSpaceInString{
    public static void main(String[] args){
        String str= "Hello Java Program";
        String nospace= str.replace(" ","");
        System.out.print(nospace);
    }
}

/*Using  for loop and stringbuilder:
public class RemovingSpaceInString{
    public static void main(String[] args){
        String str = "Hello to the world from java";
        StringBuilder nospace = new StringBuilder();
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                nospace.append(str.charAt(i));
            }
        }
        System.out.println(nospace.toString());
    }
}*/