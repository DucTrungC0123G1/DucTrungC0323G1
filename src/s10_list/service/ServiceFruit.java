package s10_list.service;

import s10_list.model.Fruit;
import s10_list.repository.RepositoryFruit;

import java.util.List;
import java.util.Scanner;

public class ServiceFruit implements IServiceFruit{
    Scanner sc = new Scanner(System.in);
    RepositoryFruit repositoryFruit= new RepositoryFruit();
    @Override
    public void displayFruit() {
        List<Fruit>fruitList = repositoryFruit.getFruit();
        for (Fruit f : fruitList) {
            System.out.println(f);
        }
    }

    @Override
    public void addNewFruit() {
        System.out.print("Enter Name Fruit: ");
        String newName = sc.nextLine();
        System.out.print("Enter Type Fruit: ");
        String newType = sc.nextLine();
        System.out.print("Enter Date Of Manu Fruit: ");
        String newDateManu = sc.nextLine();
        System.out.print("Enter Exp Date Fruit: ");
        String newExpDate = sc.nextLine();
        System.out.print("Enter Origin Fruit: ");
        String newOrigin = sc.nextLine();
        System.out.print("Enter Price Fruit: ");
        String newPrice = sc.nextLine();
        Fruit fruit = new Fruit(newName,newType,newDateManu,newExpDate,newOrigin,newPrice);
        repositoryFruit.addNewFruit(fruit);

    }
}
