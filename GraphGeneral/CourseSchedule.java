import java.util.*;

public class CourseSchedule {

    public static void create(ArrayList<Integer>graph[], int[][] prerequisites){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0;i<prerequisites.length;i++){
            graph[prerequisites[i][0]].add(prerequisites[i][1]);        
        }

    }

    private static boolean Method1_Util(ArrayList<Integer> graph[], int curr, boolean vis[], boolean stack[]){
        vis[curr]   = true;
        stack[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            int des = graph[curr].get(i);
            if(stack[des]){
                return true;
            }
            else if(!vis[des] && Method1_Util(graph, des, vis, stack)){
                return true;                
            }
        }
        stack[curr] = false;
        return false;
    }

    @SuppressWarnings("unchecked")
    public static boolean Method1(int numCourses, int[][] prerequisites){

        if(prerequisites.length<=0){
            return false;
        }

        boolean stack[] = new boolean[numCourses];
        boolean vis[]   = new boolean[numCourses];

        ArrayList<Integer> graph[] = new ArrayList[numCourses];
        create(graph, prerequisites);

        for(int i=0;i<numCourses;i++){
            if(Method1_Util(graph, i, vis, stack)){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){

        int numsCourses=2;
        int prerequisites[][] = {{1,0}};
        Method1(numsCourses,prerequisites);



    }
}
