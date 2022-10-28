#include<stdio.h>

#include<math.h>
int i,j,n,p,q;
float d,dmin,x[100],y[100],dmax;
void main()
{
    printf("\nEnter How many number of points:");
    scanf("%d",&n);
    printf("\nEnter Co-ordinates of %d points:",n);
    for(i=0;i<n;i++)
    {
        printf("\nPoint %d:",i+1);
        scanf("%f%f",&x[i],&y[i]);
    }
    dmin=sqrt(((x[0]-x[1])*(x[0]-x[1]))+((y[0]-y[1])*(y[0]-y[1])));
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            d=sqrt(((x[i]-x[j])*(x[i]-x[j]))+((y[i]-y[j])*(y[i]-y[j])));
            printf("\nDistance between (%.2f,%.2f) and (%.2f,%.2f) is %f",x[i],y[i],x[j],y[j],d);
            if(d<dmin)
            {
                dmin=d;
                p=i;
                q=j;
            }
        }
    }
    printf("\n\n\nPoints Which are close are (%.2f,%.2f) and (%.2f,%.2f) is %f\n\n",x[p],y[p],x[q],y[q],dmin);
}
