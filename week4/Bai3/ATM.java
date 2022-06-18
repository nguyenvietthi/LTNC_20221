package Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        List <Account> acc_list = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            acc_list.add(new Account(i, 1000000));
        }

        int ID;
        Scanner scanner = new Scanner(System.in);

        while(true){
            do{
                System.out.print("Enter an ID: ");
                ID = scanner.nextInt();
            } 
            while(ID > acc_list.size() || ID < 0);
            
            while(true){
                int choice;
                print_menu();
                choice = scanner.nextInt();
                switch(choice){
                    case 1: System.out.format("The Balance is: %f \n", acc_list.get(ID).getBalance()); break;
                    case 2: System.out.println("Enter amount to withdraw: "); acc_list.get(ID).withdraw(scanner.nextDouble()); break;
                    case 3: System.out.println("Enter amount to deposit: "); acc_list.get(ID).deposit(scanner.nextDouble()); break;
                    case 4: break;
                }
                if(choice == 4) break;

            }
        }

    }
    public static void print_menu(){
        System.out.println("\nMain menu: ");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
        System.out.println("Enter a choice: ");
    }
}
