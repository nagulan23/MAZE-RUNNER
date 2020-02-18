package projects;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.border.LineBorder;
class Maze_runner
{
    static int n,m,c,a1,b1,f,d[][]=new int[1000][1000],e[]=new int[100],k=0;
    
    void left(int a,int b,int x[][])
    {
        f=1;
        int i,j;
        if(a1==a&&b1==b)
            {
                x[a][b]=8;
                c=0;
                for(i=0;i<n;i++)
                {
                    for(j=0;j<m;j++)
                    {
                        d[(k*n)+i][j]=x[i][j];
                        if(x[i][j]==8)
                           c++;
                    }
                }
                e[k]=c;
                k++;
            }
        else {
            int v[][]=new int[n][m];
            x[a][b]=8;
            for(i=0;i<n;i++)
            {
              for(j=0;j<m;j++)
              {
                  v[i][j]=x[i][j];
              }
            }
            if(a-1>=0&&x[a-1][b]==1)
                up(a-1,b,x);
            for(i=0;i<n;i++)
            {
              for(j=0;j<m;j++)
              {
                  x[i][j]=v[i][j];
              }
            }    
            if(a+1<n&&x[a+1][b]==1)
                down(a+1,b,x);
            for(i=0;i<n;i++)
            {
              for(j=0;j<m;j++)
              {
                  x[i][j]=v[i][j];
              }
            }    
            if(b-1>=0&&x[a][b-1]==1)
                left(a,b-1,x);
            for(i=0;i<n;i++)
            {
              for(j=0;j<m;j++)
              {
                  x[i][j]=v[i][j];
              }
            }    
            if(b+1<m&&x[a][b+1]==1)
                right(a,b+1,x);}
    }

    void right(int a,int b,int x[][])
    {
        f=2;
        int i,j;
        if(a1==a&&b1==b)
        {
            x[a][b]=8;
            c=0;
                for(i=0;i<n;i++)
                {
                    for(j=0;j<m;j++)
                    {
                        d[(k*n)+i][j]=x[i][j];
                        if(x[i][j]==8)
                           c++;
                    }
                }
                e[k]=c;
                k++;
            }
        else {
            int v[][]=new int[n][m];
            x[a][b]=8;
            for(i=0;i<n;i++)
            {
              for(j=0;j<m;j++)
              {
                  v[i][j]=x[i][j];
              }
            }
            if(a-1>=0&&x[a-1][b]==1)
                up(a-1,b,x);
            for(i=0;i<n;i++)
            {
              for(j=0;j<m;j++)
              {
                  x[i][j]=v[i][j];
              }
            }     
            if(a+1<n&&x[a+1][b]==1)
                down(a+1,b,x);
            for(i=0;i<n;i++)
            {
              for(j=0;j<m;j++)
              {
                  x[i][j]=v[i][j];
              }
            }     
            if(b-1>=0&&x[a][b-1]==1)
                left(a,b-1,x);
            for(i=0;i<n;i++)
            {
              for(j=0;j<m;j++)
              {
                  x[i][j]=v[i][j];
              }
            }     
            if(b+1<m&&x[a][b+1]==1)
                right(a,b+1,x);}
    }

    void up(int a,int b,int x[][])
    {
        f=3;
        int i,j;
        if(a1==a&&b1==b)
        {
            x[a][b]=8;
            c=0;
                for(i=0;i<n;i++)
                {
                    for(j=0;j<m;j++)
                    {
                        d[(k*n)+i][j]=x[i][j];
                        if(x[i][j]==8)
                           c++;
                    }
                }
                e[k]=c;
                k++;
            }
        else {
            int v[][]=new int[n][m];
            x[a][b]=8;
            for(i=0;i<n;i++)
            {
              for(j=0;j<m;j++)
              {
                  v[i][j]=x[i][j];
              }
            }
            if(a-1>=0&&x[a-1][b]==1)
                up(a-1,b,x);
            for(i=0;i<n;i++)
            {
              for(j=0;j<m;j++)
              {
                  x[i][j]=v[i][j];
              }
            }     
            if(a+1<n&&x[a+1][b]==1)
                down(a+1,b,x);
            for(i=0;i<n;i++)
            {
              for(j=0;j<m;j++)
              {
                  x[i][j]=v[i][j];
              }
            }     
            if(b-1>=0&&x[a][b-1]==1)
                left(a,b-1,x);
            for(i=0;i<n;i++)
            {
              for(j=0;j<m;j++)
              {
                  x[i][j]=v[i][j];
              }
            }     
            if(b+1<m&&x[a][b+1]==1)
                right(a,b+1,x);}
    }

    void down(int a,int b,int x[][])
    {
        f=4;
        int i,j;
        if(a1==a&&b1==b)
        {
            x[a][b]=8;
            c=0;
                for(i=0;i<n;i++)
                {
                    for(j=0;j<m;j++)
                    {
                        d[(k*n)+i][j]=x[i][j];
                        if(x[i][j]==8)
                           c++;
                    }
                }
                e[k]=c;
                k++;
            }
        else {
            int v[][]=new int[n][m];
            x[a][b]=8;
            for(i=0;i<n;i++)
            {
              for(j=0;j<m;j++)
              {
                  v[i][j]=x[i][j];
              }
            }
            if(a-1>=0&&x[a-1][b]==1)
                up(a-1,b,x);
            for(i=0;i<n;i++)
            {
              for(j=0;j<m;j++)
              {
                  x[i][j]=v[i][j];
              }
            }     
            if(a+1<n&&x[a+1][b]==1)
                down(a+1,b,x);
            for(i=0;i<n;i++)
            {
              for(j=0;j<m;j++)
              {
                  x[i][j]=v[i][j];
              }
            }     
            if(b-1>=0&&x[a][b-1]==1)
                left(a,b-1,x);
            for(i=0;i<n;i++)
            {
              for(j=0;j<m;j++)
              {
                  x[i][j]=v[i][j];
              }
            }     
            if(b+1<m&&x[a][b+1]==1)
                right(a,b+1,x);}
    }

    public static void main(String args[])throws IOException
    {
        int i,j,a,b,min;
        Scanner ob=new Scanner(System.in);
        Maze_runner ss=new Maze_runner();
        n=ob.nextInt();
        m=ob.nextInt();
        int s[][]=new int[n][m];
        int h[][]=new int[n][m];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                s[i][j]=ob.nextInt();
                h[i][j]=s[i][j];
            }
        }
        a=ob.nextInt();
        b=ob.nextInt();
        a1=ob.nextInt();
        b1=ob.nextInt();
        s[a][b]=8;
        h[a][b]=8;
        if(a-1>=0&&s[a-1][b]==1)
            ss.up(a-1,b,s);
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                s[i][j]=h[i][j];
            }
        }
        if(a+1<n&&s[a+1][b]==1)
            ss.down(a+1,b,s);
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                s[i][j]=h[i][j];
            }
        }
        if(b-1>=0&&s[a][b-1]==1)
            ss.left(a,b-1,s);
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                s[i][j]=h[i][j];
            }
        }
        if(b+1<m&&s[a][b+1]==1)
            ss.right(a,b+1,s);
        min=0;
        for (i = 1; i <k; i++)
        {
                if (e[i]<e[min])
                    min=i;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
            	int num=d[(min*n)+i][j];
            	if(num==8)
            		System.out.print("* ");
            	else if(num==1)
            		System.out.print("1 ");
            	else
            	System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}