package com.javastart.inhreritance;

public class British extends Cat {

    private String name;

    public String getName() {
        return name;
    }

    public British(int age, String onwer, String name) {
    super(age, onwer);
this.name = name;


}

    public String toString() {
        return "Cat name : " + name + " Age : " + getAge() + " Owner : " + getOwner();
    }

public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if(getClass() == o.getClass()) {
         British outsideObject = (British) o;
         return name.equals(outsideObject.name)
                 &&  getAge() == outsideObject.getAge()
                 && getOwner().equals(outsideObject.getOwner());

            }
  return false;

}
}
