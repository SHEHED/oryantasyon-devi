// youtube : https://youtu.be/x3qLgPbL2Cs
package javaapplication49;
import java.util.Scanner;


public class JavaApplication49 {
  
    public static void main(String[] args) {
    /*SORU 1 :
     İkinci dereceden bir denklemin köklerini yazan bir program yazınız (ax²+bx+c) a ve b ve c değerleri klavyeden girilecektir. 
             
      
        Scanner sc = new Scanner(System.in); 
        System.out.println("(ax²+bx+c) ikinci dereceden bir denklemdir.\n Denklemdeki sabitleri aşağıdaki gibi sırayla giriniz"); 
        
        System.out.print("a değerini giriniz :"); 
        double a = sc.nextInt(); 
        System.out.print("b değerini giriniz   :"); 
        double b = sc.nextInt(); 
        System.out.print("c değerini giriniz   :"); 
        double c = sc.nextInt(); 
        //diskriminant (delta)r
        double delta = (b * b) - (4 * a * c); 
        
        if (delta > 0){ 
            double x1 = ((-1 * b) - Math.sqrt(delta)) / (2 * a); 
            double x2 = ((-1 * b) + Math.sqrt(delta)) / (2 * a); 
            System.out.println("x1= " + x1 + " x2= " + x2); 
        } 
        if (delta < 0){
            System.out.println("Denklemin Gerçel Kökü Yoktur."); 
        } 
        if (delta == 0){ 
            double x = (-1 * b) / (2 * a);
            System.out.println("Çakışık kökü var x1= x2= " + x); 
        }
   */    
   
       
       /*SORU 2 :
Kullanıcı tarafından girilen n sayının faktöriyelini hesaplayıp ekrana gösteren bir program hazırlayınız   

        
    Scanner input = new Scanner (System.in);  
    System.out.print("n değierini giriniz");
    int n=input.nextInt();
    int faktor=1;
    for(int i=1;i<=n;i++){
    faktor=faktor*i;
    }
    System.out.print(faktor);
    
*/
 
/*SORU 3 : 
Kullancı klavyeden 100 ile 500 arasında bir değer girmesi istenir.Kullancı belirlenen koşullarda uygun giriş yapana kadar 
"Lütfen belirtilen koşullara uygun giriş yapınız" uyarısı kullancıya gösterilecektir.Eğer kullancı uygun bir giriş yapmış ise ekrana
"Sınavın başlangıç saati 8:30'dur X dk sonra saat YY:ZZ olacaktır" şeklinde bir çıktı üretecek bir program yapınız.

        Scanner input = new Scanner (System.in);
        System.out.println("Sayac değerini giriniz");
        int sayac = input .nextInt();
        if(sayac>100 && sayac<500)  {
        System.out.println("Sınavın başlangıç saati 8:30'dur X dk sonra YY:ZZ olacaktır");
        }
        else {
        System.out.println("Lütfen belirtilen koşullara uygun giriş yapınız");
        }

*/

/*SORU 4 :
Kullanıcının klavyeden önce "boyunuzu cm olarak giriniz"
Sonra kilonuzu kg olarak giriniz şeklinde bir değer girmesi istenmektedir.
Eğer boy/kilo değeri 2'den küçük ise ekrana "Şişmam"; hesaplanan değer 2 ile 2.5 arasında ise "normal"; 
2.5'den büyük ise zayıf yazan program hazırlayınız.


Scanner input = new Scanner (System.in);
     System.out.println("Boyunuzu cm olarak giriniz");
     System.out.println("Kilonuzu kg olarak giriniz");
     double boy = input.nextDouble();
     double kilo = input.nextDouble();
  if(boy/kilo<2)   {
      System.out.println("Şişman");
  }
  if(boy/kilo>2 && boy/kilo<2.5)   {
      System.out.println("Normal");
  }
  if(boy/kilo>2.5)     {
      System.out.println("Zayıf");
  }  
   */ 




/*SORU 5 :
Vize notu, final notu klavyeden veriliyor.
Vize notu ve final notunun ortalamaya olan katkısı sırasıyla %40 ve %60 şeklindedir.
Ortalaması 50 ve üzerinde olan öğrenci o dersten BAŞARILI, diğer durumda BAŞARISIZ sayılacaktır.
Öğrencinin bu bilgilerle ortalamasını hesaplayan ve başarı durumunu gösteren bir program hazırlayınız.


Scanner input = new Scanner (System.in);
     System.out.println("Vize notunuzu giriniz");
     double vize = input.nextDouble();
     System.out.println("finel notunuzu giriniz");
      double finel = input.nextDouble();
      double ortalama =vize*0.4+finel*0.6;
      System.out.println("öğrencinin sınav ortalaması="+ortalama);
     if(ortalama>=50)   {
      System.out.println("Başarılı");
}
     else {
     System.out.println("Başarısız");
     }
      
*/



/*SORU 6 :
n klavyeden girilecek 1'den n değerine kadar sayıların toplamı döndüren programı yazınız.


   Scanner input = new Scanner (System.in);
        System.out.println("n değerini giriniz");
        int n = input.nextInt();
        int toplam=0;
        for(int i=0; i<=n; i++){
            toplam = toplam +i;
        }
        System.out.println(toplam);
        
*/

/*SORU 7 :
Kullanıcının klavyeden önce "pay değerini" sonra "payda değerini" giriniz şeklinde bir değer girmesi istenmektedir.
Eğer payda değeri pay değerinden daha büyük ise ekrana "basit kesir girdiniz";
eğer pay değeri payda değerine eşit ise "girdiniz değer bir tamsayıdır";
aksi taktirde "bileşik bir kesir girdiniz kesir değeri X tam Y/Z"
mesajını ekrana yazan bir program hazırlayınız.


Scanner input = new Scanner (System.in);
    System.out.println("pay değerini giriniz");
    double pay = input.nextDouble();
    System.out.println("payda değerini giriniz");
    double payda = input.nextDouble();
    
    if(pay<payda){
    System.out.println("Basit bir kesir girdiniz");
    }
    if(pay==payda){
    System.out.println("Girdiğiniz değer bir tamsayıdır");
    }
    if(pay>payda){
        System.out.println("Bileşik bir kesir girdiniz");
    }

*/


/*SORU 8 :
Yıldızlardan üçgen çizen programı yazınız.


Scanner input = new Scanner(System.in);
        int n=8;
 for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
*/

/*SORU 9 :
A'den M'e kader sayıların çarpımı yapan bir program yapınız.



  Scanner input = new Scanner(System.in);
        int n = input.nextInt();
 
        int m = 1;
        
        System.out.print("a sayıyı giriniz: ");
        n = input.nextInt();
        
        System.out.print("M = ");
        
        for (int i = 1; i <= n; i++)
        {
            System.out.print(i + ((i < n)?" * ": ""));
            m *= i;
        }
        
        System.out.println("\nM = " + m);
    }
    */

/*SORU 10 :
Yıldızlardan çizilien ve içi boş olan kare çiziniz.*/


      Scanner input = new Scanner(System.in);
        int n = input.nextInt();
 
    for (int i = 1; i <= n; i++)
        {
            if (i == 1 || i == n)
            {
                for (int j = 1; j <= n; j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                System.out.print("*");
                for (int k = 1; k <= n - 2; k++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
}