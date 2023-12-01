package HashTables;

public class Challenge1 {
    public static void main(String[] args) {
        int nums[]=new int[10];
        int numsToAdd[]={59382,43,6894,500,99,-58};
        //                27    7  27   5  18  13
        //                5.4  3.5 6.75 1.67 9 4.33
        for (int i = 0; i < numsToAdd.length; i++) {
            nums[hash(numsToAdd[i])]=numsToAdd[i];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        for (int i = 0; i < numsToAdd.length; i++) {
            System.out.println(String.format("Key: %s, Value:%s",numsToAdd[i],nums[hash(numsToAdd[i])]));
        }

    }

    public static int hash(int value){
        String valueStr=Integer.valueOf(value).toString();
        return sumDigitsInNumber(valueStr)/valueStr.length();
    }

    private static int sumDigitsInNumber(String valueStr) {
        int sum=0;
        for (int i = 0; i < valueStr.length(); i++) {
            if(Character.isDigit(valueStr.charAt(i)))
                sum+=Integer.parseInt(valueStr.charAt(i)+"");
        }
        return sum;
    }
}
