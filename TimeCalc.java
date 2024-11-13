public class TimeCalc 
{
    public static void main(String[] args) 
    {
        int Nhours,Nminutes,Tminutes,Thours=0;
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int AddMin =   Integer.parseInt(args[1]);
        Tminutes= ((hours*60)+minutes+AddMin);
        Thours=Tminutes/60;
        Nhours=Thours%24;
        Nminutes=Tminutes-(Thours*60);
        if(Nhours<10)
        {
            if(Nminutes<10)
            {
                System.out.println("0"+Nhours+":0"+Nminutes);
            }
            else
            { 
                System.out.println("0"+Nhours+":"+Nminutes);

            }
        }
        else
        {
            if(Nminutes<10)
            {
                System.out.println(Nhours+":0"+Nminutes);
            }
            else
            {
                System.out.println(Nhours+":"+Nminutes);

            }

        }
       


    }
}
