#include<stdio.h>
#include<math.h>
#define pi 3.14159
void main()
{
    int i,n;
    float dx,x[10],y[10],r,dmin,a,b;
    printf("\nHow Many Points do u want to generate : ");
    scanf("%d",&n);
    printf("\nEnter The Center of Circle : ");
    scanf("%f%f",&a,&b);
    printf("\nEnter The Initial Angle : ");
    scanf("%f",&dmin);
    printf("\nEnter The Radius : ");
    scanf("%f",&r);
    dmin=(dmin*pi)/180;
    x[0]=r*cos(dmin);
    y[0]=r*sin(dmin);
    dx=(2*pi)/n;
    printf("\nThe Genereted Points Are : ");
    for(i=1;i<n;i++)
    {
        x[i]=(x[i-1]*cos(dx))-(y[i-1]*sin(dx));
        y[i]=(x[i-1]*sin(dx))+(y[i-1]*cos(dx));
    }
    for(i=0;i<n;i++)
    {
        x[i]=x[i]+a;
        y[i]=y[i]+b;
        printf("\nP%d (%.2f, %.2f)",i,x[i],y[i]);
    }
}
