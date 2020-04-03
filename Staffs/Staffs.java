import java.util.*;

class Staff {
    int staffId, Phone, Salary;
    String Name;

    public Staff(int id, int ph, int sal, String na) {
        staffId = id;
        Phone = ph;
        Salary = sal;
        Name = na;
    }
    
    void display() {
        System.out.println("Staff id " + staffId);
        System.out.println("Name " + Name);
        System.out.println("Phone " + Phone);
        System.out.println("Salary " + Salary);
    }
}

class Teaching extends Staff {
    String domain;
    int no_of_publication;

    public Teaching(int id, int ph, int sal, String na, int nop, String dom) {
        super(id, ph, sal, na);
        domain = dom;
        no_of_publication = nop;
    }

    void display() {
        System.out.println("Teaching Staff Details");
        super.display();
        System.out.println("Domain " + domain);
        System.out.println("No of publication " + no_of_publication);
    }
}

class Technical extends Staff {
    String Skill;

    public Technical(int id, int ph, int sal, String na, String sk) {
        super(id, ph, sal, na);
        Skill = sk;
    }

    void display() {
        System.out.println("Technical Staff Details");
        super.display();
        System.out.println("Skill " + Skill);
    }
}

class Contract extends Staff {
    int period;

    public Contract(int id, int ph, int sal, String na, int per) {
        super(id, ph, sal, na);
        period = per;
    }

    void display() {
        System.out.println("Contract Staff Details");
        super.display();
        System.out.println("Period " + period);
    }
}

public class Staffs {
    public static void main(String args[]) {
        Teaching t1 = new Teaching(1, 992020, 100, "na", 1, "cs");
        Teaching t2 = new Teaching(2, 992020, 100, "aq", 1, "is");
        Teaching t3 = new Teaching(3, 992020, 100, "zwe", 1, "ec");
        t1.display();
        t2.display();
        t3.display();
        Technical te1 = new Technical(1, 992020, 100, "na", "c");
        Technical te2 = new Technical(2, 992020, 100, "aq", "java");
        Technical te3 = new Technical(3, 992020, 100, "zwe", "c++");
        te1.display();
        te2.display();
        te3.display();
        Contract co1 = new Contract(1, 992020, 100, "na", 1);
        Contract co2 = new Contract(2, 992020, 100, "aq", 2);
        Contract co3 = new Contract(3, 992020, 100, "zwe", 3);
        co1.display();
        co2.display();
        co3.display();
    }
}