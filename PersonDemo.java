public class PersonDemo{

       public static void main(String args[])
       {
              Person person = new Person("Fatini Ishak","Seri Kembangan");
              Person student = new Student("Izz Aliff", "Batu Pahat", "Freshman");
              Person employee = new Employee("Amirul Izzat","Johor Bahru", 001, 4000,"23May21");
              Person faculty = new Faculty("Afiq Hanafi","Parit Sulong",002,4300,"12Jan20",35,41);
              Person staff = new Staff("Fariz Zainal","Parit Raja",003,5300,"7Mac18","Manager");
              Person roles[] = { person, student, employee, faculty, staff };

              for (Person p : roles)
              System.out.println(p);
       }

static class Person {
        public String name;
        public String address;
        public String phoneNumber;
        public String email;


        Person(String name, String address)
        {
              this.name = name;
              this.address = address;
        }

       public String toString()
       	{
             return "Person: " + name;
        }
}

static class Student extends Person {

        String status;
        Student(String name,String address, String status)
        {
             super(name,address);
             this.status = status;
        }


        enum Status
        {
            freshman, sophomore, junior, senior
        }

       public String toString()
       	{
           return "Student, Name: " + name + ", Status: " + status;
        }
}


static class Employee extends Person {

       int office, salary;
       String dateHired;
       Employee(String name,String address, int office, int salary,String dateHired)
       {
           super(name,address);
           this.office = office;
           this.salary = salary;
           this.dateHired = dateHired;
       }

       public String toString()
       {
            return "Employee, Name: " + name + ", Office no: " + office + ", Salary: " + salary + ", Date Hired: " + dateHired;
       }
}


static class Faculty extends Employee {

	    static int hours, rank;
        Faculty(String name,String address,int office, int salary,String dateHired,int hours, int rank)
        {
            super(name,address,office,salary,dateHired);
            this.hours = hours;
            this.rank = rank;
        }

        public String toString()
        {
            return "Faculty, Name: " + name + ", Work Hours: " + hours + ", Rank: " + rank;
        }
}


static class Staff extends Employee {

	    static String title;
        Staff(String name,String address,int office, int salary, String dateHired, String title)
        {
            //super(name,address,office,salary,dateHired,hours,rank);
            super(name,address,office,salary,dateHired);
            this.title = title;
        }


        public String toString()
        {
           return "Staff, Name: " + name + ", Title: " + title;
        }
}
}
