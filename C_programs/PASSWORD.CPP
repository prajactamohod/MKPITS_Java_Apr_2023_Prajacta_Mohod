#include<stdio.h>
#include<conio.h>
void main()
{
int password,D=10;
while(D!=0)
{
printf("\n input the password:");
scanf("%d",&password);
if(password==1234)
{
printf("correct password");
D=0;
}
else
{
printf("incorrect password");
}
printf("\n");
}
getch();
}
