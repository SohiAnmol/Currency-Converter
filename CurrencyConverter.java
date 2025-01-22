import java.util.Scanner;
/**
 *Assignment 3
 *Question 3
 * Anmoldeep Singh
 * 3149800
 */
public class CurrencyConverter
{
    public static void main(String[]args){
        Scanner kb=new Scanner(System.in);
        System.out.println("Select a currency:"+"\n[USD] United States Dollar"+"\n[JPY] Japanese Yen"+"\n[GBP] British Pound Sterling");
        String currency=kb.next();
        
        System.out.println("Select an option:"+"\n[A] Display conversion chart ($10-$1000 CAD)"+"\n[B] Enter Canadian dollar amount");
        String option=kb.next();
        
        System.out.println("CAD"+"\t"+currency);
        System.out.println("--------------");
        
        int count=0;       
        double usd=0.73;
        double jpy=105.42;
        double gbp=0.68;
        
        while(count<1000 && option.equals("A")){
            count+=10;
            
            if(currency.equals("USD")){
                double money1=count*usd;
                System.out.println(count+"\t"+String.format("%.2f",money1));
                if(count%100==0){
                    System.out.println("--------------");
                }
                
            }
            else if(currency.equals("JPY")){
                double money2=count*jpy;
                System.out.println(count+"\t"+String.format("%.2f",money2));
                
                if(count%100==0){
                    System.out.println("--------------");
                }
                
            }
            else if(currency.equals("GBP")){
                double money3=count*gbp;
                System.out.println(count+"\t"+String.format("%.2f",money3));
                
                if(count%100==0){
                    System.out.println("--------------");
                }
                
            }
        }
        
        if(option.equals("B")){
            System.out.println("Enter the Canadian Dollar amount");
            double bInput=kb.nextDouble();
            
            if(currency.equals("USD")){
                double money4=bInput*usd;
                System.out.println(bInput+" CAD = "+money4+" USD");
            }
            
            else  if(currency.equals("JPY")){
                double money4=bInput*jpy;
                System.out.println(bInput+" CAD = "+money4+" JPY");
            }
            
            else if(currency.equals("GBP")){
                double money4=bInput*gbp;
                System.out.println(bInput+" CAD = "+money4+" GBP");
            }
            
        }
    }
}
