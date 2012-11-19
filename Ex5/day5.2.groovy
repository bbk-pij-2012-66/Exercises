int[][] src;
src = new int[3][3];
src[0][0] = 1;
src[0][1] = 2;
src[0][2] = 3;
src[1][0] = 4;
src[1][1] = 5;
src[1][2] = 6;
src[2][0] = 7;
src[2][1] = 8;
src[2][2] = 9;

dst = new int [3][3];

System.out.println(src);
System.out.println(dst);
ArrayCopier tester = new ArrayCopier();
System.out.println("Begining ArrayCopier...");
tester.copy(src, dst);
System.out.println("...Finished ArrayCopier.");
System.out.println(src);
System.out.println(dst);