package Collections.TaskD;

import static Collections.TaskD.Season.*;

public enum Month {
    JANUARY(31, WINTER),
    FEBRUARY(28, WINTER),
    MARCH(31, SPRING),
    APRIL(30, SPRING),
    MAY(31, SPRING),
    JUNE(30, SUMMER),
    JULY(31, SUMMER),
    AUGUST(31, SUMMER),
    SEPTEMBER(30, AUTUMN),
    OCTOBER(31, AUTUMN),
    NOVEMBER(30, AUTUMN),
    DECEMBER(31, WINTER);

    private final Integer days;
    private final Season season;

    Month(Integer days, Season season) {
        this.days = days;
        this.season = season;
    }

    public Integer getDays() {
        return days;
    }

    public Season getSeason() {
        return season;
    }
    //    public static Season getSeason(Month month) {
//        Season season = null;
//        switch (month) {
//            case SEPTEMBER:
//            case OCTOBER:
//            case NOVEMBER:
//                season = Season.SPRING;
//                break;
//            case DECEMBER:
//            case JANUARY:
//            case FEBRUARY:
//                season = Season.WINTER;
//                break;
//            case JUNE:
//            case JULY:
//            case AUGUST:
//                season = Season.SUMMER;
//                break;
//            case MARCH:
//            case APRIL:
//            case MAY:
//                season = Season.AUTUMN;
//                break;
//        }
//        return season;
//    }
//
//   public Integer getMonth(Month month){
//        Integer days = null;
//        switch (month){
//            case JANUARY:
//            case MARCH:
//            case MAY:
//            case JULY:
//            case AUGUST:
//            case OCTOBER:
//            case DECEMBER:
//                days = 31;
//                break;
//            case APRIL:
//            case JUNE:
//            case SEPTEMBER:
//            case NOVEMBER:
//                days = 30;
//                break;
//            case FEBRUARY:
//                days = 28;
//                break;
//        }
//        return days;
//   }
}
