import java.util.*;
public class Qn3 {
    static class Job{
        int jobId;
        int waitingTime;
        int burstTime;
        int turnAroundTime;

        public Job(int jobId, int waitingTime, int burstTime,int turnAroundTime) {
            this.jobId = jobId;
            this.waitingTime = waitingTime;
            this.burstTime = burstTime;
            this.turnAroundTime=turnAroundTime;
        }
    }
    public static void main(String[] args) {
        int jobcount=0;
        int totalwaiting=0;
        Queue<Job> q=new LinkedList<Job>();
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            int processTime=scn.nextInt();
            Job job=new Job(jobcount++,totalwaiting,processTime,totalwaiting+processTime);
            totalwaiting+=processTime;
            q.add(job);
        }
        Iterator<Job> e=q.iterator();
        while(e.hasNext()){
            Job s=(Job)e.next();
            System.out.println(s.jobId+" "+s.burstTime+" "+s.waitingTime);
        }

    }

}
