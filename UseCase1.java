package AddressBook;
import java.util.*;
import java.util.Scanner;
class Class1{
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    private String email;
    private String firstName;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    private String lastName;
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String city;
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private int zip;
    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    private String state;
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    private String phoneNum;
    public String getPhoneNum() {
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }



    public void createContacts(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name : ");
        setFirstName(sc.nextLine());
        System.out.print("Enter Last Name : ");
        setLastName(sc.nextLine());
        System.out.print("Enter City Name : ");
        setCity(sc.nextLine());
        System.out.print("Enter State Name : ");
        setState(sc.nextLine());
        System.out.print("Enter Email : ");
        setEmail(sc.nextLine());
        System.out.print("Enter Zip Code : ");
        setZip(sc.nextInt());
        System.out.print("Enter Phone Number : ");
        setPhoneNum(sc.next());

    }
    public String toString()
    {

        String str = "Contacts: [First_Name = " + getFirstName() + ", Last_Name = " + getLastName() +
                ", City = " + getCity() + ", State = " + getState() + ", Email = " + getEmail() + ", Zip = " + getZip() + ", PhoneNumber = " + getPhoneNum()  +"]";
        return str;

    }
}
public class UseCase1 {
    public static void main(String args[]) {
        System.out.println("Welcome to Address Book ");
//        Scanner sc = new Scanner(System.in);
        Class1 c1 = new Class1();
        c1.createContacts();
        System.out.println(c1.toString());

    }
}
