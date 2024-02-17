public class MaxPointsonaLine{

    // Brute Force
    public static int Method1(int points[][]){
        if(points.length==1) return 1;

        int n = points.length;
        int res = 0;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){

                int dy = points[j][1] - points[i][1]; 
                int dx = points[j][0] - points[i][0];

                int count = 2; // As we know 2 points already selected for slope
                
                for(int k=0;k<n;k++){
                    if(k!=i && k!=j){ // points should not repeat
                        int dy_ = points[k][1] - points[j][1]; 
                        int dx_ = points[k][0] - points[j][0];

                        if(dy*dx_ == dx*dy_){ // Matching both slope
                            count++;
                        } 
                    }
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}