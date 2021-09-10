#include <stdio.h>
#include <conio.h>
int main()
{
	int English, Chemistry, Computers, Physics, Maths;
	float Total, Percentage;
	printf("Please Ener the Five Subjects Marks:\n");
	scanf("%d %d %d %d %d", &English, &Chemistry, &Computers, &Physics, &Maths);
	Total=English + Chemistry + Computers + Physics + Maths;
	Percentage=(Total/500)*100;
	printf("Total Marks = %.2f", Total);
	printf("Marks Percentage = %.2f",Percentage);
	if(Percentage >= 90)
	{
		printf("\n Pass Grade A");
	}
	else if(Percentage >= 80)
	{
		printf("\n Pass Grade B");
	}
	else if(Percentage >= 70)
	{
		printf("\n Pass Grade C");
	}
	else if(Percentage >= 55)
	{
		printf("\n Pass Grade D");
	}
	else if(Percentage >= 40)
	{
		printf("\n Pass Grade E");
	}
	else
	{
		printf("\n Fail");
	}
	return 0;
}