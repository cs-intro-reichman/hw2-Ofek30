// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) 
        {
                String word=args[0];
                boolean x;
                
                String Uword = word.toUpperCase();
               
                int Times= Integer.parseInt(args[1]);
                
                
               for(int i=0;i<Times+1;i++)
               {

               
                switch (Uword.charAt(i)) 
                {
                        case 'A' :

                        x=true;
                        break;
                        case 'E':
                        
                                x=true;
                        break;
                        
                        case 'F':
                        x=true;
                        break;
                        case 'H':
                        x=true;
                        break;
                        case 'I':
                        x=true;
                        break;
                        case 'L':
                        x=true;
                        break;
                        case 'M':
                        x=true;
                        break;
                        case 'N':
                        x=true;
                        break;
                        case 'O':
                        x=true;
                        break;
                        case 'R':
                        x=true;
                        break;
                        case 'S':
                        x=true;
                        break;
                        case 'X':
                        x=true;
                                
                                break;
                
                        default:
                        x=false;
                                break;
                }
                if(x)
                {
                System.out.println("Give me an " +Uword.charAt(i)+": " + Uword.charAt(i)+"!");
                }
                else
                {
                        System.out.println("Give me a  " +Uword.charAt(i)+": " + Uword.charAt(i)+"!");
                }
                }
                
                System.out.println("What does that spell?");
                for(int ii=0;ii<Times;ii++)
                {
                        System.out.println(Uword+"!!!");
                }

        }}

        
