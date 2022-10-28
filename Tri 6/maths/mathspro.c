#include<stdio.h>
#include<math.h>
#define pi 3.14159

int main()
{
	int i,n;
	float dx,x[10],y[10],r,dmin,a,b;
	
	printf("\nEnter number of points to be generated : ");
	scanf("%d",&n);
	printf("\nEnter the centre of the circle : ");
	scanf("%f %f",&a,&b);
	printf("\nEnter the initial angle : ");
	scanf("%f",&dmin);
	printf("\nEnter the radius : ");
	scanf("%f",&r);
	dmin=dmin*pi/180;
	x[0]=r*cos(dmin);
	y[0]=r*sin(dmin);
	dx=2*pi/n;
	printf("\nThe generated points are : ");
	
	for(i=1;i<n;i++)
	{
		x[i]=x[i-1]*cos(dx)-y[i-1]*sin(dx);
		y[i]=x[i-1]*sin(dx)-y[i-1]*cos(dx);
	}
	for(i=0;i<n;i++)
	{
		x[i]=x[i]+a;
		y[i]=y[i]+b;
		
		printf("\nP %d (%f, %f)",i,x[i],y[i]);
	}
	
	
	return 0;
}