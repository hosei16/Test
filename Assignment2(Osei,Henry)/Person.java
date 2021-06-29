public class Person
{
private String firstName; //store the first name
private String lastName; //store the last name
private String middleName;
//Default constructor
//Initialize firstName and lastName to an empty string.
//Postcondition: firstName = ""; lastName = "";
public Person()
{
firstName = "";
lastName = "";
middleName = "";
}
//Constructor with parameters
//Set firstName and lastName according to the parameters.
//Postcondition: firstName = first; lastName = last;
public Person(String first, String middle,String last)
{
setName(first,middle, last);
}
//Method to output the first name and last name
//in the form firstName lastName.
public String toString()
{
return (firstName + " " + middleName + " " +lastName);
}
//Method to set firstName and lastName according to
//the parameters.
//Postcondition: firstName = first; lastName = last;
public void setName(String first,String middle, String last)
{
firstName = first;
middleName = middle;
lastName = last;
}
//Method to return firstName.
//Postcondition: The value of firstName is returned.
public String getFirstName()
{
return firstName;
}
//Method to return lastName.
//Postcondition: The value of lastName is returned.
public String getLastName()
{
return lastName;
}
public String getMiddleName()
{
return middleName;
}
  
public void setLastName(String lastName)
{
this.lastName = lastName;
}
public void setFirstName(String firstName)
{
this.firstName = firstName;
}
public void setMiddleName(String middleName)
{
this.middleName = middleName;
}
public boolean equalsLastName(Person p)
{
if(this.lastName == p.lastName)
return true;
else
return false;
}
public boolean equalsMiddleName(Person p)
{
if(this.middleName == p.middleName)
return true;
else
return false;
}
public boolean equalsFirstName(Person p)
{
if(this.firstName == p.firstName)
return true;
else
return false;
}
public boolean equals(Person p)
{
if(this.lastName == p.lastName && this.firstName == p.firstName)
return true;
else
return false;
}
public void makeCopy(Person p)
{
this.firstName = p.firstName;
this.middleName = p.middleName;
this.lastName = p.lastName;
}
public Person getCopy(Person p)
{
Person p1 = new Person();
p1.firstName = p.firstName;
p1.middleName = p.middleName;
p1.lastName = p.lastName;
return p1;
}
}
class TestPerson
{
public static void main (String[] args)
{
Person p1 = new Person("Henry","N.","Osei");
Person p2 = new Person();
p2.makeCopy(p1);
if(p1.equals(p2) == true)
System.out.println("Both persons are same .");
else
System.out.println("Persons are different .");
System.out.println(p2);
}
}
