package io.wisoft.homework.week3;

public class Main {
    public static void main(String[] args) {

        EmployeeSelectService selectEmployee = new EmployeeSelectService();

        System.out.println("전체 직원을 검색합니다.");
        selectEmployee.getEmployeeAll();
        System.out.println();

        System.out.println("직원코드가 E101인 직원을 검색합니다.");
        String code = "E101";
        selectEmployee.getEmployeeBycode(code);
        System.out.println();

        System.out.println("이름이 이순신인 직원을 검색합니다.");
        String name = "이순신";
        selectEmployee.getEmployeeByName(name);
        System.out.println();

        System.out.println("매니저가 E103인 직원을 검색합니다.");
        String mgt = "E103";
        selectEmployee.getEmployeeByMgt(mgt);
        System.out.println();

        System.out.println("직책 코드가 R005인 직원을 검색합니다.");
        String rcode = "R005";
        selectEmployee.getEmployeeByRcode(rcode);
        System.out.println();
    }
}
