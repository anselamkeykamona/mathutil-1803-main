package com.giaolang;

import com.giaolang.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArg0RunsWell();
        testFactorialGivenRightArg1RunsWell();
        testFactorialGivenRightArg5RunsWell();
        testFactorialGivenWrongArgMinus2ThrowsException();
    }

    //test giai thừa với âm 2; hy vọng trả về là: 1 NGOẠI LỆ XUẤT HIỆN
    public static void testFactorialGivenWrongArgMinus2ThrowsException() {
        MathUtility.getFactorial(-2);
    }  //KHI ĐƯA N = -2, THẤY NGOẠI LỆ MỪNG RƠI NƯỚC MẮT
        //CODE TA THIÊT KẾ LÀ: NẾU N ÂM THÌ PHẢI CÓ NGOẠI LỆ XUẤT HIỆN
        //MÀ BI GIỜ KHI MÌNH RUN VỐI N = -2, NGOẠI LỆ XH, KO HOẢNG HỐT
    //MÀ LẠI MỪNG VÌ: APP RUN NHƯ THIẾT KẾ

    public static void testFactorialGivenRightArg5RunsWell() {
        int n = 5; //cho/given n = 5
        long expectedResult = 120; //hy vọng 1! ở trên sẽ là 1
        long actualValue = MathUtility.getFactorial(n); //thực tế là mấy đoán xem
        //so sánh giữa expected và actual
        System.out.println( "Expected: " + expectedResult + ", Actual: " + actualValue);
        System.out.println("status: " + (expectedResult == actualValue));
    }

    public static void testFactorialGivenRightArg1RunsWell() {
        int n = 1; //cho/given n = 1
        long expectedResult = 1; //hy vọng 1! ở trên sẽ là 1
        long actualValue = MathUtility.getFactorial(n); //thực tế là mấy đoán xem
        //so sánh giữa expected và actual
        System.out.println( "Expected: " + expectedResult + ", Actual: " + actualValue);
        System.out.println("status: " + (expectedResult == actualValue));
    }

    //CODE CÁC TEST CASE ĐỂ TEST HÀM CHẠY ĐÚNG SAI - THỰC HÀNH TDDp
    //HÀM NÀY ỨNG VỚI 1 TEST CASE, TEST CASE VỚI N - 0 HÀM TRẢ VỀ NGON
    //TE6N HÀM MANG Ý NGHĨA TEST CASE LUÔN, ĐỂ GIÚP DÂN DEV KIỂM TRA TÍNH THIẾU ĐỦ CÁC TEST CASE -> TRÁNH NGHỊCH LÍ THƯỚC TRỪ SÂU
    public static void testFactorialGivenRightArg0RunsWell() {
        int n = 0; //cho/given n = 0
        long expectedResult = 1; //hy vọng 0! ở trên sẽ là 1
        long actualValue = MathUtility.getFactorial(n); //thực tế là mấy đoán xem
        //so sánh giữa expected và actual
        System.out.println( "Expected: " + expectedResult + ", Actual: " + actualValue);
        System.out.println("status: " + (expectedResult == actualValue));
    }
}