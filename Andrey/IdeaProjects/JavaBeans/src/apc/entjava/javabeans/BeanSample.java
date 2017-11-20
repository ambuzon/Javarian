package apc.entjava.javabeans;

public class BeanSample {

    public static void main(String[] args) {
        Student s = new Student("2000-100204", "CATAYOC","JACOB","BSCSOT-SSE",2000);

//        s.setStudentID("2000-100204");
//        s.setLastName("CATAYOC");
//        s.setFirstName("JACOB");
//        s.setCourse("BSCSIT-SSE");
//        s.setYearEnrolled(2000);

        System.out.println(s.getStudentID());
        System.out.println(s.getLastName());
        System.out.println(s.getFirstName());
        System.out.println(s.getCourse());
        System.out.println(s.getYearEnrolled());

    }
}
