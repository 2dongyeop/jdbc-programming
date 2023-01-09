package io.wisoft.seminar;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {

        /**
         *  Select Example.
         */
        StudentSelectService selectStudent = new StudentSelectService();

        System.out.println("전체 학생을 검색합니다.");
        selectStudent.getStudentAll();
        System.out.println();


        System.out.println("학번 20110201 학생을 검색합니다.");
        String studentNo = "20110201";
        selectStudent.getStudentNo(studentNo);
        System.out.println();


        System.out.println("이름 일지매 학생을 검색합니다.");
        String studentName = "일지매";
        selectStudent.getStudentName(studentName);
        System.out.println();


        System.out.println("생일이 1991-02-28인 학생을 검색합니다.");
        Date studentBirthday = Date.valueOf("1991-02-28");
        selectStudent.getStudentBirthday(studentBirthday);
        System.out.println();


        /**
         *  Insert Example.
         */
        Student student = new Student();
        Student[] students = new Student[8];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }

        StudentInsertService insertStudent = new StudentInsertService();

        System.out.println("학번이 20110401이고, 이름이 이순신인 학생을 추가합니다.");
        student.setStudentNo("20110401");
        student.setStudentName("이순신");
        insertStudent.insertStudent(student);
        System.out.println("");


        System.out.println("학번이 20110501이고, 이름이 이율곡인 학생을 추가합니다.");
        students[0].setStudentNo("20110501");
        students[0].setStudentName("이율곡");
        System.out.println("학번이 20110601이고, 이름이 이수일인 학생을 추가합니다.");
        students[1].setStudentNo("20110601");
        students[1].setStudentName("이수일");
        System.out.println("학번이 20110701이고, 이름이 심순애 학생을 추가합니다.");
        students[2].setStudentNo("20110701");
        students[2].setStudentName("심순애");
        System.out.println("학번이 20110801이고, 이름이 임꺽정인 학생을 추가합니다.");
        students[3].setStudentNo("20110801");
        students[3].setStudentName("임꺽정");

        insertStudent.insertStudentMulti(students);
        System.out.println("");


        System.out.println("학번이 20110901이고, 이름이 이상훈인 학생을 추가합니다.");
        students[0].setStudentNo("20110901");
        students[0].setStudentName("이상훈");
        System.out.println("학번이 20111001이고, 이름이 강동희인 학생을 추가합니다.");
        students[1].setStudentNo("20111001");
        students[1].setStudentName("강동희");
        System.out.println("학번이 2011101이고, 이름이 김호성인 학생을 추가합니다.");
        students[2].setStudentNo("20111101");
        students[2].setStudentName("김호성");
        System.out.println("학번이 20111201이고, 이름이 김정준인 학생을 추가합니다.");
        students[3].setStudentNo("20111201");
        students[3].setStudentName("김정준");

        insertStudent.insertStudentMultiBatch(students);
        System.out.println("");


        /**
         *  Update Example
         */
        StudentUpdateService updateStudent = new StudentUpdateService();

        System.out.println("학번이 20110401인 학생의 생일을 1990-03-21으로 변경합니다.");
        updateStudent.updateStudentBirthday("20110401", "1990-03-21");
        System.out.println("");


        System.out.println("학번이 20110401인 학생의 생일을 1990-03-25으로 변경합니다.");
        student.setStudentNo("20110401");
        student.setStudentBirthday("1990-03-25");
        updateStudent.updateStudentBirthday(student);
        System.out.println("");

        System.out.println("학번이 20110501인 학생의 생일을 1990-03-01으로 변경합니다.");
        students[0].setStudentNo("20110501");
        students[0].setStudentBirthday("1990-03-01");
        System.out.println("학번이 20110601인 학생의 생일을 1990-04-01으로 변경합니다.");
        students[1].setStudentNo("20110601");
        students[1].setStudentBirthday("1990-04-01");
        System.out.println("학번이 20110701인 학생의 생일을 1990-05-01으로 변경합니다.");
        students[2].setStudentNo("20110701");
        students[2].setStudentBirthday("1990-05-01");
        System.out.println("학번이 20110801인 학생의 생일을 1990-06-01으로 변경합니다.");
        students[3].setStudentNo("20110801");
        students[3].setStudentBirthday("1990-06-01");
        System.out.println("학번이 20110901인 학생의 생일을 1990-07-01으로 변경합니다.");
        students[4].setStudentNo("20110901");
        students[4].setStudentBirthday("1990-07-01");
        System.out.println("학번이 20111001인 학생의 생일을 1990-08-01으로 변경합니다.");
        students[5].setStudentNo("20111001");
        students[5].setStudentBirthday("1990-08-01");
        System.out.println("학번이 20111101인 학생의 생일을 1990-09-01으로 변경합니다.");
        students[6].setStudentNo("20111101");
        students[6].setStudentBirthday("1990-09-01");
        System.out.println("학번이 20111201인 학생의 생일을 1990-10-01으로 변경합니다.");
        students[7].setStudentNo("20111201");
        students[7].setStudentBirthday("1990-10-01");

        updateStudent.updateStudentBirthdayMultiBatch(students);
        System.out.println("");


        /**
         *  Delete Example
         */

        StudentDeleteService deleteStudent = new StudentDeleteService();

        System.out.println("학번이 20110401인 학생을 목록에서 제거합니다.");
        deleteStudent.deleteStudentNo("20110401");
        System.out.println("");

        System.out.println("학번이 20110501인 학생을 목록에서 제거합니다.");
        students[0].setStudentNo("20110501");
        System.out.println("학번이 20110601인 학생을 목록에서 제거합니다.");
        students[1].setStudentNo("20110601");
        System.out.println("학번이 20110701인 학생을 목록에서 제거합니다.");
        students[2].setStudentNo("20110701");
        System.out.println("학번이 20110801인 학생을 목록에서 제거합니다.");
        students[3].setStudentNo("20110801");
        System.out.println("학번이 20110901인 학생을 목록에서 제거합니다.");
        students[4].setStudentNo("20110901");
        System.out.println("학번이 20111001인 학생을 목록에서 제거합니다.");
        students[5].setStudentNo("20111001");
        System.out.println("학번이 20111101인 학생을 목록에서 제거합니다.");
        students[6].setStudentNo("20111101");
        System.out.println("학번이 20111201인 학생을 목록에서 제거합니다.");
        students[7].setStudentNo("20111201");

        deleteStudent.deleteStudentNoMultiBatch(students);
        System.out.println("");
    }
}
