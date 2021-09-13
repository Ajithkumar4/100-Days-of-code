#include <stdio.h>
#include <conio.h>
int main()
{
	int i,j,n;
	char ch;
	printf("Enter number of rows:");
	scanf("%d%c",&n);
	printf("Enter the symbol:");
	ch=getchar();
	i=1;
        while(i<=n)
	    {
		    j=i;
	   	        while(--j>0)
	   	        {
	   	        	printf(" ");
				}
		    if(i==1 || i==n)
		    {
			    j=1;
				while(j<=n)
				{
					printf("%c",ch);
					j++;
				}
			}
			else
			{
			    j=1;
	            while(j<=n)
	            {
	        	    if(j==1 || j==n)
	                printf("%c",ch);
	            else
	                printf(" ");
	            j++;
			    }    
			}
		    printf("\n");
		i++;
		}
	return 0;
}