import java.util.Scanner;
public class Employee {
    String name;
    double salary;
    int workHours;
    double vergi;
    int hireYear ;

    Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax(){//vergi hesaplama
        if(this.salary < 1000){
            return 0;
        }
        else if (this.salary > 1000){
            return this.salary* 0.03;
        }
        return 0;
    }
   double bonus(){
        if(workHours > 40){
           return (this.workHours-40)*30;
        }
        else {
            return 0;
        }
    }
   double raisesalary(){
        int currentYear = 2021;
        int workYears = currentYear -this.hireYear;
       if(workYears < 10 ){
           return (salary*5)/100;
       }
       else if(workYears > 9 && hireYear < 20){
           return (salary*10)/100;
       }
       else if(workYears > 19){
           return  (salary*15)/100;
       }
       return 0;
    }
    @Override
    public String toString(){
        double totalSalary = this.salary + this.bonus() - this.tax() + this.raisesalary();
        return "Çalışanın Adı: " + this.name + "\n" +
                "Maaşı: " + this.salary + "\n" +
                "Haftalık Çalışma Saati: " + this.workHours + "\n" +
                "İşe Başlangıç Yılı: " + this.hireYear + "\n" +
                "Vergi: " + this.tax() + "\n" +
                "Bonus: " + this.bonus() + "\n" +
                "Maaş Artışı: " + this.raisesalary() + "\n" +
                "Toplam Maaş: " + totalSalary;
    }

}
