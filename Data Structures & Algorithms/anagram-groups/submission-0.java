class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramGroupings = new HashMap<>();
        ArrayList<List<String>> output = new ArrayList<>(); 
        for (int i = 0; i < strs.length; i++)
        {
            String str = strs[i];
            char[] fqArray = new char[26];
            for (int r = 0; r < str.length(); r++){
                char currentChar = str.charAt(r); 
                fqArray[currentChar - 'a']++;
            }
            String frequencyKey = Arrays.toString(fqArray); 
            if (anagramGroupings.containsKey(frequencyKey)){
                (anagramGroupings.get(frequencyKey)).add(strs[i]);
            }
            else{ 
                List<String> words = new ArrayList<>();
                words.add(strs[i]); 
                anagramGroupings.put(frequencyKey, words);
            }
        }
        //iterate though sublists and out output an arrayList of the Strings 

        for (Map.Entry<String, List<String>> entry: anagramGroupings.entrySet()){
            output.add(entry.getValue());
        }
        return output;
    }
}
