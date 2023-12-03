package Hw_1_Data_Structure;

//**************Double Linked List************************//
public class Service_1 {
    Patient head; //head of list
    Patient tail; //tail of list

    //Constructor
    public Service_1() {
        //Write your codes here
        head = null;
        tail = null;
    }

    //Check list is empty or not
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
        // don't forget to delete this line
    }

    //This function first builds new patient with the given data
    //than adds it to the LinkedList
    //new nodes are added to the tail of LinkedList
    public void insert(String name) {
        //Write your codes here
        Patient newPatient = new Patient(name);
        if (head == null) {
            head = tail = newPatient;
            head.previous = null;
        }
         else {
            tail.next = newPatient;
            newPatient.previous = tail;
            tail = newPatient;
        }
         tail.next = null;

    }

    // overload this method as new nodes are added to given position (int pos)
    // fill the rest
    public void insert(String name, int pos) {
        //Write your codes here
        Patient current = getByPosition(pos);
        Patient newPatient = new Patient(name);

        if (pos >= size()){
            return;
        }
        if (pos == 0){
            head.previous = newPatient;
            newPatient.next = head;
            head = newPatient;
            head.previous = null;
        }else{
            newPatient.previous = current.previous;
            current.previous.next = newPatient;
            current.previous = newPatient;
            newPatient.next = current;
        }

    }

    //This method finds how many patients are exist in LinkedList
    public int size() {
        //Write your codes here
        if (isEmpty()) {
            return 0;
        }
        int i = 1;
        Patient current = head;
        while (true) {
            if (current == tail) {
                return i;
            }
            i++;
            current = current.next;
        }
        // don't forget to delete this line
    }

    // This functions delete a node in the LinkedList by a given "data"
    // parameter name changed as key in order to prevent confusion
    public Patient deleteByName(String name) {
        if (isEmpty()) {
            return null;
        }
        Patient current = head;
        while (current != null) {
            if (current.getName().equals(name)) {
                if (current == head) {
                    head = current.next;
                    head.previous = null;
                    current.next = null;
                } else if (current == tail) {
                    tail = tail.previous;
                    tail.next = null;
                    current.previous = null;
                } else {
                    Patient beforePatient = current.previous;
                    Patient afterPatient = current.next;
                    beforePatient.next = afterPatient;
                    afterPatient.previous = beforePatient;
                    current.previous = null;
                    current.next = null;
                }
                return current;
            }
            current = current.next;
        }
        //Write your codes here
        return null; // don't forget to delete this line
    }

    // This functions delete a node in the LinkedList by a given position
    public Patient deleteByPosition(int pos) {
        //Write your codes here
        if (isEmpty()) {
            return null;
        }
        if (pos >= size()) {
            return null;
        }
        int i = 0;
        Patient current = head;
        while (current != null) {
            if (i == pos) {
                if (current == head) {
                    head = current.next;
                    head.previous = null;
                    current.next = null;
                } else if (current == tail) {
                    tail = tail.previous;
                    tail.next = null;
                    current.previous = null;
                } else {
                    Patient beforePatient = current.previous;
                    Patient afterPatient = current.next;
                    beforePatient.next = afterPatient;
                    afterPatient.previous = beforePatient;
                    current.previous = null;
                    current.next = null;
                }
                return current;
            }
            i++;
            current = current.next;
        }

        return null; // don't forget to delete this line
    }

    //This function get the node in the given index
    //*********************DO NOTHING*********************
    public Patient getByPosition(int pos) {
        if (this.isEmpty())
            return new Patient("empty");
        Patient current = this.head;
        int index = 0;

        while (current != null) {
            if (index++ == pos)
                break;
            current = current.next;
        }

        if (current == null)
            return new Patient("empty");

        return current;
    }

    // This function prints  the LinkenList
    //*********************DO NOTHING*********************
    public void print() {

        if (this.isEmpty())
            return;
        Patient patient = this.head;  // make a copy of head
        int index = 1;

        // never operate on "head", otherwise you will lost the linkedlist
        //unless you want to change "head"
        while (patient != null) {
            System.out.println(index++ + ". " + patient.getName());

            patient = patient.next;  // iterate to next node
        }

    }

}
