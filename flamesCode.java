package mymodules.codes;

import java.io.*;
import java.lang.*;
public class flamesCode {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your name:");
        StringBuffer one = new StringBuffer(br.readLine());

        System.out.println("enter your partner name:");
        StringBuffer two= new StringBuffer(br.readLine());

         for( int i=0;i<one.length();i++){
             char a=0,b=0;
             for(int j=0;j<two.length();j++){
                 a= one.charAt(i);
                 b= two.charAt(j);
                 if (a==b){
                     one.deleteCharAt(i);
                     two.deleteCharAt(j);
                     i++;
                     j++;
                 }
             }
         }
         /*
        int sum=one.length()+ two.length();
        System.out.println("word length is:"+sum);
        StringBuffer three=new StringBuffer("FLAMES");

        for(int i=0;i<5;i++) {
            int n = -1, l = 0,p = 0;
            String temp;
            for(int j=1;j<=sum;j++){
                n++;
                i++;
                if(n>three.length()-1){
                    char y=three.charAt(p);
                    if(l==sum){
                        three.deleteCharAt(p);
                        temp=three.substring(p,three.length());
                        System.out.println(temp);
                        three.delete(p,three.length());
                        System.out.println(three);
                        three.insert(0,temp);
                        System.out.println(three);
                        break;
                    }
                    else{
                        p++;
                        if(p==three.length()){
                            p=0;
                        }
                    }
                }
                else{
                    char y=three.charAt(n);
                    if(l==sum){
                        three.deleteCharAt(n);
                        temp=three.substring(n,three.length());
                        System.out.println(temp);
                        three.delete(n,three.length());
                        System.out.println(three);
                        three.insert(0,temp);
                        System.out.println(three);
                        break;
                    }
                }
            }
        }

         */

        String x1=new String(one.toString());
        String x2=new String(two.toString());
        int i1=0,i2=0;
        for (int i=0;i<one.length();i++){
            if(one.charAt(i)!='0'){
                System.out.println(" "+one.charAt(i));
                i1 += 1;
            }
        }
        System.out.println("first name:" +i1);

        for (int i=0;i<two.length();i++){
            if(two.charAt(i)!='0'){
                System.out.println(" "+two.charAt(i));
                 i2 += 1;
            }
        }
        System.out.println("first name:" +i2);

        String temp="0";
        int sum=one.length()+ two.length();
        System.out.println("word length is:"+sum);

        System.out.println("enter the game name (flames):");
        StringBuffer three= new StringBuffer(br.readLine());

         if(three.length()!=0){
             int x=sum%three.length();
             if(x!=0){
                 temp= three.substring(x)+three.substring(0,x-1);
             }
             else{
                 temp= three.substring(0,three.length()-1);
             }
         }
         three=new StringBuffer(temp);
         char flames_char=three.charAt(0);
         switch(flames_char){
             case 'f':
                 System.out.println("just friends...\uD83D\uDE00...try another partner..");
                 break;
             case 'l':
                 System.out.println("lovers...\uD83D\uDC8F...ohhoo..");
                 break;
             case 'a':
                 System.out.println("affection..\uD83E\uDD17...keep it on..");
                 break;
             case 'm':
                 System.out.println("marriage...\uD83D\uDC70\uD83E\uDD35...good luck..");
                 break;
             case 'e':
                 System.out.println("enemies...\uD83D\uDE21...stay away..");
                 break;
             case 's':
                 System.out.println("siblings...\uD83E\uDD72...soo sad..better luck next time..");
                 break;
         }

    }
}
