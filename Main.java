import java.time.LocalDateTime;
import java.util.*;

interface Restaurant {
    void input();

    void output();
}

class getDetails implements Restaurant {
static  String name;
static   String e;
static  String c,fb;
static  double amount, t;
static   double sum = 0;
static   ArrayList<String> item = new ArrayList<String>();
static   ArrayList<Integer> quantity = new ArrayList<Integer>();
static  ArrayList<Integer> price = new ArrayList<Integer>();
static int billNo = 1;
    LocalDateTime ob = LocalDateTime.now();

    class calculate {
        void bill() {
            Scanner in = new Scanner(System.in);
            for (int i = 0; i < price.size(); i++) {
                sum += price.get(i);

            }
            System.out.println("Applying GST (10%) on total amount. ");
            {

                sum = sum + sum * 0.1;
            }
            System.out.println("If you want to give tip enter 1 else 0");
            int s = in.nextInt();
            if (s == 1) {
                System.out.println("Enter amount to give as a tip");
                t = in.nextInt();
            } else {
                t = 0;
            }
            amount = sum + t;
            System.out.println("Do you want to give Remarks, Yes for 1 and No for 0 ");
            int f = in.nextInt();
            if (f == 1) {
                System.out.println("Give your Remarks:");
                fb = in.next();
            } else {
                fb = "No Remarks";

            }
        }
    }

    
    public void input() {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = n.next();
        System.out.println("Enter your e-mail: ");
        e = n.next();
        
        System.out.println("Enter your contact number: ");
        c = n.next();
        
        billNo++;
        
    }
    
    public void output() {
        System.out.println("\n********BILL********");
        System.out.println("Bill No: "+billNo);
        System.out.println("\nName of the customer: " + name);
        System.out.println("\nEmail of the customer: " + e);
        System.out.println("\nContact Number of the customer: " + c);
        System.out.println("\nDate and time of purchasing "+ ob);
        System.out.println("\nCustomer's Remarks: "+fb);
        System.out.println("\nFood Ordered\t\t\tquantity(number of plates)\t\tPrice");

        for (int i = 0; i < item.size(); i++) {
            System.out.println(item.get(i) + "\t\t\t\t" + quantity.get(i)+"\t\t\t\t"+price.get(i));

        }
        System.out.println("Total amount paid INR " + amount + " including tip of INR " + t);

    
    }
}

class starter extends getDetails
{
    static String[][] starter1 = { { "Manchurian", "60" }, { "Spring Roll", "60" }, { "Chilly Cheese", "80" },
            { "Chilly Potato", "70" }, { "Tomato Soup", "60" }, { "Sweet Corn Soup", "70" }, { "Hara kabab", "90" },
            { "French Fries", "50" } };

    public void input() {
        System.out.println("______STARTER______");
        try {
            System.out.println("Serial Number\t\tDish Name------>(INR)Price");
            for (int i = 0; i < 8; i++)
                {
                    System.out.println(i + "\t\t\t" + starter1[i][0] +"------>" + starter1[i][1]);
 

                }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the serial number of the dish: ");
        int n = in.nextInt();
        System.out.println("Enter the quantity (number of plates): ");
        int q = in.nextInt();
        item.add(starter1[n - 1][0]);
        quantity.add(q);
        price.add(q * (Integer.parseInt(starter1[n - 1][1])));

    }
}
    class breakfast extends getDetails {
        static String[][] breakfast1 = { { "Aloo Parantha", "20" }, { "Idli Sambhar", "40" }, { "Dosa sambhar", "50" },
                { "Vada Sambhar", "40" }, { "Poha Namkeen", "40" }, { "Samosa-chutney", "15" },
                { "Grilled Sandwich", "90" }, { "Samosa-chole", "30" },
                { "Burger-fries", "120" }

        };

        public void input() {
            System.out.println("______BREAKFAST______");
            try {
                System.out.println("Serial Number\t\tDish Name------>(INR)Price");
                for (int i = 0; i < 9; i++)
                   {
                    System.out.println(i + "\t\t\t" + breakfast1[i][0] +"------>" + breakfast1[i][1]);
 

                    }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            Scanner iin = new Scanner(System.in);
            System.out.println("Enter the serial number of the dish: ");
            int n = iin.nextInt();
            System.out.println("Enter the quantity (number of plates): ");
            int q = iin.nextInt();
            item.add(breakfast1[n - 1][0]);
            quantity.add(q);
            price.add(q * (Integer.parseInt(breakfast1[n - 1][1])));
            

            
        }

    }

    class mainCourse extends getDetails {
        static String[][] mainCourse1 = { { "Butter Roti", "20" }, { "Fried Rice", "20" }, { "Dum Aloo", "150" },
                { "Shahi Paneer", "200" }, { "Palak Paneer", "190" }, { "Veg Kofta", "150" },
                { "Paneer Bhurji", "200" }, { "Kadhaai Paneer", "250" }, { "Zeera Aloo", "100" }, { "Dal Fry", "250" },
                { "Dal Makhani", "100" }, { "Veg Biryani", "150" }, { "Mix veg", "90" },

        };

