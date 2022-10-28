#include<stdio.h>
#include<math.h>
#define pi 3.14159

int main()
{
	int i,n;
	float dx,x[10],y[10],h,k,dmin,a,b;
	
	printf("\nEnter number of points to be generated : ");
	scanf("%d",&n);
	printf("\nEnter the centre of the ellipse : ");
	scanf("%f %f",&h,&k);
	printf("\nEnter the initial angle : ");
	scanf("%f",&dmin);
	printf("\nEnter the semi major axis a and semi minor axis b : ");
	scanf("%f %f",&a,&b);
	dmin=dmin*pi/180;
	x[0]=a*cos(dmin);
	y[0]=b*sin(dmin);
	dx=2*pi/n;
	printf("\nThe generated points are : ");
	
	for(i=1;i<n;i++)
	{
		x[i]=x[i-1]*cos(dx)-(y[i-1]*(a/b)*sin(dx));
		y[i]=(b/a)*x[i-1]*sin(dx)+(y[i-1]*cos(dx));
	}
	for(i=0;i<n;i++)
	{
		x[i]=x[i]+h;
		y[i]=y[i]+k;
		
		printf("\nP %d (%f, %f)",i,x[i],y[i]);
	}
	
	
	return 0;
}