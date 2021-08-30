package Task2;


public class Task2 {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Сергей Петров");
        Employee employee2 = new Employee("Иван Макаров");
        //List <Letter> letter  - создается, когда employee отправляет письмо
        // можно убрать методы addNewMessage и showDialog, тогда просто будет new Letter с реквизатами
        Employee.addNewMessage(1,"Первое письмо",employee1,employee2,"Привет");
        Employee.addNewMessage(2, "Второе письмо",employee2,employee1,"Добрый день");

        Employee.showDialog(employee1,employee2);

        OrderHiring orderHiring = new OrderHiring(1,"Прием сотрудника",employee1,"Сотрудник нанят", Status.создан);
        System.out.println(orderHiring);

        orderHiring = new OrderHiring(1,"Прием сотрудника",employee1,"Сотрудник нанят", Status.исполнен);
        System.out.println(orderHiring);

        OrderDismissal orderDismissal = new OrderDismissal(2,"Увольнение сотрудника",employee2,"Сотрудник уволен", "Сокращение штата",Status.создан);
        System.out.println(orderDismissal);

        orderDismissal= new OrderDismissal(2,"Увольнение сотрудника",employee2,"Сотрудник уволен", "Сокращение штата",Status.исполнен);
        System.out.println(orderDismissal);
        orderHiring.print();

    }


}

