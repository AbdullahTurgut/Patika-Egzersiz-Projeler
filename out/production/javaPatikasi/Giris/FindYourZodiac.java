package Giris;

import java.util.Scanner;

public class FindYourZodiac {
    public static void main(String[] args) {
        /*
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart

        Ödev
        Aynı örneği switch-case kullanmadan yapınız.
*/
        Scanner scanner = new Scanner(System.in);

        int month, day;

        System.out.println("Burcunuzu öğrenmek için gerekli bilgileri giriniz:");

        System.out.print("Lütfen doğduğunuz ayı giriniz: ");
        month = scanner.nextInt();

        System.out.print("Lütfen doğduğunuz günü giriniz: ");
        day = scanner.nextInt();

        if(month >= 1 && month <= 12){
            if( month == 1){
                if(day >= 1 && day <= 31){
                    if(day < 22){
                        System.out.println("Oğlak burcusunuz.");
                    }else
                        System.out.println("Kova burcusunuz.");
                }else
                    System.out.println("Geçersiz bir gün girdiniz!");
            }else if(month == 2){
                if(day >= 1 && day <= 28){
                    if(day < 20){
                        System.out.println("Kova burcusunuz.");
                    }else
                        System.out.println("Balık burcusunuz.");
                }else
                    System.out.println("Geçersiz bir gün girdiniz!");
            }else if(month == 3){
                if(day >= 1 && day <= 31){
                    if(day < 21){
                        System.out.println("Balık burcusunuz.");
                    }else
                        System.out.println("Koç burcusunuz.");
                }else
                    System.out.println("Geçersiz bir gün girdiniz!");
            }else if(month == 4){
                if(day >= 1 && day <= 30){
                    if(day < 21){
                        System.out.println("Koç burcusunuz.");
                    }else
                        System.out.println("Boğa burcusunuz.");
                }else
                    System.out.println("Geçersiz bir gün girdiniz!");
            }else if(month == 5){
                if(day >= 1 && day <= 31){
                    if(day < 22){
                        System.out.println("Boğa burcusunuz.");
                    }else
                        System.out.println("İkizler burcusunuz.");
                }else
                    System.out.println("Geçersiz bir gün girdiniz!");
            }else if(month == 6){
                if(day >= 1 && day <= 30){
                    if(day < 23){
                        System.out.println("İkizler burcusunuz.");
                    }else
                        System.out.println("Yengeç burcusunuz.");
                }else
                    System.out.println("Geçersiz bir gün girdiniz!");
            }else if(month == 7){
                if(day >= 1 && day <= 31){
                    if(day < 23){
                        System.out.println("Yengeç burcusunuz.");
                    }else
                        System.out.println("Aslan burcusunuz.");
                }else
                    System.out.println("Geçersiz bir gün girdiniz!");
            }else if(month == 8){
                if(day >= 1 && day <= 30){
                    if(day < 23){
                        System.out.println("Aslan burcusunuz.");
                    }else
                        System.out.println("Başak burcusunuz.");
                }else
                    System.out.println("Geçersiz bir gün girdiniz!");
            }else if(month == 9){
                if(day >= 1 && day <= 30){
                    if(day < 23){
                        System.out.println("Başak burcusunuz.");
                    }else
                        System.out.println("Terazi burcusunuz.");
                }else
                    System.out.println("Geçersiz bir gün girdiniz!");
            }else if(month == 10){
                if(day >= 1 && day <= 30){
                    if(day < 22){
                        System.out.println("Terazi burcusunuz.");
                    }else
                        System.out.println("Akrep burcusunuz.");
                }else
                    System.out.println("Geçersiz bir gün girdiniz!");
            }else if(month == 11){
                if(day >= 1 && day <= 30){
                    if(day < 22){
                        System.out.println("Akrep burcusunuz.");
                    }else
                        System.out.println("Yay burcusunuz.");
                }else
                    System.out.println("Geçersiz bir gün girdiniz!");
            }else if(month == 12){
                if(day >= 1 && day <= 30){
                    if(day < 22){
                        System.out.println("Yay burcusunuz.");
                    }else
                        System.out.println("Oğlak burcusunuz.");
                }else
                    System.out.println("Geçersiz bir gün girdiniz!");
            }

        }else
            System.out.println("Geçersiz bir ay değeri girdiniz!");

    }
}
