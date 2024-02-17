import java.util.ArrayList;
import java.util.Stack;

public class CourseSchedule2 {

    public static boolean Method1_Util(ArrayList<Integer> graph[], int curr, int vis[], ArrayList<Integer> res){
        vis[curr] = 1;
        for(int i=0;i<graph[curr].size();i++){
            int des = graph[curr].get(i);
            if(vis[des]==0){
                if(Method1_Util(graph, des, vis, res)==false){
                    return false;
                }
            }
            if(vis[des]==1){
                return false;
            }
        }

        vis[curr] = 2;
        res.add(curr);
        return true;
    }
    
    @SuppressWarnings("unchecked")
    public static int[] Method1(int numCourses, int prerequisites[][]){
        int n = numCourses;
        if(prerequisites.length<=0) return new int[n];
        ArrayList<Integer> graph[] = new ArrayList[n];
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }        

        for(int i=0;i<prerequisites.length;i++){
            graph[prerequisites[i][0]].add(prerequisites[i][1]);
        }

        int vis[] = new int[n];
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                if(Method1_Util(graph, i, vis, res)==false){
                    return new int[n];
                }
            }
        }

        int ans[] = new int[n];
        for(int i=0;i<ans.length;i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {

        int numCourses = 2;
        int prerequisites[][] = {{0,1},{1,0}};

        int ans[] = Method1(numCourses, prerequisites);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}
