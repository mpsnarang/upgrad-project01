package com.company;

import java.util.*;

public class ArrayListOps1 {
    public static void main(String[] args) {
//        ArrayList<Student> studentList = new ArrayList<Student>();
//        studentList.add(new Student("Sujit", 1));
//        studentList.add(new Student("Siddharth", 2));
//        studentList.add(new Student("Karanpreet", 3));
//        studentList.add(4,new Student("Hari", 4));
//        studentList.add(3, new Student("Tricha", 5));


        //printStudentList(studentList);
//
//        List<Integer> random = new ArrayList<Integer>();
//        random.add(1);
//        random.add(2);
//        random.add(3);
//        random.add(4);
//        random.add(5);
//        random.add(6);
//
//        List<Integer> arrayList = new ArrayList<Integer>();
//        arrayList.add(1);
//        arrayList.add(2);
//
//        ListIterator<Integer> listIterator = arrayList.listIterator();
//        while(listIterator.hasNext()) {
//            System.out.print(listIterator.next());
//            listIterator.previous();
//        }

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        thirdMaxInteger(arr);


//        random.add(99);
//        random.add(101);
////        printList(random);
//        //iterateFwd(random);
//        iterateAltn(random);
//        LinkedList<Student> studentList = new LinkedList<Student>();
//
//        Student s1 = new Student("Sujit", 1);
//        Student s2 = new Student("Siddharth", 2);
//        Student s3 = new Student("Karanpreet", 3);
//        Student s4 = new Student("Hari", 5);
//        Student s5 = new Student("Tricha", 4);
//
//        studentList.add(s1);
//        studentList.add(s2);
//        studentList.add(s3);
//        studentList.add(s4);


        //Write new statements here
//        System.out.println(random.get(2));

//        int i = random.indexOf(10f);
//        random.add(i,15f);
//        random.remove(i+1);
//        printList(random);

      //  System.out.println(studentList.get(1).getDetails());

//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++)
//            arr[i] = s.nextInt();
//           // reverseArray(arr);
//           // moveZerosToEnd(arr);
//        for (int i = 0; i < arr.length; i++)
//            System.out.print(arr[i] + " ");

       // iterate(random);
    }

    static void thirdMaxInteger(int[] arr) {
        // Write your code here
        int iArrLenght = arr.length;
        int countUnique = 0;
        if(iArrLenght >= 3) {
            for (int i = 0; i < iArrLenght; i++) {
                for (int j = i + 1; j < iArrLenght; j++) {
                    if ((arr[i]) < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        countUnique++;
                    }
                }
            }
            if(countUnique>=1)
                System.out.println(arr[2]);
            else
                System.out.println("The array doesn't have a third maximum element");

        } else if (iArrLenght < 3){
            System.out.println("The array doesn't have a third maximum element");
        }
    }



    public static void iterate(List<Integer> num) {
        ListIterator<Integer> it = num.listIterator(num.size());
        while(it.hasPrevious()) {
            if(it.hasPrevious()) {
                System.out.println(it.previous());
            }
            it.previous();
        }
    }

    public static void process(List<Integer> numberList){
        numberList.add(2, 5);
        System.out.println(numberList.get(3));
    }

    static void moveZerosToEnd(int[] arr) {
        // Write your code here
        int iSize = arr.length;
        int iIndexZero = 0;
        for(int i = 0; i<iSize-1;i++){
            if(arr[i]==0){
                for(int j = i; j<iSize-1;j++){
                    arr[j] = arr[j+1];
                }
                arr[iSize-1]=0;
            }
        }
    }





    public static void iterateFwd(List<Float> num) {
        ListIterator<Float> it = num.listIterator();
        while(it.hasNext()) {
            System.out.println("Iterate Forward : "+it.next());
        }
    }

    static void reverseArray(int[] arr) {
        // Write your code here
        int iSize = arr.length;
        int iIteratorSize = ((iSize%2)==0) ? (iSize/2) : ((iSize-1)/2);
        System.out.println("iterator size "+iIteratorSize);
        for(int i = 0; i<iIteratorSize;i++){
            int temp = arr[iSize-1];
            arr[iSize - 1] = arr [i];
            arr[i] = temp;
            iSize--;
            System.out.println("iSize: "+iSize);
        }
    }




    public static void iterateAltn(List<Float> num) {
        ListIterator<Float> it = num.listIterator();
        int iSize = num.size();
        while(it.hasNext()){
            if((it.nextIndex()%2)!=0)
                System.out.println(it.next());
            else
                it.next();
        }
    }



    public static void printStudentList(LinkedList<Student1> students) {
        for(Student1 s : students) {
            System.out.println(s.getDetails());
        }
    }

    public static void printList(LinkedList<Float> linkList) {
        for(Float num : linkList) {
            System.out.println(num);
        }
    }

    public static void printList(List<Float> numList) {
        ListIterator lIt = numList.listIterator(numList.size());
        while(lIt.hasPrevious()){
            System.out.println(lIt.previous());
        }

    }

    public static void printStudentList(ArrayList<Student1> students) {
        for(Student1 s : students) {
            System.out.println(s.getDetails());
        }
    }
}

class Student1 {
    private final String name;
    private final int rollNumber;

    public Student1(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getDetails() {
        return
                "name = " + this.name + '\n' +
                        "roll number = " + this.rollNumber + '\n';
    }
}

