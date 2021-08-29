package adv.maps.homework;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {

    private String schoolName;
    private String schoolAdress;
    private List<Integer> school = new ArrayList<>();



    public School(String schoolName, String schoolAdress,int... school) {
         for (int schools : school)
         this.school.add(schools);
        this.schoolName = schoolName;
        this.schoolAdress = schoolAdress;
           }

    public String getSchoolName() {
        return schoolName;
    }

    public String getSchoolAdress() {
        return schoolAdress;
    }

    public int getsum() {    // [1]
        int sum = 0;            // [2]
        for (int schools : school)  // [3]
            sum += schools;             // [4]
        return sum ;  // [5]
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school1 = (School) o;
        return schoolName.equals(school1.schoolName) && schoolAdress.equals(school1.schoolAdress) && school.equals(school1.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, schoolAdress, school);
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolAdress='" + schoolAdress + '\'' +
                ", school=" + school +
                '}';
    }
}


