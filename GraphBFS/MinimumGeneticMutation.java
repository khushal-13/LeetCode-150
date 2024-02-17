import java.util.*;

public class MinimumGeneticMutation{

    public static int Method1(String startGene, String endGene, String[] bank){
        int level = 0;
        HashSet<String> bankSet = new HashSet<>();
        for (String string : bank) {
            bankSet.add(string);
        }

        HashSet<String> visited = new HashSet<>();
        char[] charSet = new char[]{'A','C','G','T'};

        Queue<String> q = new LinkedList<>();
        q.offer(startGene);

        while (!q.isEmpty()) {
            int n = q.size();
            while(n-->0){
                String curr = q.poll();
                if(curr.equals(endGene)){
                    return level;
                }

                char[] currArray = curr.toCharArray();
                for(int i=0;i<currArray.length;i++){
                    char old = currArray[i];
                    for (char c : charSet) {
                        currArray[i] = c;
                        String next = new String(currArray);
                        if(!visited.contains(next) && bankSet.contains(next)){
                            q.offer(next);
                            visited.add(next);
                        }
                    }
                    currArray[i] = old;
                }
            }
            level++;            
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}