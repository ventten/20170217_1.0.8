package com.ljwd.plms.core.util;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;

import java.util.Date;

/**
 * Created by zhengzw on 2016/8/18
 * 借款工具类
 */
public class LoanUtils {

    /**
     * 计算逾期天数
     * */
    public static int calculateOverdueDays(Date repaymentDate , Date maxRepaymentDate , Date lastestActualRepaymentDate , Date actualRepaymentDateTime){
        int overdueDay = 0;
        DateMidnight actualDate = new DateMidnight(actualRepaymentDateTime);
        Date actualRepaymentDate = actualDate.toDate();
        if(repaymentDate != null && maxRepaymentDate != null && actualRepaymentDate != null){
            if(maxRepaymentDate.compareTo(actualRepaymentDate) < 0){
                Date addNewStartDate = null;
                if (lastestActualRepaymentDate != null && repaymentDate.compareTo(lastestActualRepaymentDate) < 0) {
                    addNewStartDate = lastestActualRepaymentDate;
                } else {
                    addNewStartDate = repaymentDate;
                }

                if(actualRepaymentDate.compareTo(addNewStartDate) > 0){
                    DateMidnight startDate = new DateTime(addNewStartDate).toDateMidnight();
                    DateMidnight endDate = new DateTime(actualRepaymentDate).toDateMidnight();
                    overdueDay = new Period(startDate, endDate, PeriodType.days()).getDays();
                }
            }

        }
        return overdueDay;
    }

}
