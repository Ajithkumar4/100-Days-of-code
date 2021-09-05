import java.io.*;
import java.util.*;
class Equalmatrix
{
	public static void main(String []arg)
	{
		int row1,col1,row2,col2;
	    boolean flag = true;
	    int x[][]=
	    {
			{9,2,1},
		    {3,0,4},
		    {0,0,7}
		};
	    int y[][]=
	    {
		    {9,2,1},
		    {3,0,4},
		    {0,0,7}
	    };
	    row1=x.length;
	    col1=x[0].length;
	    row2=y.length;
	    col2=y[0].length;
	    if(row1 != row2 || col1 != col2)
	    {
			System.out.println("Matrices are not equal");
		}
		else
		{
			for(int i=0; i<row1; i++)
			{
				for(int j=0; j<col1; j++)
				{
					if(x[i][j] !=y[i][j])
				    {
						flag = false;
						break;
					}
				}
			}
		    if(flag)
			    System.out.println("Matrices are equal");
		    else
			    System.out.println("Matrices are not equal");
		}
	}
}


