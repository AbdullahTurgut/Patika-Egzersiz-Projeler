package Giris;

import java.util.Scanner;

public class KullaniciGirisKontrol {
    public static void main(String[] args) {
        // Kullanıcı girişi kontrolü

        Scanner scanner = new Scanner(System.in);
        String userName;
        String mainPassword ="password" , password;
        String password2;

        System.out.println("Lütfen kullanıcı adını giriniz:");
        userName = scanner.nextLine();

        if(userName.equals("abdullah")){

            System.out.println("Lütfen şifreyi giriniz:");
            password = scanner.next();

            if(password.equals("password"))
                System.out.println("Giriş yaptınız.");
            else{
                System.out.println("Şifreniz yanlış!");
                System.out.println("Şifrenizi sıfırlamak ister misiniz?");
                System.out.println("(Y)es or (N)o");
                String answer = scanner.next();
                if(answer.toLowerCase().equals("y")){
                    System.out.println("Lütfen yeni şifrenizi giriniz:");
                    password2 = scanner.next();
                    if(mainPassword.equals(password2)){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }else{
                        System.out.println("Şifre oluşturuldu");
                    }
                }else{
                    System.out.println("Program sonlandı!");
                }
            }
        }

    }
}
