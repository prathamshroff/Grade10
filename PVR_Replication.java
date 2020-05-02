import java.util.*;
public class PVR_ICSE 
{ 
public void menu()  
{
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME TO PVR CINEMAS");
System.out.println("ENJOY THE WORLD'S GREATEST MOVIES AT THE CHEAPEST RATE"); 
System.out.println("SPECIAL OFFER--ANY MOVIE ,ANY TIME, ANY DAY, Rs 200 ");
System.out.println("GET 10 POINTS PER TICKET");
System.out.println("COLLECT 250 POINTS AND WIN FREE MOVIE TICKETS"); 

System.out.println("ENTER THE LOCATION NUMBER ");  

System.out.println("1.PVR JUHU  "); 
System.out.println("2.PVR GOREGAON");
System.out.println("3.PVR MULUND "); 
System.out.println("4.PVR VASHI");
int c=sc.nextInt(); 


if(c==1) 
juhu(); 
else if(c==2) 
goregaon();
else if(c==3)
mulund();
else if(c==4) 
vashi();
else 
System.exit(0);
}

public void juhu()  
{ 
Scanner sc=new Scanner(System.in);

System.out.println("1.Ghajini: 10am,1pm,5pm,8pm,11pm"); 
System.out.println("2.Jumbo: 10am,1pm,5pm,8pm,11pm"); 
System.out.println("3.Madagascar 2: 10am,1pm,5pm,8pm,11pm"); 
System.out.println("4.Dostana: 10am,1pm,5pm,8pm,11pm");
System.out.println("5.Exit");
System.out.println("6.Main Menu");


double amt=0;
System.out.println("Enter your name"); 
String name= sc.nextLine(); 

System.out.println("Enter your address"); 
String add= sc.nextLine(); 

System.out.println("Enter the number of  tickets to be booked"); 
 int ti=sc.nextInt(); 

 System.out.println("Enter the movie number"); 
int movn =sc.nextInt(); 

switch(movn) 
{ 
case 1: 
{ 
System.out.println("Ghajini");
 
System.out.println("Enter the show time"); 
System.out.println("10:00"); 
System.out.println("13:00"); 
System.out.println("17:00");  
System.out.println("20:00"); 
System.out.println("21:00"); 
 int st=sc.nextInt(); 
 
System.out.println("##########################################");
System.out.println("#            PVR  CINEMAS                                     ");
System.out.println("#           MOVIE: GHAJINI                                   ");
System.out.println("#           TIME   :" +st +"                                     ");
System.out.println("#           TICKETS:" +  ti+"                                "); 
System.out.println("#           AMOUNT: " +(200* ti)+"                      ");
System.out.println("#           POINTS : " +(10* ti)+"                        ");
System.out.println("#           ENJOY THE MOVIE                              ");
System.out.println("#  TICKET TO BE DELIVERED WITHIN 24hrs     ");
System.out.println("##########################################");
}break;

case 2 : 
{
System.out.println("Jumbo");

System.out.println("Enter the show time"); 
System.out.println("10:00"); 
System.out.println("14:00"); 
System.out.println("17:00");  

System.out.println("20:00"); 
System.out.println("23:00"); 
 int st=sc.nextInt(); 
 

System.out.println("##########################################");
System.out.println("#            PVR  CINEMAS                                  ");
System.out.println("#           MOVIE: JUMBO                                 ");
System.out.println("#           TIME   :" +st +"                                 ");
System.out.println("#           TICKETS:" +  ti+"                         "); 
System.out.println("#           AMOUNT: " +(200* ti)+"               ");
System.out.println("#           POINTS : " +(10* ti)+"                  ");
System.out.println("#           ENJOY THE MOVIE                        ");
System.out.println("#  TICKET TO BE DELIVERED WITHIN 24hrs ");
System.out.println("##########################################");
}break;

case 3 : 
{
System.out.println("Madagascar 2");
 
System.out.println("Enter the show time"); 
System.out.println("10:00"); 
System.out.println("14:00"); 
System.out.println("17:00");  
System.out.println("20:00"); 
System.out.println("23:00"); 
 int st=sc.nextInt(); 
 

System.out.println("##########################################");
System.out.println("#            PVR  CINEMAS                                  ");
System.out.println("#           MOVIE: MADAGASCAR 2                      ");
System.out.println("#           TIME   :" +st +"                              ");
System.out.println("#           TICKETS:" +  ti+"                         "); 
System.out.println("#           AMOUNT: " +(200* ti)+"               ");
System.out.println("#           POINTS : " +(10* ti)+"                  ");
System.out.println("#           ENJOY THE MOVIE                        ");
System.out.println("#  TICKET TO BE DELIVERED WITHIN 24hrs  ");
System.out.println("##########################################");
}break; 


case 4 : 
{
System.out.println("Dostana");
 
System.out.println("Enter the show time"); 
System.out.println("10:00"); 
System.out.println("14:00"); 
System.out.println("17:00");  
System.out.println("20:00"); 
System.out.println("23:00"); 
 int st=sc.nextInt(); 
 

System.out.println("##########################################");
System.out.println("#            PVR  CINEMAS                              ");
System.out.println("#           MOVIE: DOSTANA                           ");
System.out.println("#           TIME   :" +st +"                              ");
System.out.println("#           TICKETS:" +  ti+"                         "); 
System.out.println("#           AMOUNT: " +(200* ti)+"               ");
System.out.println("#           POINTS : " +(10* ti)+"                  ");
System.out.println("#           ENJOY THE MOVIE                        ");
System.out.println("#  TICKET TO BE DELIVERED WITHIN 24hrs ");
System.out.println("##########################################");
}break;

case 5:
System.exit(0);
break;

case 6 : 
menu();
break;

default : 
System.out.println("WRONG CHOICE");
}
}

public void goregaon()  
{ 
Scanner sc=new Scanner(System.in);
System.out.println("1.Ghajini: 10am,1pm,5pm,8pm,11pm"); 
System.out.println("2.Jumbo: 10am,1pm,5pm,8pm,11pm"); 
System.out.println("3.Madagascar 2: 10am,1pm,5pm,8pm,11pm"); 
System.out.println("4.Dostana: 10am,1pm,5pm,8pm,11pm");
System.out.println("5.Exit");
System.out.println("6.Main Menu");
double amt=0;
System.out.println("Enter your name"); 
String name= sc.nextLine(); 
System.out.println("Enter your address"); 
String add= sc.nextLine(); 
System.out.println("Enter the number of  tickets to be booked"); 
 int ti=sc.nextInt(); 
 
System.out.println("Enter the movie number"); 
int movn =sc.nextInt(); 

switch(movn) 
{ 
case 1: 
{ 
System.out.println("Ghajini");
 
System.out.println("Enter the show time"); 
System.out.println("10:00"); 
System.out.println("13:00"); 
System.out.println("17:00");  
System.out.println("20:00"); 
System.out.println("21:00"); 
 int st=sc.nextInt(); 
 
System.out.println("##########################################");
System.out.println("#            PVR  CINEMAS                                  ");
System.out.println("#           MOVIE: GHAJINI                                ");
System.out.println("#           TIME   :" +st +"                                  ");
System.out.println("#           TICKETS:" +  ti+"                             "); 
System.out.println("#           AMOUNT: " +(200* ti)+"                   ");
System.out.println("#           POINTS : " +(10* ti)+"                      ");
System.out.println("#           ENJOY THE MOVIE                            ");
System.out.println("#  TICKET TO BE DELIVERED WITHIN 24hrs     ");
System.out.println("##########################################");
}break;

case 2 : 
{
System.out.println("Jumbo");
 
System.out.println("Enter the show time"); 
System.out.println("10:00"); 
System.out.println("14:00"); 
System.out.println("17:00");  
System.out.println("20:00"); 
System.out.println("23:00"); 
 int st=sc.nextInt(); 
 
System.out.println("##########################################");
System.out.println("#            PVR  CINEMAS                                  ");
System.out.println("#           MOVIE: JUMBO                                  ");
System.out.println("#           TIME   :" +st +"                                  ");
System.out.println("#           TICKETS:" +  ti+"                             "); 
System.out.println("#           AMOUNT: " +(200* ti)+"                   ");
System.out.println("#           POINTS : " +(10* ti)+"                      ");
System.out.println("#           ENJOY THE MOVIE                             ");
System.out.println("#  TICKET TO BE DELIVERED WITHIN 24hrs      ");
System.out.println("##########################################");
}break;

case 3 : 
{
System.out.println("Madagascar 2");
 
System.out.println("Enter the show time"); 
System.out.println("10:00"); 
System.out.println("14:00"); 
System.out.println("17:00");  
System.out.println("20:00"); 
System.out.println("23:00"); 
 int st=sc.nextInt(); 
 

System.out.println("##########################################");
System.out.println("#            PVR  CINEMAS                                  ");
System.out.println("#           MOVIE: MADAGASCAR 2                     ");
System.out.println("#           TIME   :" +st +"                                  ");
System.out.println("#           TICKETS:" +  ti+"                             "); 
System.out.println("#           AMOUNT: " +(200* ti)+"                   ");
System.out.println("#           POINTS : " +(10* ti)+"                      ");
System.out.println("#           ENJOY THE MOVIE                             ");
System.out.println("#  TICKET TO BE DELIVERED WITHIN 24hrs      ");
System.out.println("##########################################");
}break; 

case 4 : 
{
System.out.println("Dostana");
 
System.out.println("Enter the show time"); 
System.out.println("10:00"); 
System.out.println("14:00"); 
System.out.println("17:00");  
System.out.println("20:00"); 
System.out.println("23:00"); 
 int st=sc.nextInt(); 
 

System.out.println("##########################################");
System.out.println("#            PVR  CINEMAS                                  ");
System.out.println("#           MOVIE: DOSTANA                              ");
System.out.println("#           TIME   :" +st +"                                  ");
System.out.println("#           TICKETS:" +  ti+"                             "); 
System.out.println("#           AMOUNT: " +(200* ti)+"                   ");
System.out.println("#           POINTS : " +(10* ti)+"                      ");
System.out.println("#           ENJOY THE MOVIE                            ");
System.out.println("#  TICKET TO BE DELIVERED WITHIN 24hrs      ");
System.out.println("##########################################");
}break;

case 5:
System.exit(5);
break;

case 6 : 
menu();
break;
default : 
System.out.println("WRONG CHOICE");
}
}

public void mulund()  
{ 
Scanner sc=new Scanner(System.in);
System.out.println("1.Ghajini: 10am,1pm,5pm,8pm,11pm"); 
System.out.println("2.Jumbo: 10am,1pm,5pm,8pm,11pm"); 
System.out.println("3.Madagascar 2: 10am,1pm,5pm,8pm,11pm"); 
System.out.println("4.Dostana: 10am,1pm,5pm,8pm,11pm");
System.out.println("5.Exit");
System.out.println("6.Main Menu");
double amt=0;
System.out.println("Enter your name"); 
String name= sc.nextLine(); 
System.out.println("Enter your address"); 
String add= sc.nextLine(); 
System.out.println("Enter the number of  tickets to be booked"); 
 int ti=sc.nextInt(); 
 
System.out.println("Enter the movie number"); 
int movn =sc.nextInt(); 

switch(movn) 
{ 
case 1: 
{ 
System.out.println("Ghajini");
 
System.out.println("Enter the show time"); 
System.out.println("10:00"); 
System.out.println("13:00"); 
System.out.println("17:00");  
System.out.println("20:00"); 
System.out.println("21:00"); 
 int st=sc.nextInt(); 
 

System.out.println("##########################################");
System.out.println("#            PVR  CINEMAS                                  ");
System.out.println("#           MOVIE: GHAJINI                                ");
System.out.println("#           TIME   :" +st +"                                  ");
System.out.println("#           TICKETS:" +  ti+"                             "); 
System.out.println("#           AMOUNT: " +(200* ti)+"                   ");
System.out.println("#           POINTS : " +(10* ti)+"                      ");
System.out.println("#           ENJOY THE MOVIE                            ");
System.out.println("#  TICKET TO BE DELIVERED WITHIN 24hrs      ");
System.out.println("##########################################");
}break;


case 2 : 
{
System.out.println("Jumbo");
 
System.out.println("Enter the show time"); 
System.out.println("10:00"); 
System.out.println("14:00"); 
System.out.println("17:00");  
System.out.println("20:00"); 
System.out.println("23:00"); 
 int st=sc.nextInt(); 
 
System.out.println("##########################################");
System.out.println("#            PVR  CINEMAS                                  ");
System.out.println("#           MOVIE: JUMBO                                  ");
System.out.println("#           TIME   :" +st +"                                  ");
System.out.println("#           TICKETS:" +  ti+"                             "); 
System.out.println("#           AMOUNT: " +(200* ti)+"                   ");
System.out.println("#           POINTS : " +(10* ti)+"                      ");
System.out.println("#           ENJOY THE MOVIE                            ");
System.out.println("#  TICKET TO BE DELIVERED WITHIN 24hrs      ");
System.out.println("##########################################");
}break;

case 3 : 
{
System.out.println("Madagascar 2");
 
System.out.println("Enter the show time"); 
System.out.println("10:00"); 
System.out.println("14:00"); 
System.out.println("17:00");  
System.out.println("20:00"); 
System.out.println("23:00"); 
 int st=sc.nextInt(); 
 

System.out.println("##########################################");
System.out.println("#            PVR  CINEMAS                                  ");
System.out.println("#           MOVIE: MADAGASCAR 2                     ");
System.out.println("#           TIME   :" +st +"                                  ");
System.out.println("#           TICKETS:" +  ti+"                             "); 
System.out.println("#           AMOUNT: " +(200* ti)+"                   ");
System.out.println("#           POINTS : " +(10* ti)+"                      ");
System.out.println("#           ENJOY THE MOVIE                             ");
System.out.println("#  TICKET TO BE DELIVERED WITHIN 24hrs      ");
System.out.println("##########################################");
}break; 

case 4 : 
{
System.out.println("Dostana");
 
System.out.println("Enter the show time"); 
System.out.println("10:00"); 
System.out.println("14:00"); 
System.out.println("17:00");  
System.out.println("20:00"); 
System.out.println("23:00"); 
 int st=sc.nextInt(); 
 
System.out.println("##########################################");
System.out.println("#            PVR  CINEMAS                                  ");
System.out.println("#           MOVIE: DOSTANA                              ");
System.out.println("#           TIME   :" +st +"                                  ");
System.out.println("#           TICKETS:" +  ti+"                             "); 
System.out.println("#           AMOUNT: " +(200* ti)+"                   ");
System.out.println("#           POINTS : " +(10* ti)+"                      ");
System.out.println("#           ENJOY THE MOVIE                             ");
System.out.println("#  TICKET TO BE DELIVERED WITHIN 24hrs   #");
System.out.println("##########################################");
}break;
case 5:System.exit(5);break;
case 6 : 
{
menu();
}break;
default : 
System.out.println("WRONG CHOICE");
}}

public void vashi()  
{ 
Scanner sc=new Scanner(System.in);
System.out.println("1.Ghajini: 10am,1pm,5pm,8pm,11pm"); 
System.out.println("2.Jumbo: 10am,1pm,5pm,8pm,11pm"); 
System.out.println("3.Madagascar 2: 10am,1pm,5pm,8pm,11pm"); 
System.out.println("4.Dostana: 10am,1pm,5pm,8pm,11pm");
System.out.println("5.Exit"); 
System.out.println("6.Main Menu");
double amt=0;
System.out.println("Enter your name"); 
String name= sc.nextLine(); 
System.out.println("Enter your address"); 
String add= sc.nextLine(); 
System.out.println("Enter the number of  tickets to be booked"); 
 int ti=sc.nextInt(); 
 
System.out.println("Enter the movie number"); 
int movn =sc.nextInt(); 

switch(movn) 
{ 
case 1: 
{ 
System.out.println("Ghajini");
 
System.out.println("Enter the show time"); 
System.out.println("10:00"); 
System.out.println("13:00"); 
System.out.println("17:00");  
System.out.println("20:00"); 
System.out.println("21:00"); 
int st=sc.nextInt(); 
 
System.out.println("##########################################");
System.out.println("#            PVR  CINEMAS                                  ");
System.out.println("#           MOVIE: GHAJINI                                ");
System.out.println("#           TIME   :" +st +"                                  ");
System.out.println("#           TICKETS:" +  ti+"                             "); 
System.out.println("#           AMOUNT: " +(200* ti)+"                   ");
System.out.println("#           POINTS : " +(10* ti)+"                      ");
System.out.println("#           ENJOY THE MOVIE                            ");
System.out.println("#  TICKET TO BE DELIVERED WITHIN 24hrs     ");
System.out.println("##########################################");
}break;

case 2 : 
{
System.out.println("Jumbo");
 
System.out.println("Enter the show time"); 
System.out.println("10:00"); 
System.out.println("14:00"); 
System.out.println("17:00");  
System.out.println("20:00"); 
System.out.println("23:00"); 
 int st=sc.nextInt(); 
 
System.out.println("##########################################");
System.out.println("#            PVR  CINEMAS                                  ");
System.out.println("#           MOVIE: JUMBO                                  ");
System.out.println("#           TIME   :" +st +"                                  ");
System.out.println("#           TICKETS:" +  ti+"                             "); 
System.out.println("#           AMOUNT: " +(200* ti)+"                   ");
System.out.println("#           POINTS : " +(10* ti)+"                      ");
System.out.println("#           ENJOY THE MOVIE                            ");
System.out.println("#  TICKET TO BE DELIVERED WITHIN 24hrs   #");
System.out.println("##########################################");
}break;

case 3 : 
{
System.out.println("Madagascar 2");
 
System.out.println("Enter the show time"); 
System.out.println("10:00"); 
System.out.println("14:00"); 
System.out.println("17:00");  
System.out.println("20:00"); 
System.out.println("23:00"); 
 int st=sc.nextInt(); 
 
System.out.println("##########################################");
System.out.println("#            PVR  CINEMAS                                  ");
System.out.println("#           MOVIE: MADAGASCAR 2                     ");
System.out.println("#           TIME   :" +st +"                                  ");
System.out.println("#           TICKETS:" +  ti+"                             "); 
System.out.println("#           AMOUNT: " +(200* ti)+"                   ");
System.out.println("#           POINTS : " +(10* ti)+"                     ");
System.out.println("#           ENJOY THE MOVIE                      ");
System.out.println("#  TICKET TO BE DELIVERED WITHIN 24hrs   #");
System.out.println("##########################################");
}break; 

case 4 : 
{
System.out.println("Dostana");
 
System.out.println("Enter the show time"); 
System.out.println("10:00"); 
System.out.println("14:00"); 
System.out.println("17:00");  
System.out.println("20:00"); 
System.out.println("23:00"); 
 int st=sc.nextInt(); 

System.out.println("##########################################");
System.out.println("#            PVR  CINEMAS                                  ");
System.out.println("#           MOVIE: DOSTANA                              ");
System.out.println("#           TIME   :" +st +"                                  ");
System.out.println("#           TICKETS:" +  ti+"                            "); 
System.out.println("#           AMOUNT: " +(200* ti)+"                 ");
System.out.println("#           POINTS : " +(10* ti)+"                    ");
System.out.println("#           ENJOY THE MOVIE                          ");
System.out.println("#  TICKET TO BE DELIVERED WITHIN 24hrs    ");
System.out.println("##########################################");
}break;
case 5 : 
menu();
break;
default : 
System.out.println("WRONG CHOICE");
}
} 

public static void main() 
{ 
Scanner sc=new Scanner(System.in);
PVR_ICSE obj=new PVR_ICSE(); 
System.out.println("WELCOME TO PVR CINEMAS");
System.out.println("ENJOY THE WORLD'S GREATEST MOVIES AT THE CHEAPEST RATE"); 
System.out.println("SPECIAL OFFER--ANY MOVIE ,ANY TIME, ANY DAY, Rs 200 ");
System.out.println("GET 10 POINTS PER TICKET");
System.out.println("COLLECT 250 POINTS AND WIN FREE MOVIE TICKETS "); 



System.out.println("ENTER THE LOCATION NUMBER ");  
System.out.println("1.PVR JUHU  "); 
System.out.println("2.PVR GOREGAON");
System.out.println("3.PVR MULUND "); 
System.out.println("4.PVR VASHI "); 
int c =sc.nextInt(); 
do 
{ 
if(c==1) 
obj.juhu(); 
else if(c==2) 
obj.goregaon();
else if(c==3)
obj.mulund();
else if(c==4) 
obj.vashi(); 
} 
while(c!=1);
}
}
