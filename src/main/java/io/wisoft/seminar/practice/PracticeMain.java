package io.wisoft.seminar.practice;

import io.wisoft.seminar.practice.service.PracticeDeleteService;
import io.wisoft.seminar.practice.service.PracticeInsertService;
import io.wisoft.seminar.practice.service.PracticeSelectService;
import io.wisoft.seminar.practice.service.PracticeUpdateService;

public class PracticeMain {
    public static void main(String[] args) {

        PracticeSelectService selectService = new PracticeSelectService();
        PracticeInsertService insertService = new PracticeInsertService();
        PracticeUpdateService updateService = new PracticeUpdateService();
        PracticeDeleteService deleteService = new PracticeDeleteService();

        /**
         * 1번
         */
//        System.out.println("HNU 엔터테인먼트의 부서 코드, 이름, 위치를 검색하시오.");
//        selectService.question1();
//        System.out.println();

        /**
         * 2번
         */
//        System.out.println("HNU 엔터테인먼트의 연예관계자 코드, 이름, 관리자, 급여를 검색하시오.");
//        selectService.question2();
//        System.out.println();

        /**
         * 3번
         */
//        System.out.println("HNU-E에서 제작한 드라마의 코드와 이름을 검색하시오.");
//        selectService.question3("HNU-E");
//        System.out.println();

        /**
         * 4번
         */
//        System.out.println("드라마 방영사가 KBC이거나 SBC인 드라마를 검색하시오.");
//        selectService.question4();
//        System.out.println();

        /**
         * 5번
         */
//        System.out.println("드라마 제작사를 중복을 제거하여 검색하시오.");
//        selectService.question5();
//        System.out.println();

        /**
         * 6번
         */
//        System.out.println("연예관계자들의 급여의 총합과 평균 급여액을 계산하시오.");
//        selectService.question6();
//        System.out.println();

        /**
         * 7번
         */
//        System.out.println("방영일자가 아직 확정되지 않은 드라마의 이름을 검색하시오");
//        selectService.question7();
//        System.out.println();

        /**
         * 8번
         */
//        System.out.println("연예관계자에 대해 연예관계자의 이름과 직속 상사의 이름을 검색하시오.");
//        selectService.question8();
//        System.out.println();

        /**
         * 9번
         */
//        System.out.println("연예관계자에 대해 이름과 급여를 출력하고 급여의 내림차순으로 정렬하시오. \n단, 동일 급여일 때는 이름의 오름차순으로 정렬하시오");
//        selectService.question9();
//        System.out.println();

        /**
         * 10번
         */
//        System.out.println("모든 연예관계자를 직급별로 그룹화하고, 평균 급여액이 5000 이상인 직급에 대해 연예 관계자의 직급, 평균 급여액, 최소 급여액, 최대 급여액을 검색하시오.");
//        selectService.question10();

        /**
         * 11번
         */
//        System.out.println("모든 연예관계자의 평균 급여액보다 많은 급여를 받는 연예관계자의 이름과 급여를 검색하라.");
//        selectService.question11();

        /**
         * 12번
         */
//        System.out.println("방영일자가 확정되지 않은 드라마의 방영일자가 2013-05-01로 편성되었습니다. 알맞게 변경하시오.");
//        updateService.qustion12();

        /**
         * 13번
         */
//        System.out.println("연예관계자 김수현 씨가 대리에서 실장으로 승진하고 급여가 20% 증가 되었습니다. 알맞게 변경하시오.");
//        updateService.qustion13();

        /**
         * 14번
         */
//        System.out.println("우리 회사에 한 명의 임원이 등록되었습니다. 코드는 E903, 이름은 손진현, 관리자는 E901, 급여는 4000입니다. 알맞게 등록하시오.");
//        insertService.question14("E903", "손진현", "E901", 4000);

        /**
         * 15번
         */
        //바꾸기 전
//        System.out.println("연예관계자인 손진현님이 퇴직했습니다. 연예관계자 목록에서 제거하시오.");
//        deleteService.question15("손진현");

        //바꾼 후
        System.out.println("15. 배우와 가수를 겸업하는 연예관계자의 이름을 검색하시오.");
        selectService.question15("배우", "가수");

        /**
         * 16번 - 나
         */
//        System.out.println("16. 모든 연예관계자 중 직급이 엔터테이너가 아닌 연예관계자의 이름을 검색하라.");
//        selectService.question16("엔터테이너");

    }
}
