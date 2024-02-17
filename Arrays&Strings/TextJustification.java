import java.util.ArrayList;
import java.util.List;

public class TextJustification {
        static int MAX_WIDTH;
        public List<String> fullJustify(String[] words, int maxWidth) {
            MAX_WIDTH = maxWidth;
            int n=words.length;
            List<String> result = new ArrayList<>();
            int i=0;
            while(i<n){
                int j            = i+1;
                int lettersCount = words[i].length();
                int spaceSlots   = 0;
    
                while(j<n && words[j].length()+1+spaceSlots+lettersCount<=MAX_WIDTH){
                    lettersCount += words[j].length();
                    spaceSlots+=1;
                    j++;
                }
    
                int remainingSlots = MAX_WIDTH-lettersCount;
    
                int eachWordSpace  = spaceSlots==0?0:remainingSlots/spaceSlots;
                int extraWordSpace = spaceSlots==0?0:remainingSlots%spaceSlots;
    
                if(j==n){  //Means we are on the lastline
                   eachWordSpace  = 1;
                   extraWordSpace = 0;
                }
    
                result.add(getFinalWorld(i,j,eachWordSpace,extraWordSpace,words));
                i=j;
            }
            return result;        
        }
    
        public static String getFinalWorld(int i, int j,int eachWordSpace, int extraWordSpace,String[] words){
            StringBuilder s = new StringBuilder();
    
            for(int k = i; k < j; k++) {
                s.append(words[k]);
    
                if(k == j-1)
                    continue;
    
                for(int space = 1; space <= eachWordSpace; space++)
                    s.append(" ");
    
                if(extraWordSpace > 0) {
                    s.append(" ");
                    extraWordSpace--;
                }
            }
    
            while(s.length() < MAX_WIDTH) {
                s.append(" ");
            }
            return s.toString();
        }

        public static void main(String[] args) {
            
            //String[] words = {}; 
            
        }
}
