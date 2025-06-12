package com.giaolang.mathutil.core;

public class MathUtility {

    //class này là bộ thư viện chứa các hàm toán học giống class Math trong JDK.
    //thư viện chứa hàm tính toán mà ko cần lưu trữ kết quả, chỉ trả về két quả, thì nên đc thiết kế là hàm static, ví dụ Math.sqrt() Math.abs()
    //class này tạm làm hàm tính giai thừa n!

    //n! = 1.2.3.4...n
    //0! = 1
    //20! vừa đủ kiểu long, 21! kiểu long chứa ko nổi, tràn
    //quy ước hàm này chỉ tính n từ 0...20
    //code hàm thì cx đồng thời phải kiểm thử hàm; muốn kiểm thử phải có test case!!!

    //CHUYỂN SANG TÍNH GIAI THỪA BẰNG ĐỆ QUY, GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN
    //N! = N * (N - 1)!
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            //return -1;
            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20, why is this pain??");
        }

        if (n == 0 || n == 1) {
            return 1; //early return, thoát sớm nếu có thể!!!
        }
        return n * getFactorial(n - 1);
    }
//đem lên server ra màu xanh
    //+ 1 Tối ưu ngon vì dùng pass test case
    //+ 2 Test lại thứ đã từng test rất mất công, này đã có test code


//    public static long getFactorial(int n) {
//
//        if (n < 0 || n > 20) {
//            //return -1;
//            throw new IllegalArgumentException("Invalid n. n must be between 0 and 20");
//        }
//
//        if (n == 0) {
//            return 1; //early return, thoát sớm nếu có thể!!!
//        }
//        // khỏi viết else cho code nhìn đẹp
//        //n bắt đầu từ 1...
//        //thuật toán con heo đất, nhân dồn, cộng dồn
//        long result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;  //i bị nhân dồn vào result = result * i;
//        }
//        return result;
//    }

    //> TEST CASE #1
    //> VERIFY GETFACTORIAL() WITH N = 0
    //> STEPS/PROCEDURE
    //        (1) GIVEN N WITH 0
    //        (2) CALL GETFACTORIAL(N)

    //> EXPECTED VALUE/RESULT: THE METHOD WILL RETURN 1

    //> TEST CASE #2
    //> VERIFY GETFACTORIAL() WITH N = 1
    //> STEPS/PROCEDURE
    //        (1) GIVEN N WITH 1
    //        (2) CALL GETFACTORIAL(N)

    //> EXPECTED VALUE/RESULT: THE METHOD WILL RETURN 1

    //> TEST CASE #3
    //> VERIFY GETFACTORIAL() WITH N = 5
    //> STEPS/PROCEDURE
    //        (1) GIVEN N WITH 5
    //        (2) CALL GETFACTORIAL(N)

    //> EXPECTED VALUE/RESULT: THE METHOD WILL RETURN 120

    //CÒN NHIỀU TEST CASE NỮA!!!!


}
