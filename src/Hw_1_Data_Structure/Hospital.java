package Hw_1_Data_Structure;

public class Hospital {
    public static void main(String[] args){
        int total_grade = 0;
        Patient p1, p2, p3;
        Service_1 service_1 = new Service_1();
        Service_2 service_2 = new Service_2();

        //Test Service 1: Total 56 point
        service_1.insert("patient_1");
        service_1.insert("patient_2");
        service_1.insert("patient_3", 1);
        service_1.insert("patient_4");
        service_1.insert("patient_5", 1);
        service_1.insert("patient_6");
        service_1.insert("patient_7");
        service_1.insert("patient_8", 2);
        service_1.insert("patient_9");
        service_1.insert("patient_10", 0);

        System.out.println("----------------Service 1----------------");

        //****************************************************//
        if(service_1.size() == 10)
            total_grade += 6;
        if(service_1.getByPosition(0).getName().equals("patient_10"))
            total_grade += 3;
        if(service_1.getByPosition(1).getName().equals("patient_1"))
            total_grade += 3;
        if(service_1.getByPosition(2).getName().equals("patient_5"))
            total_grade += 3;
        if(service_1.getByPosition(3).getName().equals("patient_8"))
            total_grade += 3;
       if(service_1.getByPosition(4).getName().equals("patient_3"))
          total_grade += 3;
       if(service_1.getByPosition(5).getName().equals("patient_2"))
           total_grade += 3;
        if(service_1.getByPosition(6).getName().equals("patient_4"))
            total_grade += 3;
        if(service_1.getByPosition(7).getName().equals("patient_6"))
            total_grade += 3;
        if(service_1.getByPosition(8).getName().equals("patient_7"))
            total_grade += 3;
        if(service_1.getByPosition(9).getName().equals("patient_9"))
            total_grade += 3;
        //****************************************************//

        p1 = service_1.deleteByName("patient_9");
        //****************************************************//
        if(p1 != null && p1.getName().equals("patient_9"))
            total_grade += 5;
        //****************************************************//

        p2 = service_1.deleteByPosition(5);
        //****************************************************//
     /**/   if(p2 != null && p2.getName().equals("patient_2"))
            total_grade += 5;
        //****************************************************//

        p3 = service_1.deleteByPosition(0);
        //****************************************************//
        if(p3 != null && p3.getName().equals("patient_10"))
            total_grade += 5;
        //****************************************************//

        System.out.println("----------------Service 1----------------");
        service_1.print();
        //****************************************************//
        if(service_1.size() == 7)
            total_grade += 5;
        //****************************************************//

        System.out.println("****************************************************************************************************");
        System.out.println("After testing Service 1  total grade is " + total_grade);
        System.out.println("****************************************************************************************************");
        // End Test Service 1: Total 56 point



        // Test Service 2: Total 44 point
        service_2.enqueue(new Patient("patient_21"));
        service_2.enqueue(new Patient("patient_22"));
        service_2.enqueue(new Patient("patient_23"));
        service_2.enqueue(new Patient("patient_24"));
        service_2.enqueue(new Patient("patient_25"));
        service_2.enqueue(new Patient("patient_26"));
        service_2.enqueue(new Patient("patient_27"));
        service_2.enqueue(new Patient("patient_28"));
        service_2.enqueue(new Patient("patient_29"));
        service_2.enqueue(new Patient("patient_30"));

        System.out.println("----------------Service 2----------------");
        service_2.queue.print();
        //****************************************************//
        if(service_2.size() == 10)
            total_grade += 2;
        if(service_2.queue.getByPosition(0).getName().equals("patient_21"))
            total_grade += 3;
        if(service_2.queue.getByPosition(1).getName().equals("patient_22"))
            total_grade += 3;
        if(service_2.queue.getByPosition(2).getName().equals("patient_23"))
            total_grade += 3;
        if(service_2.queue.getByPosition(3).getName().equals("patient_24"))
            total_grade += 3;
        if(service_2.queue.getByPosition(4).getName().equals("patient_25"))
            total_grade += 3;
        if(service_2.queue.getByPosition(5).getName().equals("patient_26"))
            total_grade += 3;
        if(service_2.queue.getByPosition(6).getName().equals("patient_27"))
            total_grade += 3;
        if(service_2.queue.getByPosition(7).getName().equals("patient_28"))
            total_grade += 3;
        if(service_2.queue.getByPosition(8).getName().equals("patient_29"))
            total_grade += 3;
        if(service_2.queue.getByPosition(9).getName().equals("patient_30"))
            total_grade += 3;
        //****************************************************//

        p1 = service_2.dequeue();
        //****************************************************//
        if(p1 != null && p1.getName().equals("patient_21"))
            total_grade += 4;
        //****************************************************//

        p2 = service_2.dequeue();
        //****************************************************//
        if(p2 != null && p2.getName().equals("patient_22"))
            total_grade += 4;
        //****************************************************//

        p3 = service_2.dequeue();
        //****************************************************//
        if(p3 != null && p3.getName().equals("patient_23"))
            total_grade += 4;
        //****************************************************//

        System.out.println("----------------Service 2----------------");
        service_2.queue.print();

        System.out.println("****************************************************************************************************");
        System.out.println("After testing Service 2 total grade is " + total_grade);
        System.out.println("****************************************************************************************************");
        // End Test Service 2: Total 44 point


    }

}
