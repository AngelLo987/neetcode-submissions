class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.size(); i ++){
            int l = strs.get(i).length(); 
            sb.append(l);
            sb.append('#');
            sb.append(strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>(); //Arraylist of seperated words
        int index = 0; 
        while (index < str.length()){
            StringBuilder wordSize = new StringBuilder(); 
            while (str.charAt(index) != '#'){
                wordSize.append(str.charAt(index));
                index++;
            }
            index++; //skip the '#'
            int sizeWord = Integer.parseInt(wordSize.toString());
            StringBuilder currentWord = new StringBuilder(); 
            for (int s = 0; s < sizeWord; s++){
                currentWord.append(str.charAt(index));
                index++;  
            }
            decoded.add(currentWord.toString());
        }
        return decoded;
    }
}
