import java.io.*;
import java.util.*;
class Check
{
    public String ddt(int f)
    {
        String sd[]={"","ONE ","TWO ","THREE ","FOUR ","FIVE ","SIX ","SEVEN ","EIGHT ","NINE "};
        String dd[]={"","TEN ","ELEVEN ","TWELVE ","THIRTEEN ","FOURTEEN ","FIFTEEN ","SIXTEEN ","SEVENTEEN ","EIGHTEEN ","NINETEEN "};
        String ddd[]={"","TWENTY ","THIRTY ","FORTY ","FIFTY ","SIXTY ","SEVENTY ","EIGHTY ","NINETY "};
        String iw2="";
        int r=f%100;
        if(r>=10&&r<=19)
            iw2=dd[r-9]+iw2;
        else if(r<=9)
            iw2=sd[r]+iw2;
        else
        {
            int f1=r%10;
            r/=10;
            int f2=r%10;
            iw2=ddd[f2-1]+sd[f1];
        }
        return iw2;
    }

    private String inwords(int d,int l)
    {        
        String iw="";
        String sd[]={"","ONE ","TWO ","THREE ","FOUR ","FIVE ","SIX ","SEVEN ","EIGHT ","NINE "};
        String td[]={"HUNDRED ","THOUSAND ","LAKH ","CRORE "};        
        if(d>=100)
        {
            String tc=Integer.toString(d);            
            int x;
            while(d>999)
            {
                if(l%2!=0)
                    --l;
                x=d/(int)Math.pow(10,l-1);
                iw=iw+ddt(x);
                switch(l)
                {
                    case 8:
                    case 6:
                    case 4:iw=iw+td[(l/2)-1];
                    break;
                }
                d%=Math.pow(10,l-1);
                l-=2;
            }
            int j=d/100;
            if(j!=0)
                iw=iw+sd[j]+td[0];
            d%=100;
            if(d!=0)
                iw=iw+"AND "+ddt(d);
        }
        else
            iw=iw+ddt(d);
        iw+="only";
        return(iw);
    }

    protected String forll(int l,char c)
    {
        String a="";
        for(int i=1;i<=l;++i)
            a+=c;
        return a;
    }

    private static int mr(int nr,int fn)
    {
        return((int)(Math.random()*nr)+fn);
    }

    public static void main(String args[])throws IOException
    {
        PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/welcome/Desktop/Cheque.DAT",true)));
        Scanner sc=new Scanner(System.in);
        Check o1=new Check();
        System.out.println("\f             Welcome to PRABHAT Bank");
        System.out.println("------------------------------------------------");
        System.out.println("Please check our Automatic Cheque Generator");
        System.out.print("Enter the Name/Institution infavour of whom you want to issue the cheque: ");
        String na=sc.nextLine().toUpperCase();
        boolean flag=true;
        while(flag)
        {
            System.out.print("\nEnter the amount : ");
            String str=sc.next();
            int l=str.length();
            int mo=Integer.parseInt(str);
            if(mo>0)
            {
                System.out.print("\f");
                System.out.println("**********************************************************************************************************************");
                System.out.println("*           ------------------                        -----------------------------                                  *");
                System.out.println("            A/C    Payee Only                                 Non Negotiable                                          ");
                System.out.println("*           ------------------                        -----------------------------                                  *");
                System.out.println("*                                                                                                                    *");
                System.out.println("     Pay  __"+na+"___");
                System.out.println("*                                                                                                                    *");
                if(mo==1)
                    System.out.println("     Rupee__"+o1.inwords(mo,l)+"____");
                else
                    System.out.println("     Rupees__"+o1.inwords(mo,l)+"____");
                System.out.println("*                                                                                                                    *");
                System.out.println("*                                                                                       _____"+o1.forll(l,'_')+"___          ");
                if(mo==1)
                    System.out.println("*                                                                                      | Re. "+mo+"/- |         ");
                else
                    System.out.println("*                                                                                      | Rs. "+mo+"/- |         ");
                System.out.println("*                                                                                      |_____"+o1.forll(l,'_')+"___|         ");
                System.out.println("*                                                                                                                    *");
                System.out.println("*  _________ ___________________                                                                                     *");
                System.out.println("* | A/C No. | "+mr(9000,1000)+" "+mr(9000,1000)+" "+mr(900,100)+" "+mr(900,100)+" |");
                System.out.println("* |_________|___________________|");
                System.out.println("*                                                                                                                    *");
                System.out.println("*  PRABHAT BANK PVT. LTD.                                                                                              *");
                System.out.println("*                                                                                                                    *");
                System.out.println("*  IFS CODE "+mr(900000000,100000000)+"                                                                                                *");
                System.out.println("**********************************************************************************************************************");
                pw.println("**********************************************************************************************************************");
                pw.println("*           ------------------                        -----------------------------                                  *");
                pw.println("            A/C    Payee Only                                 Non Negotiable                                          ");
                pw.println("*           ------------------                        -----------------------------                                  *");
                pw.println("*                                                                                                                    *");
                pw.println("     Pay  __"+na+"___");
                pw.println("*                                                                                                                    *");
                if(mo==1)
                    pw.println("     Rupee__"+o1.inwords(mo,l)+"____");
                else
                    pw.println("     Rupees__"+o1.inwords(mo,l)+"____");
                pw.println("*                                                                                                                    *");
                pw.println("*                                                                                       _____"+o1.forll(l,'_')+"___          ");
                if(mo==1)
                    pw.println("*                                                                                      | Re. "+mo+"/- |         ");
                else
                    pw.println("*                                                                                      | Rs. "+mo+"/- |         ");
                pw.println("*                                                                                      |_____"+o1.forll(l,'_')+"___|         ");
                pw.println("*                                                                                                                    *");
                pw.println("*  _________ ___________________                                                                                     *");
                pw.println("* | A/C No. | "+mr(9000,1000)+" "+mr(9000,1000)+" "+mr(900,100)+" "+mr(900,100)+" |");
                pw.println("* |_________|___________________|");
                pw.println("*                                                                                                                    *");
                pw.println("*  PRABHAT BANK PVT. LTD.                                                                                              *");
                pw.println("*                                                                                                                    *");
                pw.println("*  IFS CODE "+mr(900000000,100000000)+"                                                                                                *");
                pw.println("**********************************************************************************************************************");
                pw.println();
                pw.println();                
                pw.println();
                pw.close();
                flag=false;
            }
            else if(mo==0)
            {
                System.out.println("This is as good as a blank cheque. Please dont't waste paper.");
                flag=false;
            }
        }
    }
}   
