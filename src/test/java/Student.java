public class Student {

    public String getName (){
        return name;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public ArrayList<Integer> getGrades(){
        return grades;
    }
    public double getGradeAverage(){
        int sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        return sum / grades.size();
    }
    public Student(String getName) {
        this.getName = getName;
    }
    public String getGetName() {
        return getName;
    }
    public void setGetName(String getName) {
        this.getName = getName;
    }

    public Student() {
    }

}
