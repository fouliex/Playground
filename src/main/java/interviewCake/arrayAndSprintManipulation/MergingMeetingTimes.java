package interviewCake.arrayAndSprintManipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Your company build an in-house calendar tool called HiCal. You want to add a feature to see the times in a day when
 * everyone is available.
 *
 *
 * Write a method mergeRanges() that take a list of multiple meeting time ranges and return a list of condensed ranges.
 */
public class MergingMeetingTimes {


    private static class Meeting {

        private int startTime;
        private int endTime;

        public Meeting(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public int getStartTime() {
            return startTime;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public int getEndTime() {
            return endTime;
        }

        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }
    }

    public static List<Meeting> mergeRanges(List<Meeting> meetings){

        //make a copy so we don't destroy the input
        List<Meeting> sortedMeetings = new ArrayList<>();

        for(Meeting meeting: meetings){
            Meeting meetingCopy = new Meeting(meeting.getStartTime(),meeting.getEndTime());
            sortedMeetings.add(meetingCopy);
        }

        // sort by start time
        Collections.sort(sortedMeetings, new Comparator<Meeting>(){

            @Override
            public int compare(Meeting m1, Meeting m2) {
                return  m1.getStartTime() - m2.getStartTime();
            }
        });

        // initialize mergedMeetings with the earliest meeting
        List<Meeting> mergeMeetings = new ArrayList<>();
        mergeMeetings.add(sortedMeetings.get(0));

        for(Meeting currentMeeting : sortedMeetings){
            Meeting lastMergedMeeting = mergeMeetings.get(mergeMeetings.size() -1);

            // if the current meeting overlaps with the last merged meeting, use the later end time of the two
            if(currentMeeting.getStartTime() <= lastMergedMeeting.getEndTime()){
                lastMergedMeeting.setEndTime(Math.max(lastMergedMeeting.getEndTime(), currentMeeting.getEndTime()));

                // add the current meeting since it doesn't overlap
            } else {
                mergeMeetings.add(currentMeeting);
            }
        }

        return mergeMeetings;
    }

    public static void main(String[] args) {
        List<Meeting> meetings = new ArrayList<Meeting>();
        meetings.add(new Meeting(0,1));
        meetings.add(new Meeting(3,5));
        meetings.add(new Meeting(4,8));
        meetings.add(new Meeting(10,12));
        meetings.add(new Meeting(9,10));

       List<Meeting> newMeetings = MergingMeetingTimes.mergeRanges(meetings);
       for(Meeting m : newMeetings){
           System.out.println("("+ m.getStartTime() + "," + m.getEndTime()+ ")");
       }



    }

}
