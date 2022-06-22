class Solution {
    public int findCircleNum(int[][] isConnected) {
        int ans=0;
        
        int nodes = isConnected.length;
        int visited[] = new int[nodes];
        
        for(int i = 0; i<nodes;i++)
        {
            
            if(visited[i] == 0){
                visited[i]=1;
                dfs(isConnected,i,visited);
                ans++;
            }
            
        }
        
        return ans;
    }
    public void dfs(int[][] isConnected, int  i , int[] visited){
        
        int[] adj = isConnected[i];
        for(int j=0 ; j <isConnected.length ; j++ ){
            if(adj[j]==1 && visited[j] == 0  ){
                visited[j]=1;
                dfs(isConnected,j,visited);
            }
        }
    }
}