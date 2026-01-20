package conditionalstatment;
/* write a java program for access control a system grant access if user islogged in and either admin or has security level grater than =2 where 1 is highest security
use boolean,if ,and,or print access or denied*/
public class accesscontrol {
    public static void main(String args[]){
        boolean isloggedin= true;
        boolean isadmin= false;
        int securitylevel= 3;
       if(isloggedin && isadmin || securitylevel <=3) {
           System.out.println("access granted");
       }else{
               System.out.println("Access denied");
           }
       }
    }

