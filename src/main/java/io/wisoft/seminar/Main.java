package io.wisoft.seminar;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {

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

    }
}
