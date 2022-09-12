package PrivateMember;

public class Employee extends Person  {
        // The features of Person class are now available in Employee class except the private members.
        private String language,address;
        private int salary;

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }


        //display all info
        public void displayAllInfo(){

            //these are Person class method.
            System.out.println("Employee name => "+getName());
            System.out.println("Employee gender => "+getGender());
            System.out.println("Employee age => "+getAge());

            //these are employee class method
            System.out.println("Employee language => "+getLanguage());
            System.out.println("Employee address => "+getAddress());
            System.out.println("Employee salary => "+getSalary());

        }
}
