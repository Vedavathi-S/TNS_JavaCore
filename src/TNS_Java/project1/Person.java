//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package TNS_Java.project1;
public class Person {
    //Data
  private String firstName;
  private String lastName;
  private int age;
  private String gender;
  private int income;
  private int tax;

  //setters using parameterised constructor
    public Person(String firstName, String lastName, int age, String gender, int income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.income = income;

    }
    //setters method
    public void setTax(int tax) {
        this.tax = tax;
    }

    //getters method
    public String getFirstName() {
        return firstName;
    }
   public String getLastName() {
        return lastName;
   }
   public int getAge() {
        return age;
   }
   public String getGender() {
        return gender;
   }
   public int getIncome() {
        return income;
   }
   public int getTax() {
        return tax;
   }

   public String toString() {
        return "Person [ Name=" + firstName + ", LastName=" + lastName + ", Age=" + age + ", Gender=" + gender+ ", Income=" + income + ", Tax=" + tax + "]";
   }

}