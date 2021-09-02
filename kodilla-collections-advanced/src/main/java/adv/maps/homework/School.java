package adv.maps.homework;

import java.util.List;
import java.util.Objects;

public class School {

    private String schoolName;
    private String schoolAdress;
    private List<Integer> studentsCount;

    public School(String schoolName, String schoolAdress, List<Integer> studentsCount) {
        this.schoolName = schoolName;
        this.schoolAdress = schoolAdress;
        this.studentsCount = studentsCount;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getSchoolAdress() {
        return schoolAdress;
    }

    public int getTotalStudentsCount() {
        int sum = 0;
        for (int schools : studentsCount)
            sum += schools;
        return sum ;
    }

    public String getDescription() {
        return schoolName + " : " + getTotalStudentsCount();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school1 = (School) o;
        return schoolName.equals(school1.schoolName) && schoolAdress.equals(school1.schoolAdress) && studentsCount.equals(school1.studentsCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, schoolAdress, studentsCount);
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolAdress='" + schoolAdress + '\'' +
                ", school=" + studentsCount +
                '}';
    }
}


