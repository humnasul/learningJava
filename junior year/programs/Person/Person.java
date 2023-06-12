/**
 * Name: Humna Sultan
 * Program Name: Employee Commission Lab
 * Date: 1 December 2020
 * Extra: adds extra money to commission employee if flat salary is low
 */
package Person;
public class Person {
    public String firstname;
    public String lastname;
    public String birthdate;
//instance variables
    /**
     * constructor for Person
     * @param first: first name
     * @param last: last name
     * @param birth: birthdate
     */
    public Person(String first, String last, String birth)
    {
        firstname = first;
        lastname = last;
        birthdate = birth;
    }
    /**
     * returns name

     * @return: firstname and lastname together
     */
    public String r1()
    {
        return firstname + " " + lastname;
    }

    /**
     * returns birthdate
     * @return: date of birth of person
     */
    public String r2()
    {
        return birthdate;
    }
}