import java.util.Scanner;


public class Pratik1TryCatch {

    public static void CheckIndex(int arr[] , int index) throws IndexCheckException{
        if(index > arr.length-1 || index < 0){
            throw new IndexCheckException("Hata!!");
        }else {
            System.out.println("Girilen index dizi boyutlari icerisindedir.");
        }

    }

    public static void main(String[] args) throws IndexCheckException{

        Scanner scanner = new Scanner(System.in);

        int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(numbers.length + " elemanli dizimizdeki elemanlardan gormek istediginiz elemanin indexini giriniz");
        System.out.println();

        System.out.print("Index : ");
        int index = scanner.nextInt();

        try {
             CheckIndex(numbers , index);

        }catch (IndexCheckException e){
            e.toString();
        }

        System.out.println(numbers[index]);

    }


}