        public void input() {
            System.out.println("______MAIN COURSE______");
            try {
                System.out.println("Serial Number\t\tDish Name------>(INR)Price");
                for (int i = 0; i < 13; i++)
                     {
                        System.out.println(i + "\t\t\t" + mainCourse1[i][0] +"------>" + mainCourse1[i][1]);

                    }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            Scanner iin = new Scanner(System.in);
            System.out.println("Enter the serial number of the dish: ");
            int n = iin.nextInt();
            System.out.println("Enter the quantity (number of plates): ");
            int q = iin.nextInt();
            item.add(mainCourse1[n - 1][0]);
            quantity.add(q);
            price.add(q * (Integer.parseInt(mainCourse1[n - 1][1])));
            
    

        }
    }

        class beverages extends getDetails {
            static String[][] beverages1 = { { "Coke", "20" }, { "Mojito", "40" }, { "Coffee", "20" }, { "Tea", "15" },
                    { "Lemonade", "20" }, { "Iced tea", "30" }, { "Milkshake", "40" }, { "Juice", "30" },
                    { "Water", "25" },

            };

            public void input() {
                System.out.println("______BEVERAGES______");
                try {
                    System.out.println("Serial Number\t\tDish Name------>(INR)Price");
                    for (int i = 0; i < 13; i++)
                         {
                            System.out.println(i + "\t\t\t" + beverages1[i][0] +"------>" + beverages1[i][1]);

                        }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e);
                }
                Scanner iin = new Scanner(System.in);
                System.out.println("Enter the serial number of the dish: ");
                int n = iin.nextInt();
                System.out.println("Enter the quantity (number of plates): ");
                int q = iin.nextInt();
                item.add(beverages1[n - 1][0]);
                quantity.add(q);
                price.add(q * (Integer.parseInt(beverages1[n - 1][1])));
                

            }
        }
            class sweets extends getDetails {
                static String[][] sweets1 = { { "Balushahi", "20" }, { "Laddoo", "50" },
                        { "Gulabjamun", "20" }, { "Jalebi", "15" }, { "Peda", "30" }, { "Barfi", "50" },
                        { "Pastery", "40" }, { "Milkcake", "50" }, { "Ice-Cream", "35" }, { "Rasmalai", "45" }

                };

                public void input() {
                    System.out.println("______SWEETS______");
                    try {
                        System.out.println("Serial Number\t\tDish Name------>(INR)Price");
                        for (int i = 0; i < 10; i++)
                                System.out.println(i + "\t\t\t" + sweets1[i][0] +"------>" + sweets1[i][1]);

            

                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e);
                    }
                    Scanner iin = new Scanner(System.in);
                    System.out.println("Enter the serial number of the dish: ");
                    int n = iin.nextInt();
                    System.out.println("Enter the quantity (number of plates): ");
                    int q = iin.nextInt();
                    item.add(sweets1[n - 1][0]);
                    quantity.add(q);
                    price.add(q * (Integer.parseInt(sweets1[n - 1][1])));
                
        

                    

                }
            }


public class main1 {
    int a;
    Scanner in = new Scanner(System.in);
    void exitt()
    {
        
            do
        {
        System.out.println("*-*-*-*-*-*Welcome to JAVA Restuarant*-*-*-*-*-*");
        System.out.println("******Food Menu******");
        System.out.println("\t1. Starter");
        System.out.println("\t2. Breakfast");
        System.out.println("\t3. Main Course");
        System.out.println("\t4. Sweets");
        System.out.println("\t5. Beverages");
        System.out.println("\t0. Check Out");
        a=in.nextInt();
   
    

        if (a==1)
        {
        getDetails aa=new starter();
        aa.input();
        }
        else if(a==2)

        {
        getDetails bb=new breakfast();
        bb.input();
        }
        else if(a==3)
        {
        getDetails cc=new mainCourse();
        cc.input();
        }
        else if(a==4)
        {
        getDetails dd=new sweets();
        dd.input();
        }
        else if(a==5)
        {
        getDetails ee=new beverages();
        ee.input();

        }
        else if(a==0)
        {
        getDetails xy =new getDetails();

       if(xy.price.size()!=0)
       {
           getDetails.calculate xx= xy.new calculate();
           xx.bill();
           xy.output();
       }
       System.exit(0); 
        }
        else
        {
        System.out.println("Please enter valid number!");
        main1 zz=new main1();
        zz.exitt();



        
        }
    }
    while(true);
}

public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    int a;
    getDetails b=new getDetails();
    b.input();   
    main1 obj=new main1();
    obj.exitt();


    

 }



}

