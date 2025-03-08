package Sprint100;

public class RemoveVowels {
    public static void main(String[] args) {
        String name = "rAveendra";
        name = name.toLowerCase();
        //creare the string builder to remove the vowels
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                sb.append(ch);

            }
        }
        System.out.println(sb.toString());
    }
}

    

