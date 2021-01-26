package PracticeDecember;
import java.util.*;

public class Practice2021Jan {

    /**
     * This is to find second highest in the array
     * @param array - int[]
     * @return - integer second highest
     */
    public int secondHighest(int[] array) {
        int highest = array[0];
        int secondHighest = array[1];
        for(int i = 1; i < array.length; i++) {
            if(highest < array[i]) {
                secondHighest = highest;
                highest = array[i];
            }
            else if(secondHighest < array[i]) {
                secondHighest = array[i];
            }
        }
        return secondHighest;
    }

    public void sortList(List<String> list) {
        for(int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.size() - 1; i++) {
                if ((list.get(i).compareToIgnoreCase(list.get(i + 1)) > 0)) {
                    String temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }
        }
        System.out.println(list);
    }



 public void test3(int[] array) {

        for(int k = 0; k < array.length; k++) {
            for (int i = 0; i < array.length; i++) {
                Arrays.sort(array);
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j] + 1;
                }
            }
            if(Arrays.stream(array).distinct().count() == 1) {
                if(true) {

                }
                break;
            } else {
                array[array.length - 1] = array[array.length - 1] - 1;
            }
        }
     System.out.println("This is printing : " + Arrays.toString(array));
 }


 public void occurrenceInList(List<String> list) {

     for (int i = 0; i < list.size() - 1; i ++) {
         int count = 0;
         int index  = 0;
       for(int j = 0; j < list.size(); j++) {
           if (list.get(i).equals(list.get(j))) {
               count++;
               index = i;
           }
       }
         if(count > 1) {
             System.out.println(count);
             System.out.println(list.get(index));
         }
     }

 }

    /**
     * check if the given string has all balanced brackets
     * first store
     */
 public void checkBalanced() {
        String str = "{{{]}}";
        Stack<Character> charStack = new Stack<>();
        boolean isBalanced = false;
        for (char c: str.toCharArray()) {
            switch(c) {
                case '{':
                case '[':
                case '(':
                    charStack.push(c);
                    break;
                case '}' :
                case ']' :
                case ')' : {
                    if (charStack.size() == 0) {
                        isBalanced = false;
                    }
                    if ('{' == charStack.peek() && c == '}' ) {
                        isBalanced = true;
                        charStack.pop();
                    }
                    if('[' == charStack.peek() && c == ']') {
                        isBalanced = true;
                        charStack.pop();
                    }
                    if('(' == charStack.peek() && c == ')') {
                        isBalanced = true;
                        charStack.pop();
                    }
                    break;
                }
            }
        }
        if(isBalanced == true && charStack.size() == 0) {
            System.out.println(str + " is a balanced");
        } else {
            System.out.println(str + " is not balanced");
        }
 }
    /**
     * Sort the array
     */
public int[] sortArray(int[] array) {

    for(int j = 0; j <array.length; j++) {
        for (int i = 0; i < array.length - 1 - j; i++) {
           if(array[i] > array[i + 1]) {
               int temp = array[i];
               array[i] = array[i + 1];
               array[i + 1] = temp;
           }
        }
    }
    return array;
}
    /**
     * Merge sort
     * @param array
     */

    public void mergeSort(int[] array) {
        int[] leftArray = new int[array.length / 2];
        int[] rightArray;
        if(array.length % 2 == 0) {
            rightArray = new int[array.length / 2];
            for(int i = 0, k = 0; i < array.length; i++) {
                if(i <= array.length/2) {
                    leftArray[i] = array[i];
                } else  {
                    rightArray[k++] = array[i];
                }
            }
        } else {
            rightArray = new int[array.length / 2 + 1];
            for(int i = 0, k = 0; i < array.length; i++) {
                if(i < array.length/2) {
                    leftArray[i] = array[i];
                } else  {
                    rightArray[k++] = array[i];
                }
            }
        }
        leftArray = sortArray(leftArray);
        rightArray = sortArray(rightArray);
        System.out.println(Arrays.toString(leftArray));
        System.out.println(Arrays.toString(rightArray));
    }

    /**
     * Multiplying arrays
     * @param array1
     * @param array2
     * @return
     */
    public int[][] multiplyTwoArray(int[][] array1, int[][] array2) {
        int[][] sum = new int[array1.length][array2[0].length];
        for(int i = 0; i < array1.length; i++) {
            for(int j= 0; j < array1[i].length; j++) {
                int innerSum = 0;
                for(int k = 0; k < array2[j].length; k++) {

                }
            }
        }
   return new int[4][3];
    }

    /**
     * for the length of the array check if(a[i] == a[i + 1] - 1 == a[i + 2]
     * if so add all these into array of size three and remove from the old array
     * @param list
     */
    public void sequenceInArray(List<Integer> list) {
         List<Integer> sequenceArray = new ArrayList<>();
        for(int i = 0; i < list.size() - 2; i++) {
            if(list.get(i) == list.get(i + 1) - 1 && list.get(i + 1) - 1 == list.get(i  + 2) - 2) {
              sequenceArray.add(list.get(i));
              sequenceArray.add(list.get(i + 1));
              sequenceArray.add(list.get(i + 2));
              i = i + 2;
            }
        }
        System.out.println(sequenceArray);
    }
   public void readFromScreen() {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter your name :");
       String name = scanner.nextLine();
       System.out.println("hello " + name);
       System.out.println("Enter your age: ");
       String age = scanner.nextLine();
       System.out.println("And your age is :" + age);
   }


    public static void main(String[] args) {

       Practice2021Jan obj = new Practice2021Jan();
       obj.readFromScreen();

      /* Integer[] array = {1, 2, 3, 4, 5, 1, 2, 3, 5, 6, 7, 1, 2, 3};
       List<Integer> list = new ArrayList<>(Arrays.asList(array));

       obj.sequenceInArray(list);*/
//        System.out.println(obj.secondHighest( for(int i = 0; i < arr.size() - 1; i++) {
//            if(arr.get(i) - arr.get(i + 1) <= 1) {
//                Collections.sort(arr);
//                System.out.println(arr);
//            }
//        }
      // obj.test3(new int[] {3, 4, 6, 6, 3});;
      /* String[] array = {"apple", "banana", "mango", "apple"};
       obj.occurrenceInList(new ArrayList<>(Arrays.asList(array)));*/

       // obj.checkBalanced();
       // obj.mergeSort(new int[] {1, 6, 4, 3, 2, 8, 9});

    }
}
