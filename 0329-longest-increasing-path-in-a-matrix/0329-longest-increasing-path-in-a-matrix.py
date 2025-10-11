class Solution:
    def longestIncreasingPath(self, matrix: List[List[int]]) -> int:
        n=len(matrix)
        m=len(matrix[0])
        memo=[[0]*m for i in range(n)]
        def dfs(i,j):
            if memo[i][j]!=0:
                return memo[i][j]
            best=1
            for dx,dy in [(0,-1),(0,1),(1,0),(-1,0)]:
                x=dx+i
                y=dy+j
                if 0<=x<n and 0<=y<m and matrix[x][y]>matrix[i][j]:
                    best=max(best,dfs(x,y)+1)
                    dfs(x,y)
            memo[i][j]=best
            return best
        maxi=0
        for i in range(n):
            for j in range(m):
                maxi=max(maxi,dfs(i,j))
        return maxi
        