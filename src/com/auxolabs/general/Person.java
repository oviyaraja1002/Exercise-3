package com.auxolabs.general;

public class Person
{
    String firstName;
    String secondName;
    int age;
    public String getFirstName()
    {
      return firstName;
    }
    public String getSecondName()
    {
        return secondName;
    }
    public int getAge()
    {
         return age;
    }
    public void setFirstName(String firstName)
    {
          this.firstName = firstName;
    }
    public void setSecondName(String secondName)
    {
          this.secondName = secondName;
    }
    public int setAge(int age)
    {
        if (age > 0 && age < 100 )
        {
           this.age = age;
        }
        return 0;
    }
    public boolean isTeen()
    {
       if(age>12 && age <20)
       {
           return true;
       }
       return false;
    }
    public String getFullName()
    {
        String fullname= firstName + secondName;
        if(firstName.isEmpty())
        {
            return secondName;
        }
        if (secondName.isEmpty())
        {
            return firstName;
        }
        if ((firstName.isEmpty()) && (secondName.isEmpty()))
        {
            return "";
        }
        return fullname;
    }
    public static void main(String[] args)
    {
        Person info = new Person();
        info.setFirstName("");
        info.setSecondName("");
        info.setAge(10);
        System.out.println("fullname:" + info.getFullName() );
        System.out.println("teen:" + info.isTeen());
        info.setFirstName("tharaa");
        info.setAge(18  );
        System.out.println("fullname:"+ info.getFullName());
        System.out.println("teen:"+info.isTeen());
        info.setSecondName("oviya");
        System.out.println("fullname:" + info.getFullName());
    }
}
