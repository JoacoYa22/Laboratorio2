public class Main {
    public static void main(String[] args) {
        DemoMetodoGenerico demo = new DemoMetodoGenerico();
        Integer nums[] = {1, 2, 3, 4, 5};
        Integer nums2[] = {1, 2, 3, 4, 5};
        Integer nums3[] = {1, 2, 7, 4, 5};
        Integer nums4[] = {1, 2, 7, 4, 5, 6};
        if (demo.igualArrays(nums, nums))
            System.out.println("nums es igual a nums");
        if (demo.igualArrays(nums, nums2))
            System.out.println("nums es igual a nums2");
        if (demo.igualArrays(nums, nums3))
            System.out.println("nums es igual a num3");
        if (demo.igualArrays(nums, nums4))
            System.out.println("nums es igual a nums4");
        // Crea un array de double
        Double dvals[]={1.1,2.2,3.3,4.4,5.5};
        if(demo.igualArrays(nums,dvals)) {
            System.out.println("nums es igual a dvals");
        }
    }
}