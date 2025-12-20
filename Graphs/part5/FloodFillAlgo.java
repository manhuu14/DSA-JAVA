public class FloodFillAlgo {
class Solution { 
    
    public void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgCol) {
        // Base case: out of bounds, visited, or different color
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length 
            || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }

        // Mark as visited
        vis[sr][sc] = true;
        
        // Change color
        image[sr][sc] = color;

        // Recurse in 4 directions
        helper(image, sr, sc - 1, color, vis, orgCol); // left
        helper(image, sr, sc + 1, color, vis, orgCol); // right
        helper(image, sr - 1, sc, color, vis, orgCol); // up
        helper(image, sr + 1, sc, color, vis, orgCol); // down
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] vis = new boolean[image.length][image[0].length];
        int orgCol = image[sr][sc];

        // If the color is already the same, no need to fill
        if (orgCol == color) return image;

        helper(image, sr, sc, color, vis, orgCol);
        return image;
    }
}

}
