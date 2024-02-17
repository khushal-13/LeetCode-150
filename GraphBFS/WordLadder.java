import java.util.*;

public class WordLadder {
    
    public int Method1(String beginWord, String endWord, List<String> wordList) {
        int level = 1;
        HashSet<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord)) return 0;

        HashSet<String> visited = new HashSet<>();

        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);

        while (!q.isEmpty()) {
            int n = q.size();
            for(int k=0;k<n;k++) {
                String curr = q.poll();
                if (curr.equals(endWord)) {
                    return level;
                }

                char[] currArray = curr.toCharArray();
                for (int i = 0; i < currArray.length; i++) {
                    char old = currArray[i];
                    for(int j='a';j<='z';j++) {
                        currArray[i] = (char) j;
                        String next = new String(currArray);
                        if (!visited.contains(next) && set.contains(next)) {
                            q.offer(next);
                            visited.add(next);
                        }
                    }
                    currArray[i] = old;
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        
    }
    
}
