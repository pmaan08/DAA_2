import java.util.*;

public class Matrix 
{
    private final int v ;
    private int[][] adj_matrix;

    public Matrix(int ve)
    {
        v = ve;
        adj_matrix = new int[v + 1][v + 1];
    }
    public void edge( int beg , int end , int e)
    {
        adj_matrix[beg][end]=e;
    }
    public int printEdge(int beg , int end)
    {
        return adj_matrix[beg][end]; 
    }
    public static void main(String []args)
    {
        int v,e,count =1 , start =0 , end =0;
        Matrix graph;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of verties");
        v = sc.nextInt();
        System.out.println("Enter the number of edges");
        e = sc.nextInt();

        graph = new Matrix(v);

        System.out.println("Enter the edges: <start> <end>");
        while(count <= e)
        {
            start = sc.nextInt();
            end = sc.nextInt();
            graph.edge(start , end , 1);
            count++;
        }

        System.out.println("The adjacency graph is: ");
        System.out.print("  ");
        //Outline layer for number of rows and columns in the matrix
        for(int i = 1 ; i <= v ; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        //Elements of the matrix
        for (int i = 1 ; i <= v ; i++)
        {
            System.out.print(i + " ");
            for(int j = 1 ; j <= v ;j++ )
            {
                System.out.print(graph.printEdge(i,j) + " ");
            }
            System.out.println();
        }
    }
}



    