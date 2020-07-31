package per.xgt.entity;


import java.io.Serializable;

public class Person implements Serializable {

  private static final long serialVersionUID = -3763978365100808946L;

  private Integer personId;
  private String personName;
  private Integer personAge;

  public Person() {
  }

  @Override
  public String toString() {
    return "Person{" +
            "personId=" + personId +
            ", personName='" + personName + '\'' +
            ", personAge=" + personAge +
            '}';
  }

  public Integer getPersonId() {
    return personId;
  }

  public void setPersonId(Integer personId) {
    this.personId = personId;
  }


  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }

  public Person(Integer personId, String personName, Integer personAge) {
    this.personId = personId;
    this.personName = personName;
    this.personAge = personAge;
  }

  public long getPersonAge() {
    return personAge;
  }

  public void setPersonAge(Integer personAge) {
    this.personAge = personAge;
  }

}
