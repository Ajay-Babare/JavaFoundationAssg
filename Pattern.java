package practice;

public class Pattern 
{

	public static void main(String[] args) 
	{
		//code for pattern TELUSKO
        
        for(int i=1;i<=7;i++)
        {   
            //code for letter T
            for(int t=1;t<=7;t++)
            {
                if(i==1 || t==4)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
        
             System.out.print("  ");
            
            //code for letter E
            for(int j=1;j<=7;j++)
            {
                if(i==1 || j==1 || i==4 || i==7)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
            System.out.print("  ");
            
            //code for letter L
            for(int j=1;j<=7;j++)
            {
                if(j==1 || i==7)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
            System.out.print("  ");
            
            //code for letter U
            for(int j=1;j<=7;j++)
            {
                if(j==1 || i==7 || j==7)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
            System.out.print("  ");
          
            //code for letter S
            for(int j=1;j<=7;j++)
            {
                if(i==1 || (j==1 && i<=4) || i==4 || (j==7 && i>=4) || i==7)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
        
             System.out.print("  ");
             
              //code for letter K
            for(int j=1;j<=5;j++)
            {
                if(j==1 || (j==2 && i==4) || (j==3 && i==3) || (j==4 && i==2) || (j==5 && i==1) || (j==3 && i==5) || (j==4 && i==6) || (j==5 && i==7))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
        
             System.out.print("  ");
             
            //code for letter O
            for(int j=1;j<=7;j++)
            {
                if(i==1 || j==1 || i==7 || j==7)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
            System.out.println("  ");
          
        }
        
        System.out.println("  ");
        
        
        //code for pattern INEURON  
        
        for(int i=1;i<=7;i++)
        {    
            //code for letter I
            for(int j=1;j<=5;j++)
            {
                if(i==1 || j==3 || i==7)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
        
             System.out.print("  ");
             
            //code for letter N
            for(int j=1;j<=7;j++)
            {
                if(j==1 ||(i==2 && j==2)||(i==3 && j==3)||(i==4 && j==4)||(i==5 && j==5)||(i==6 && j==6) || j==7)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
            System.out.print("  ");
            
            //code for letter E
            for(int j=1;j<=7;j++)
            {
                if(i==1 || j==1 || i==4 || i==7)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
            System.out.print("  ");
            
            //code for letter U
            for(int j=1;j<=7;j++)
            {
                if(j==1 || i==7 || j==7)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
            System.out.print("  ");
            
            //code for letter R
            for(int j=1;j<=7;j++)
            {
                if(j==1 || i==1 || (j==7 && i<=4) || i==4 || (j==5 && i==5) || (j==6 && i==6) || (j==7 && i==7))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
            System.out.print("  ");
            
            //code for letter O
            for(int j=1;j<=7;j++)
            {
                if(i==1 || j==1 || i==7 || j==7)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
            System.out.print("  ");
            
            //code for letter N
            for(int j=1;j<=7;j++)
            {
                if(j==1 ||(i==2 && j==2)||(i==3 && j==3)||(i==4 && j==4)||(i==5 && j==5)||(i==6 && j==6) || j==7)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
        
             System.out.println("  ");
             
        }

	}

}
