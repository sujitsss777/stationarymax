import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Stationery[] f=new Stationery[n];
        for(int i=0;i<n;i++){
            int id=sc.nextInt();
            int qty=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            
            int price=sc.nextInt();
            //sc.nextLine();
            f[i]=new Stationery(id,qty,name,price);
        }
    int chid=sc.nextInt();
        Stationery ans=findStationeryWithMaximumPrice(f);
        if(ans!=null){
            System.out.println("id-"+ans.id);
            System.out.println("quantity-"+ans.qty);
            System.out.println("name-"+ans.name);
            System.out.println("price-"+ans.price);
        }
        else{
            System.out.println("No Stationery found with mentioned attribute");
        }
        Stationery ans1=searchStationeryById(f, chid);
        if(ans1!=null){
            System.out.println("id-"+ans1.id);
            System.out.println("quantity-"+ans1.qty);
            System.out.println("name-"+ans1.name);
            System.out.println("price-"+ans1.price);
        }
        else{
            System.out.println("No Stationery found with mentioned attribute");
        }
    }
    
    public static Stationery findStationeryWithMaximumPrice(Stationery[] a)
        {
            Stationery ans=null;
            if(a.length==0)return null;
            int l=a.length;
            int maxi=a[0].price;
            for(int i=0;i<l;i++){
                if((a[i].price)>maxi){
                    maxi=a[i].price;
                    ans=a[i];
                
                }
            }
              return ans;          
       }
        public static Stationery searchStationeryById(Stationery[] a,int id1)
        {
            Stationery ans1=null;
            for(int i=0;i<a.length;i++){
                if(a[i].id==id1){
                    ans1=a[i];
                }
            }
            return ans1;
        
        }

}

 class Stationery {
     int id;
        int qty;
        String name;
        int price;
        Stationery(int id,int qty,String name,int price){
            this.id=id;
            this.qty=qty;
            this.name=name;
            this.price=price;
        }
}
