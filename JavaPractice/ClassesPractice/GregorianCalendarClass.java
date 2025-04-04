import java.util.GregorianCalendar;
import java.util.Calendar;

//***************************EXAMPLE-1*************************** */
//if print object of GregorianCalendar class then

// class GregorianCalendarClass {
//     public static void main(String... a) {
//         GregorianCalendar date = new GregorianCalendar();

//         System.out.println(date);
//     }
// }

/*output
 * ava.util.GregorianCalendar[time=1737994278922,areFieldsSet=true,areAllFieldsSet=true,
 * lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Calcutta",offset=19800000,
 * dstSavings=0,useDaylight=false,transitions=7,lastRule=null],firstDayOfWeek=1,
 * minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=5,
 * DAY_OF_MONTH=27,DAY_OF_YEAR=27,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=9,
 * HOUR_OF_DAY=21,MINUTE=41,SECOND=18,MILLISECOND=922,ZONE_OFFSET=19800000,
 * DST_OFFSET=0]
PS D:\Mr.Sachin's data\GitDemo\My_Practice\JavaPra
 */
// ***************************EXAMPLE-2*************************** */
// for print today date

// class GregorianCalendarClass {
// public static void main(String... a) {
// GregorianCalendar date = new GregorianCalendar();
// int second, minute, hour, day, month, year;
// day = date.get(Calendar.DAY_OF_MONTH);
// month = date.get(Calendar.MONTH);
// year = date.get(Calendar.YEAR);

// System.out.println(day + "/" + (month+1) + "/" + year);
//// 1 plus isliya kiya kyoki month 0 sa start ho raha hai
// }
// }

/*output
 * 27/1/2025
 */
// ***************************EXAMPLE-3*************************** */
// class GregorianCalendarClass {
//     public static void main(String[] args) {
//         GregorianCalendar date = new GregorianCalendar();
//         int hour, minute, second;
//         second = date.get(Calendar.SECOND);
//         minute = date.get(Calendar.MINUTE);
//         hour = date.get(Calendar.HOUR);
//         System.out.println(hour + ":" + minute + ":" + second);

//     }
// }
/*output
9:58:24 */
// ***************************EXAMPLE-4*************************** */
// ***************************EXAMPLE-5*************************** */
// ***************************EXAMPLE-6*************************** */
// ***************************EXAMPLE-7*************************** */
// ***************************EXAMPLE-8*************************** */
// ***************************EXAMPLE-9*************************** */
// ***************************EXAMPLE-10*************************** */